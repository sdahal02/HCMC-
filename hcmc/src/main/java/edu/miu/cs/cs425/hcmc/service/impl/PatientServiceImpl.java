package edu.miu.cs.cs425.hcmc.service.impl;

import edu.miu.cs.cs425.hcmc.model.Patient;
import edu.miu.cs.cs425.hcmc.repository.PatientRepository;
import edu.miu.cs.cs425.hcmc.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;


    @Override
    public List<Patient> getAllPatientsSorted() {
        return patientRepository.findAll(Sort.by(Sort.Direction.ASC, "fullName"));
    }
}
