package com.example.mongospringtest.doctors.server;
import com.example.mongospringtest.doctors.model.doctorModel;
import com.example.mongospringtest.doctors.repo.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoctorService {
    @Autowired
  private final DoctorRepository doctorRepository ;
    public DoctorService(DoctorRepository doctorRepository)
    {
        this.doctorRepository = doctorRepository;
    }
    // 1 sava
    public doctorModel savaDoctor(doctorModel doctorModel){

        return  doctorRepository.save(doctorModel);
    }
    // get all doctor
    public List<doctorModel> getAllDoctors(){
        return  doctorRepository.findAll();
    }


}
