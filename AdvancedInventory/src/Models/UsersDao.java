/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian Sacancela
 */
public class UsersDao {
    
    ConnectionDB cn = new ConnectionDB();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Users login(String user, String pass){
        String sql = "SELECT * FROM users WHERE user = ? AND pass = ?";
        Users us = new Users();
        try {
            con = cn.getConecctionDB();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                us.setId(rs.getInt("id"));
                us.setUser(rs.getString("user"));
                us.setName(rs.getString("name"));
                us.setCash(rs.getString("cash"));
                us.setRol(rs.getString("rol"));
                us.setStatus(rs.getString("status"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return us;
    }
    
}
