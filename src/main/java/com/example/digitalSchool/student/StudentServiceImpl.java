package com.example.digitalSchool.student;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;


    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public StudentEntity findById(Long id) {
        StudentEntity studentEntity = studentRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Student with id " + id + " is not found."
                ));

        return studentEntity;
    }

    @Override
    public StudentEntity save(StudentEntity studentEntity) {

        return studentRepository.save(studentEntity);
    }

    @Override
    public List<StudentEntity> findAll() {

        return studentRepository.findAll();
    }

}
    
