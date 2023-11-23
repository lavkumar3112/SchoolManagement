package com.example.CollegeManagement.controller;

import com.example.CollegeManagement.model.Student;
import com.example.CollegeManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
  @Autowired
  private StudentService studentService;

  @GetMapping()
  public List<Student> getAllStudents(){
    return studentService.getAllStudent();
  }
  @GetMapping("/{id}")
  public Student getStudentById(@PathVariable Long id){
    return studentService.getStudentById(id);
  }
  @PostMapping
  public Student saveStudent(@RequestBody Student student){
    return studentService.saveStudent(student);
  }

  @DeleteMapping("/{id}")
  public void deleteStudent(@PathVariable Long id){
    studentService.deleteStudent(id);
  }
}
