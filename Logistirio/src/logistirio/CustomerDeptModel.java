/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logistirio;

/**
 *
 * @author Kostas
 */
public class CustomerDeptModel {

    public long id = 0;
    public String date = "";
    public String reason = "";
    public double xreosi;
    public double pistosi;
    public double ipolipo;
    public int year;
    
    public CustomerDeptModel(long id, String date, String reason, double xreosi, double pistosi, double ipolipo, int year) {
        this.id = id;
        this.date = date;
        this.reason = reason;
        this.xreosi = xreosi;
        this.pistosi = pistosi;
        this.ipolipo = ipolipo;
        this.year = year;
    }

    CustomerDeptModel() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
