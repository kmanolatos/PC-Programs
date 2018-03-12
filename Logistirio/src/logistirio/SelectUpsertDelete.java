/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logistirio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Kostas
 */
public class SelectUpsertDelete {

    SelectUpsertDelete() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int CheckAdminPass(Connection conn, Statement stmnt, String pass) throws SQLException {
        ResultSet rs;
        int found = 0;
        rs = stmnt.executeQuery("select *from admin where password = '" + pass + "'");
        while (rs.next()) {
            found = 1;
        }
        stmnt.close();
        conn.close();
        return found;
    }

    public AdminModel GetAdminPass(Connection conn, Statement stmnt) throws SQLException {
        ResultSet rs;
        rs = stmnt.executeQuery("select *from admin");
        AdminModel model = new AdminModel();
        while (rs.next()) {
            model.user = rs.getString(1);
            model.pass = rs.getString(2);
            model.phoneNumber = rs.getString(3);
            model.key = rs.getString(4);
        }
        stmnt.close();
        conn.close();
        return model;
    }

    public long GetCustomersMaxId(Connection conn, Statement stmnt) throws SQLException {
        ResultSet rs;
        rs = stmnt.executeQuery("select id from customers order by id desc");
        long maxId = 0;
        while (rs.next()) {
            maxId = rs.getLong(1);
            break;
        }
        stmnt.close();
        conn.close();
        return maxId;
    }

    public int GetMaxYear(Connection conn, Statement stmnt, long id) throws SQLException {
        ResultSet rs;
        rs = stmnt.executeQuery("select debtYear from customersDebtByYear where id = " + id + " order by debtYear desc");
        int maxYear = 0;
        while (rs.next()) {
            maxYear = rs.getInt(1);
            break;
        }
        stmnt.close();
        conn.close();
        return maxYear;
    }

    public ArrayList<Long> GetCustomersId(Connection conn, Statement stmnt, String sql) throws SQLException {
        ArrayList<Long> id = new ArrayList<Long>();
        ResultSet rs;
        rs = stmnt.executeQuery(sql);
        while (rs.next()) {
            id.add(rs.getLong(1));
        }
        stmnt.close();
        conn.close();
        return id;
    }

    public ArrayList<CustomerDeptModel> GetCustomersDebtAnalytical(Connection conn, Statement stmnt, String sql) throws SQLException {
        ArrayList<CustomerDeptModel> model = new ArrayList<CustomerDeptModel>();
        ResultSet rs;
        rs = stmnt.executeQuery(sql);
        while (rs.next()) {
            CustomerDeptModel temp = new CustomerDeptModel();
            temp.date = rs.getString(1);
            temp.reason = rs.getString(2);
            temp.xreosi = rs.getDouble(3);
            temp.pistosi = rs.getDouble(4);
            temp.ipolipo = rs.getDouble(5);
            model.add(temp);
        }
        stmnt.close();
        conn.close();
        return model;
    }

    public ArrayList<CustomerDeptModel> GetCustomersDebtByYear(Connection conn, Statement stmnt, String sql) throws SQLException {
        ArrayList<CustomerDeptModel> model = new ArrayList<CustomerDeptModel>();
        ResultSet rs;
        rs = stmnt.executeQuery(sql);
        while (rs.next()) {
            CustomerDeptModel temp = new CustomerDeptModel();
            temp.date = rs.getString(1);
            temp.reason = rs.getString(2);
            temp.xreosi = rs.getDouble(3);
            temp.pistosi = rs.getDouble(4);
            temp.ipolipo = rs.getDouble(5);
            temp.year = rs.getInt(6);
            model.add(temp);
        }
        stmnt.close();
        conn.close();
        return model;
    }

    public ArrayList<CustomerModel> GetCustomersData(Connection conn, Statement stmnt, String sql) throws SQLException {
        ArrayList<CustomerModel> model = new ArrayList<CustomerModel>();
        ResultSet rs;
        rs = stmnt.executeQuery(sql);
        while (rs.next()) {
            CustomerModel temp = new CustomerModel();
            temp.id = rs.getLong(1);
            temp.customerName = rs.getString(2);
            temp.customerSurname = rs.getString(3);
            temp.customerHomePhone = rs.getString(4);
            temp.customerMobilePhone = rs.getString(5);
            temp.customerDebt = rs.getDouble(6);
            temp.currentYear = rs.getInt(7);
            model.add(temp);
        }
        stmnt.close();
        conn.close();
        return model;
    }

    public void UpdateCustomersNewDebt(Connection conn, Statement stmnt, CustomerModel model, double debt, String reason) throws SQLException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.now();
        stmnt.executeUpdate("insert into customersDebtAnalytical values (" + model.id + ", '" + dtf.format(localDate) + "', '" + reason + "', " + debt + ", 0.00, " + model.customerDebt + ")");
        stmnt.executeUpdate("update customers set total_debt = " + model.customerDebt + " where id = " + model.id);
        stmnt.close();
        conn.close();
    }

    public void UpdateCustomersNewDebtByYear(Connection conn, Statement stmnt, double totalDebt, long id) throws SQLException {
        ResultSet rs;
        rs = stmnt.executeQuery("select *from customersDebtAnalytical where id = " + id);
        int previousYear = (int) (Calendar.getInstance().get(Calendar.YEAR) - 1);
        while (rs.next()) {
            stmnt = conn.createStatement();
            stmnt.executeUpdate("insert into customersDebtByYear values (" + rs.getLong(1) + ", '" + rs.getString(2) + "', '" + rs.getString(3) + "', " + rs.getDouble(4) + ", " + rs.getDouble(5) + ", " + rs.getDouble(6) + ", " + previousYear + ")");
        }
        stmnt.executeUpdate("delete from customersDebtAnalytical where id = " + id);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.now();
        stmnt.executeUpdate("insert into customersDebtAnalytical values (" + id + ", '" + dtf.format(localDate) + "', 'ΓΡΑΦΕΙΟ', " + totalDebt + ", 0.00, " + totalDebt + ")");
        stmnt.executeUpdate("update customers set total_debt = " + totalDebt + " , currentYear = " + Calendar.getInstance().get(Calendar.YEAR) + " where id = " + id);
        stmnt.close();
        conn.close();
    }

    public void UpsertOrDeleteCustomersData(Connection conn, Statement stmnt, String sql) throws SQLException {
        stmnt.executeUpdate(sql);
        stmnt.close();
        conn.close();
    }
}
