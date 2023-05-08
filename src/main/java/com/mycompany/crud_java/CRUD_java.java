/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.crud_java;

import com.database.DB;
import com.login.Login;

/**
 *
 * @author USER-PC
 */
public class CRUD_java {

    public static void main(String[] args) {
        Login myLogin=new Login();
        myLogin.show();
        
        DB.loadConnection();
    }
}
