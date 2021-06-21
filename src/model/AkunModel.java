/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connector.Connector;
import controller.ControllerMasuk;

/**
 *
 * @author User
 */
public class AkunModel {
    public String id, role;
    public void insert (String nama, String email, String username, String password, String role ){
        Connector konek = new Connector();
        
        try{
            String query = "INSERT INTO `akun`(`nama`, `email`, `username`, `password`, `role`) VALUES ('"+nama+"','"+email+"','"+username+"','"+password+"','"+role+"')";
            konek.statement = konek.koneksi.createStatement();
            konek.statement.executeUpdate(query);
        }
        catch (java.sql.SQLException e){
        }
    }

    public void cekakun (String username, String password) {
        Connector konek = new Connector();
        ControllerMasuk masuk = new ControllerMasuk();
        try{
            String query = "SELECT * FROM `akun` WHERE username ='"+username+"' AND password='"+password+"'";
            konek.statement = konek.koneksi.createStatement();
            konek.resultSet = konek.statement.executeQuery(query);
            
            while(konek.resultSet.next()){
                id = konek.resultSet.getString("id");
                role = konek.resultSet.getString("role");
            }
            masuk.derajat(id, role);
            
        }
        catch(java.sql.SQLException e){
        }   
    }

    public void update(String nama, String email, String username, String password, String role){
        Connector konek = new Connector();
        
        try {
            konek.statement = konek.koneksi.createStatement();
            konek.statement.executeUpdate("UPDATE akun set " 
            + "nama='"       + nama  + "', "
            + "email='"      + email + "', "
            + "username='"   + username + "', "
            + "password='"   + password + "', "
            + "role='"       + role + "'");
        
        
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
    private void While(boolean next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
