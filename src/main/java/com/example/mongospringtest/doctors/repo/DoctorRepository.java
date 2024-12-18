package com.example.mongospringtest.doctors.repo;
import com.example.mongospringtest.doctors.model.doctorModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
public interface DoctorRepository extends MongoRepository<doctorModel, Integer> {

}