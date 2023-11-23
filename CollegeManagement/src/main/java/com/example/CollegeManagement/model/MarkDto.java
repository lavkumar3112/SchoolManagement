package com.example.CollegeManagement.model;
public class MarkDto {
  private Long id;
  private Long studentId;
  private String studentName;
  private Long teacherId;
  private String teacherName;
  private String subject;
  private int marks;

  // Constructor
  public MarkDto(Long id, Long studentId, String studentName, Long teacherId, String teacherName, String subject, int marks) {
    this.id = id;
    this.studentId = studentId;
    this.studentName = studentName;
    this.teacherId = teacherId;
    this.teacherName = teacherName;
    this.subject = subject;
    this.marks = marks;
  }

  // Getters and setters
}
