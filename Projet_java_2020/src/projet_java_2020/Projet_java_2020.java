/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_java_2020;

import java.sql.*;

/**
 *
 * @author antoi
 */
public class Projet_java_2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBConnect connect = new DBConnect();
        connect.getData();
    }

}
