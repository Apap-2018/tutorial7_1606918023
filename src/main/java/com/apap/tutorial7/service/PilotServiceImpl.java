package com.apap.tutorial7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apap.tutorial7.model.PilotModel;
import com.apap.tutorial7.repository.PilotDB;

/*
 * PilotServiceImpl
 */
@Service
@Transactional
public class PilotServiceImpl implements PilotService {
	@Autowired
	private PilotDB pilotDb;
	
	@Override
	public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
		return pilotDb.findByLicenseNumber(licenseNumber);
	}
	
	@Override
	public PilotModel addPilot(PilotModel pilot) {
		pilotDb.save(pilot);
		return pilot;
	}

	@Override
	public void deletePilot(PilotModel pilot) {
		pilotDb.delete(pilot);
	}

	@Override
	public void updatePilot(long pilotId, PilotModel pilot) {
		PilotModel dataPilot = pilotDb.findById(pilotId);
		pilotDb.save(dataPilot);
	}

	@Override
	public PilotModel getPilotDetailById(long pilotId) {
		return pilotDb.findById(pilotId);
	}
}
