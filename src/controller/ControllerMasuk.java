/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.AkunModel;
import view.AdminPage;
import view.MasukPage;
import view.UserPage;
import view.WelcomePage;

/**
 *
 * @author User
 */
public class ControllerMasuk extends Controller {

    @Override
    public void view() {
        new MasukPage().show();
    }
   
    @Override
    void index() { 
    }
    
    public void kembali(){
        new WelcomePage().show();
    }
    
    public void login(String username, String password){
        AkunModel akun = new AkunModel();
        akun.cekakun(username, password);    
    }
    
    public void derajat(String id, String role){
        
        if ("admin".equals(role)){
            new AdminPage().show();
        }else{
            new UserPage().show();
        }
    }
    


    
}
