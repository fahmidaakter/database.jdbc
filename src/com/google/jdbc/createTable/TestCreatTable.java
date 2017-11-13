/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.jdbc.createTable;

import com.google.jdbc.connection.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author J2EE-33
 */
public class TestCreatTable {

    static Connection conn = DbConnection.getConnection("xe", "fahmida", "fahmida");

    public static void main(String[] args) {
        String sql = "CREATE TABLE studentbd "
                + "(id INTEGER not NULL, "
                + "student_name VARCHAR2(15), "
                + "PRIMARY KEY (id) )";

        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            int i = pstm.executeUpdate();
            System.out.println(i + "table has been created succesfully!");
        } catch (SQLException ex) {
            Logger.getLogger(TestCreatTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
