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
public class CustomerModel {
    public long id = 0 ;
    public String customerName ="";
    public String customerSurname ="";
    public String customerHomePhone ="";
    public String customerMobilePhone= "";
    public double customerDebt;
    public int currentYear;
    
    public CustomerModel(long id, String name, String surname, String homePhone, String mobilePhone, double customerDebt, int currentYear)
    {
        this.id = id;
        this.customerName = name;
        this.customerSurname = surname;
        this.customerHomePhone = homePhone;
        this.customerMobilePhone = mobilePhone;
        this.customerDebt = customerDebt;
        this.currentYear = currentYear;
    }

    CustomerModel() {       
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
