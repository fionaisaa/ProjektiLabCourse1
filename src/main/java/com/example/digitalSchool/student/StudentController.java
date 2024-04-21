package com.example.digitalSchool.student;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {

    
    private StudentService studentService;

    
    
    public StudentController(final StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "students/{id}")
    public StudentEntity getStudentById(@PathVariable (name = "id") Long id){

        return studentService.findById(id);
    }

    @GetMapping(path = "/students")
    public String getStudentName() {
            return studentService.findAll().toString();
    }

    @PostMapping(path = "/students")
    @ResponseStatus(HttpStatus.CREATED)
    public StudentEntity createStudent(@RequestBody StudentEntity studentEntity){

        return studentService.save(studentEntity);
    }
     @GetMapping(path = "/students")
    public  Page<StudentEntity> findAll(Pageable pageable){

        return studentService.findAll(pageable);
    }

    @DeleteMapping(path = "/students")
    public void deleteAllStudents(){

    }
}
    

