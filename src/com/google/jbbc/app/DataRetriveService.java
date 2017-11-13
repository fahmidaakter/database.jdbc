/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.jbbc.app;

import com.google.jdbc.domain.Employees;
import com.google.jdbc.connection.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author J2EE-33
 */
public class DataRetriveService {

    static Connection conn = DbConnection.getConnection("xe", "fahmida", "fahmida");

    public static List<Employees> getEmployees() {
        List<Employees> list = new ArrayList();

        try {
            Employees employee;
            PreparedStatement sta = conn.prepareStatement("select * from employees");
            ResultSet rs = sta.executeQuery();
            
            while (rs.next()) {
                employee = new Employees();
                employee.setId(rs.getInt(1));
                 employee.setLastname(rs.getString(2));
                 list.add(employee);
                 
            }

        } catch (SQLException ex) {
             Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }
}
