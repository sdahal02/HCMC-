package edu.miu.cs.cs425.hcmc.controller;

import edu.miu.cs.cs425.hcmc.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/hcmcweb/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping (value = "/list")
    public ModelAndView displayAllPatients(){
        var modelAndView = new ModelAndView();
        modelAndView.addObject("patients", patientService.getAllPatientsSorted());
        modelAndView.setViewName("patient/list");
        return modelAndView;
    }
}
