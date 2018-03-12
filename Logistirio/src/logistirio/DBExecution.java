/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logistirio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Kostas
 */
public class DBExecution {

    DBExecution() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int CheckAdminPass(String pass) throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby:logistiriodb;create=true");
        Statement stmnt = conn.createStatement();
        SelectUpsertDelete select = new SelectUpsertDelete();
        int found = select.CheckAdminPass(conn, stmnt, pass);
        return found;
    }

    public AdminModel GetAdminPass() throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby:logistiriodb;create=true");
        Statement stmnt = conn.createStatement();
        SelectUpsertDelete select = new SelectUpsertDelete();
        AdminModel model = select.GetAdminPass(conn, stmnt);
        return model;
    }

    public long GetCustomersMaxId() throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby:logistiriodb;create=true");
        Statement stmnt = conn.createStatement();
        SelectUpsertDelete select = new SelectUpsertDelete();
        long maxId = select.GetCustomersMaxId(conn, stmnt);
        return maxId;
    }

    public int GetMaxYear(long id) throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby:logistiriodb;create=true");
        Statement stmnt = conn.createStatement();
        SelectUpsertDelete select = new SelectUpsertDelete();
        int maxYear = select.GetMaxYear(conn, stmnt, id);
        return maxYear;
    }

    public ArrayList<Long> SelectCustomersId(String sql) throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby:logistiriodb;create=true");
        Statement stmnt = conn.createStatement();
        SelectUpsertDelete select = new SelectUpsertDelete();
        ArrayList<Long> id = select.GetCustomersId(conn, stmnt, sql);
        return id;
    }

    public ArrayList<CustomerModel> SelectCustomersData(String sql) throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby:logistiriodb;create=true");
        Statement stmnt = conn.createStatement();
        SelectUpsertDelete select = new SelectUpsertDelete();
        ArrayList<CustomerModel> model = select.GetCustomersData(conn, stmnt, sql);
        return model;
    }

    public ArrayList<CustomerDeptModel> SelectCustomersDebtAnalytical(String sql) throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby:logistiriodb;create=true");
        Statement stmnt = conn.createStatement();
        SelectUpsertDelete select = new SelectUpsertDelete();
        ArrayList<CustomerDeptModel> model = select.GetCustomersDebtAnalytical(conn, stmnt, sql);
        return model;
    }

    public void UpdateCustomersNewDebt(CustomerModel model, double debt, String reason) throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby:logistiriodb;create=true");
        Statement stmnt = conn.createStatement();
        SelectUpsertDelete select = new SelectUpsertDelete();
        select.UpdateCustomersNewDebt(conn, stmnt, model, debt, reason);
    }

    public void UpdateCustomersNewDebtByYear(double totalDebt, long id) throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby:logistiriodb;create=true");
        Statement stmnt = conn.createStatement();
        SelectUpsertDelete select = new SelectUpsertDelete();
        select.UpdateCustomersNewDebtByYear(conn, stmnt, totalDebt, id);
    }

    public ArrayList<CustomerDeptModel> SelectCustomersDebtByYear(String sql) throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby:logistiriodb;create=true");
        Statement stmnt = conn.createStatement();
        SelectUpsertDelete select = new SelectUpsertDelete();
        ArrayList<CustomerDeptModel> model = select.GetCustomersDebtByYear(conn, stmnt, sql);
        return model;
    }

    public void UpsertOrDelete(String sql) throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby:logistiriodb;create=true");
        Statement stmnt = conn.createStatement();
        SelectUpsertDelete upsertOrDelete = new SelectUpsertDelete();
        upsertOrDelete.UpsertOrDeleteCustomersData(conn, stmnt, sql);
    }
}
