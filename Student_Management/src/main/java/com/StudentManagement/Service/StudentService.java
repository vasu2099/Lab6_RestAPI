package com.StudentManagement.Service;

import com.StudentManagement.Exception.StudentException;
import com.StudentManagement.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {

    public List<Student> findAll();

    public Student findById(int theId) throws StudentException;

    public Student save(Student thestudent);

    public void deleteById(int theId);

}
