package com.apap.tutorial7.service;

import com.apap.tutorial7.model.PilotModel;

/*
 * PilotService
 */
public interface PilotService {
	PilotModel getPilotDetailByLicenseNumber(String licenseNumber);
	PilotModel getPilotDetailById(long pilotId);
	PilotModel addPilot(PilotModel pilot);
	void deletePilot(PilotModel pilot);
	void updatePilot(long pilotId, PilotModel pilot);
}