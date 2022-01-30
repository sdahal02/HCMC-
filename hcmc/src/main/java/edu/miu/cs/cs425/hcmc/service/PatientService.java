package edu.miu.cs.cs425.hcmc.service;

import edu.miu.cs.cs425.hcmc.model.Patient;

import java.util.List;

public interface PatientService {
    public abstract List<Patient> getAllPatientsSorted();
}
