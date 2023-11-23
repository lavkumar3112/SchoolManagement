package com.example.CollegeManagement.controller;

import com.example.CollegeManagement.model.Student;
import com.example.CollegeManagement.model.Teacher;
import com.example.CollegeManagement.service.StudentService;
import com.example.CollegeManagement.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {
  @Autowired
  private TeacherService teacherService;

  @GetMapping
  public List<Teacher> getAllTeachers(){
    return teacherService.getAllTeacher();
  }
  @GetMapping("/{id}")
  public Teacher getTeacherById(@PathVariable Long id){
    return teacherService.getTeacherById(id);
  }
  @PostMapping
  public Teacher saveTeacher(@RequestBody Teacher teacher){
    return teacherService.saveTeacher(teacher);
  }

  @DeleteMapping("/{id}")
  public void deleteTeacher(@PathVariable Long id){
    teacherService.deleteTeacher(id);
  }
}
