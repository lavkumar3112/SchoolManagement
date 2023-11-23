package com.example.CollegeManagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "marks")
public class Marks {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "student_id")
  private Student student;

  @ManyToOne
  @JoinColumn(name = "teacher_id")
  private Teacher teacher;

  private String subject;
  private int marks;

  public Marks(){}

  public Marks(Student student, Teacher teacher, String subject, int marks) {
    this.student = student;
    this.teacher = teacher;
    this.subject = subject;
    this.marks = marks;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Teacher getTeacher() {
    return teacher;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public int getMarks() {
    return marks;
  }

  public void setMarks(int marks) {
    this.marks = marks;
  }

  // getters and setters
}
