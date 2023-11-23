package com.example.CollegeManagement.service;

import com.example.CollegeManagement.model.MarkDto;
import com.example.CollegeManagement.model.Marks;
import com.example.CollegeManagement.repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MarksService {
  @Autowired
  private MarksRepository marksRepository;

  // In your service class
  public List<MarkDto> getFirst10Marks() {
    List<Marks> first10Marks = marksRepository.findTop10ByOrderByStudentNameAsc();
    return convertToDtoList(first10Marks);
  }

  private List<MarkDto> convertToDtoList(List<Marks> marks) {
    return marks.stream()
      .map(mark -> new MarkDto(
        mark.getId(),
        mark.getStudent().getId(),
        mark.getStudent().getName(), // Include student name
        mark.getTeacher().getId(),
        mark.getTeacher().getTeacherName(), // Include teacher name
        mark.getSubject(),
        mark.getMarks()))
      .collect(Collectors.toList());
  }

}
