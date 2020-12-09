package com.example.demo.entity;

//import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bugdetails")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
public class BugDetail {

 @Id
 int id;
String summary;
String description;
String project;
String priority;
String assignedTo;



}
