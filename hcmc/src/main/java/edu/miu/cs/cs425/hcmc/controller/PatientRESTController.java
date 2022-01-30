package edu.miu.cs.cs425.hcmc.controller;


import edu.miu.cs.cs425.hcmc.model.Patient;
import edu.miu.cs.cs425.hcmc.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
@RequestMapping (value = "/hcmcweb/api/patient")
public class PatientRESTController {
    @Autowired
    private PatientService patientService;

    @GetMapping(value = "/list")
    public List<Patient> displayAllPatients(){
        return patientService.getAllPatientsSorted();

    }
}
