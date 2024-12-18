package com.example.mongospringtest.doctors.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "doctors")
public class doctorModel {
 @Id
private  int id ;
private  String name ;
private  String specialization;
}
