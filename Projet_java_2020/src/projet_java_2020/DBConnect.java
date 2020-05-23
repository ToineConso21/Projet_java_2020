/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_java_2020;

import java.sql.*;

public class DBConnect {

    private Connection con;
    private Statement st;
    private ResultSet rs;

    public DBConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/planning?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC", "root", "");
            st = con.createStatement();
            System.out.println("Connexion à la BDD réussie");
         
        } catch (Exception ex) {
            System.out.println("Error: " + ex);

        }
    }

    public void getData() {
        try {
            String query = "select * from promotion";
            rs = st.executeQuery(query);
            System.out.println("Records from Database");
            while (rs.next()) {
                String ID = rs.getString("ID");
                String NOM = rs.getString("NOM");
                System.out.println("ID: " + ID + " NOM: " + NOM);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
