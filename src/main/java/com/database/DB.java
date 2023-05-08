/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author USER-PC
 */
public class DB {
    public static Connection con=null;
    
    public static void loadConnection(){
        String url= "jdbc:mysql://localhost:4306/crud";
        String root="root";
        String pass="";
        
        con=null;
        try{
            con=DriverManager.getConnection(url,root,pass);
            
            if(con!=null){
                JOptionPane.showMessageDialog(null,"Database has been sucessfully connected ");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error in database loading "+e);
        }
    }
}
