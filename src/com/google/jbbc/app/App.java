/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.jbbc.app;

import com.google.jdbc.domain.Employees;
import java.util.List;

/**
 *
 * @author J2EE-33
 */
public class App {
    public static void main(String[] args) {
        List<Employees> empList = DataRetriveService.getEmployees(); 
        for(Employees e : empList){
            System.out.println("ID: "+e.getId()+"Name:"+e.getLastname());
        }
    }
}
