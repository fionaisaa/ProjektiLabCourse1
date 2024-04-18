package org.labcourse.digitalschool1.Students;

public interface StudentService {

    StudentEntity findById(Long id);
    StudentEntity save(StudentEntity studentEntity);

}
