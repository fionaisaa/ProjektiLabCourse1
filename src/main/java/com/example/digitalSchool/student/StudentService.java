package com.example.digitalSchool.student;

import java.util.List;

public interface StudentService {

    StudentEntity findById(Long id);
    StudentEntity save(StudentEntity studentEntity);
     List<StudentEntity> findAll();
}
