package com.example.mongospringtest.doctors.controller;
import com.example.mongospringtest.doctors.model.doctorModel;
import com.example.mongospringtest.doctors.server.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation .*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    @Autowired
    private  final  DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }
    @PostMapping
        public ResponseEntity<doctorModel> createDoctor(@RequestBody doctorModel doctor) {
                 doctorModel doctorModel=   doctorService.savaDoctor(doctor);
                 return  new ResponseEntity<>(doctorModel, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<doctorModel>> getAllDoctors() {
        List<doctorModel> doctors = doctorService.getAllDoctors();
        return  new ResponseEntity<>(doctors,HttpStatus.OK);
    }
}