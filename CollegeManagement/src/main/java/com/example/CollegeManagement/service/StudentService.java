package com.example.CollegeManagement.service;

import com.example.CollegeManagement.model.Student;
import com.example.CollegeManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
  @Autowired
  private StudentRepository studentRepository;
  public List<Student> getAllStudent(){
    return studentRepository.findAll();
  }
  public Student getStudentById(Long id){
    return studentRepository.findById(id).orElse(null);
  }
  public Student saveStudent(Student student){
    return studentRepository.save(student);
  }
  public void deleteStudent(Long id){
    studentRepository.deleteById(id);
  }
}
