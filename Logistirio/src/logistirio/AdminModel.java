/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logistirio;

/**
 *
 * @author kmanolatos
 */
public class AdminModel {

    public String user = "";
    public String pass = "";
    public String phoneNumber = "";
    public String key = "";

    public AdminModel(String user, String pass, String phoneNumber, String key) {
        this.user = user;
        this.pass = pass;
        this.phoneNumber = phoneNumber;
        this.key = key;
    }

    AdminModel() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
