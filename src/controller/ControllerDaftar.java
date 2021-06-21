/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.AkunModel;
import view.DaftarPage;
import view.WelcomePage;

/**
 *
 * @author User
 */
public class ControllerDaftar extends Controller {

    @Override
    public void view() {
        new DaftarPage().show();
    }
    
    @Override
    void index() {
        
    }
    //unutk mengambil nilai yang diinputkan user dari layout daftarpage
    public void signup(String nama, String email, String username, String password, String role ) {
        AkunModel akun = new AkunModel();
        akun.insert( nama,  email,  username,  password,  role ); //mengirim nilai tersebut ke proses insert dalam database
    }
    
    public void kembali(){
        new WelcomePage().show();
    }
    
    public void login(String username, String password){
        AkunModel akun = new AkunModel();
        akun.cekakun(username, password);
    }
    
}
