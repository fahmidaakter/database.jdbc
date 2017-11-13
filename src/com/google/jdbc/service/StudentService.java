package com.google.jdbc.service;

import com.google.jdbc.connection.DbConnection;
import com.google.jdbc.dao.StudentDao;
import com.google.jdbc.domain.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentService implements StudentDao {

    Connection conn = DbConnection.getConnection("xe", "fahmida", "fahmida");

    @Override
    public void save(Student s) {

        try {
            if (s.getStudentName() != null) {
                PreparedStatement stmt = conn.prepareStatement("insert into studentbd(id, student_name) values(?,?)");

                stmt.setInt(1, s.getId());
                stmt.setString(2, s.getStudentName());

                int i = stmt.executeUpdate();
                System.out.println(i + " record inserted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    @Override
    public void update(Student s
    ) {
        try {
            if (s.getStudentName() != null) {
                PreparedStatement stmt = conn.prepareStatement("update studentbd set student_name=? where id=?");

                stmt.setString(1, s.getStudentName());
                stmt.setInt(2, s.getId());

                int i = stmt.executeUpdate();
                System.out.println(i + " record updated");

            }
        } catch (Exception ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void delete(int id) {
        try {
            if (id != 0) {
                PreparedStatement stmt = conn.prepareStatement("delete from studentbd where id= ?");
                stmt.setInt(1, id);
                int i = stmt.executeUpdate();
                System.out.println(i + "record deleted");

            }
        } catch (Exception ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Student> getStudents() {
        List<Student> list = new ArrayList<>();
        try {
            Student s;
            PreparedStatement stmt = conn.prepareStatement("select * from studentbd");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                s = new Student();
                s.setId(rs.getInt(1));
                s.setStudentName(rs.getString(2));
                list.add(s);
            }

        } catch (Exception ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Student getStudent(int id) {
        Student s = null;
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from studentbd where id=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                s = new Student();
                s.setId(rs.getInt(1));
                s.setStudentName(rs.getString(2));
            }

        } catch (Exception ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);

        }
        return s;
    }

}
