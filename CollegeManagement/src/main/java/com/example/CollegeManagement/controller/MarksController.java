package com.example.CollegeManagement.controller;

import com.example.CollegeManagement.model.MarkDto;
import com.example.CollegeManagement.model.Marks;
import com.example.CollegeManagement.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/marks")
public class MarksController {
  @Autowired
  private MarksService marksService;

  @GetMapping("/top10")
  public ResponseEntity<List<MarkDto>> getTop10Marks() {
    List<MarkDto> top10Marks = marksService.getTop10Marks();
    return new ResponseEntity<>(top10Marks, HttpStatus.OK);
  }


}

