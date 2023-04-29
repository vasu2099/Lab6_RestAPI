package com.StudentManagement.Service;
import com.StudentManagement.Exception.StudentException;
import com.StudentManagement.Entity.Student;
import com.studentManagement.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int theId) throws StudentException {
        Optional<Student> studentOptional=studentRepository.findById(theId);
        if(studentOptional.isPresent()){
            return studentOptional.get();
        }

        throw new StudentException("Student Details not present");
    }

    @Override
    @Transactional
    public Student save(Student thestudent) {
        return studentRepository.save(thestudent);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        studentRepository.deleteById(theId);
    }
}

