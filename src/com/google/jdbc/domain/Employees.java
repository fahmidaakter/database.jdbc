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
public class Employees {
    private  int id;
    private  String lastname;

    public Employees() {
    }

    public Employees(int id, String lastname) {
        this.id = id;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    
}
