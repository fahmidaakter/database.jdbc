/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.jdbc.service;

import com.google.jdbc.domain.Student;
import java.util.List;

/**
 *
 * @author J2EE-33
 */
public class Test {

    static StudentService studentService;

    public static void main(String[] args) {
        studentService = new StudentService();
        Student std = new Student(1003, "Firoza");
        // studentService.save(std);
        // studentService.update(std);
        //studentService.delete(1001);
        // List<Student> stList = studentService.getStudents();
        // for (Student s : stList) {
        //    System.out.println("Name:" + s.getStudentName() + "  ID: " + s.getId());
        //}
        String studentName = studentService.getStudent(1001).getStudentName();
        int id = studentService.getStudent(1001).getId();

        System.out.println("ID: " + id + "   Name:" + studentName);
    }

}
