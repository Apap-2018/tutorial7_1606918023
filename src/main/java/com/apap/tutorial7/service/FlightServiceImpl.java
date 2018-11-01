package com.apap.tutorial7.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apap.tutorial7.model.FlightModel;
import com.apap.tutorial7.model.PilotModel;
import com.apap.tutorial7.repository.FlightDB;

/*
 * PilotServiceImpl
 */
@Service
@Transactional
public class FlightServiceImpl implements FlightService {
	@Autowired
	private FlightDB flightDb;
	
	@Override
	public FlightModel addFlight(FlightModel flight) {
		flightDb.save(flight);
		return flight;
	}

	@Override
	public void deleteFlight(FlightModel flight) {
		flightDb.delete(flight);
	}

	@Override
	public void updateFlight(Long flightId, FlightModel flight) {
		FlightModel dataFlight = flightDb.findFlightById(flightId);
		flightDb.save(dataFlight);
	}

	@Override
	public FlightModel getFlightById(Long id) {
		return flightDb.getOne(id);
	}

	@Override
	public FlightModel getPilotDetailByFlightNumber(String flightNumber) {
		return flightDb.findByFlightNumber(flightNumber);
	}

	@Override
	public List<FlightModel> getListFlight() {
		return flightDb.findAll();
	}

}
