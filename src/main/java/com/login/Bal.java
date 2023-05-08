/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

import com.database.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER-PC
 */
public class Bal {
    public void insertDataSingUp(Bean myBean){
        try{
            String query = "insert into singup values(null,?,?,?)";
            PreparedStatement ps=DB.con.prepareStatement(query);
            
            ps.setString(1,myBean.getFullName());
            ps.setString(2,myBean.getUser());
            ps.setString(3,myBean.getPassword());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"You have Singup succesfully, now go login ");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e);
        }
    }
    
    public boolean checkLogin(String user, String password){
        boolean b=false;
        try{
            String query = "select User, Password from singup where User= '"+user+"' AND Password = '"+password+"'";
            Statement st =DB.con.createStatement();
            ResultSet rs= st.executeQuery(query);
            if(rs.next()){
                b=true;
            }else{
                JOptionPane.showMessageDialog(null, "Invalid user or password try again...");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e);
        }
        return b;
    }
}
