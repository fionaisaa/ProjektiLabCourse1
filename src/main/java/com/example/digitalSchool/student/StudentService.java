package com.example.digitalSchool.student;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {

    StudentEntity findById(Long id);
    StudentEntity save(StudentEntity studentEntity);
     List<StudentEntity> findAll();
    Page<StudentEntity> findAll(Pageable pageable);
}
