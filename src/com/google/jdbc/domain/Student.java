/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.jdbc.domain;

/**
 *
 * @author J2EE-33
 */
public class Student {
    private  int id;
    private String studentName;

    public Student() {
    }

    public Student(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
}
