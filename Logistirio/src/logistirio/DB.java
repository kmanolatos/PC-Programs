/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logistirio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kmanolatos
 */
public class DB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    sdfds();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            private void sdfds() throws ClassNotFoundException, SQLException {
                Connection conn = null;
                Statement stmt = null;
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                conn = DriverManager.getConnection("jdbc:derby:logistiriodb;create=true");
                stmt = conn.createStatement();
                stmt.executeUpdate("delete from admin");
                stmt.executeUpdate("drop table customersDebtAnalytical");
                stmt.executeUpdate("drop table customersDebtByYear");
                stmt.executeUpdate("drop table customers");
                stmt.executeUpdate("create table customers (id BIGINT, name varchar(100), surname varchar(100), homePhoneNumber varchar(20), mobileNumber varchar(20), total_debt decimal(31, 2), currentYear int, primary key(id))");

                stmt.executeUpdate("create table customersDebtAnalytical (id BIGINT, date varchar(10), reason varchar(10000), xreosi decimal(31, 2), pistosi decimal(31, 2), ipolipo decimal(31, 2))");
                stmt.executeUpdate("create table customersDebtByYear (id BIGINT, date varchar(10), reason varchar(10000), xreosi decimal(31, 2), pistosi decimal(31, 2), ipolipo decimal(31, 2), debtYear int)");

                stmt.close();
                conn.close();
            }
        });
    }

}
