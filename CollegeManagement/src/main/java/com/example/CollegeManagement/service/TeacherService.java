package com.example.CollegeManagement.service;


import com.example.CollegeManagement.model.Teacher;
import com.example.CollegeManagement.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
  @Autowired
  private TeacherRepository teacherRepository;
  public List<Teacher> getAllTeacher(){
    return teacherRepository.findAll();
  }
  public Teacher getTeacherById(Long id){
    return teacherRepository.findById(id).orElse(null);
  }
  public Teacher saveTeacher(Teacher teacher){
    return teacherRepository.save(teacher);
  }
  public void deleteTeacher(Long id){
    teacherRepository.deleteById(id);
  }
}
