package com.apap.tutorial7.service;

import java.util.Date;
import java.util.List;

import com.apap.tutorial7.model.FlightModel;

/*
 * FlightService
 */
public interface FlightService {
	FlightModel addFlight(FlightModel flight);
	void deleteFlight(FlightModel flight);
	void updateFlight(Long flightId, FlightModel flight);
	FlightModel getFlightById(Long id);
	FlightModel getPilotDetailByFlightNumber(String flightNumber);
	List<FlightModel> getListFlight();
}