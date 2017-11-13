package com.google.jdbc.dao;

import com.google.jdbc.domain.Student;
import java.util.List;

public interface StudentDao {

    //we shall save student object into classes
    public void save(Student s);

    //we shall update student object into according to student id into database
    public void update(Student s);

    //we shall delete student object from database according to id
    public void delete(int id);

    //we want to all rows  from database table then we will return  list of student
    public List<Student> getStudents();
    //we want a student from database table then we will return  list of student
    public Student getStudent(int id);
}
