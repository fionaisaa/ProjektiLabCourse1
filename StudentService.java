package org.labcourse.digitalschool1.Students;

import java.util.List;

public interface StudentService {

    StudentEntity findById(Long id);
    StudentEntity save(StudentEntity studentEntity);
     List<StudentEntity> findAll();
}

}
