package com.example.CollegeManagement.repository;

import com.example.CollegeManagement.model.Marks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarksRepository extends JpaRepository<Marks, Long> {
  List<Marks> findTop10ByOrderByStudentNameAsc();
}
