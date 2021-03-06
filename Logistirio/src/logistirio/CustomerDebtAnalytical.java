/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logistirio;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kmanolatos
 */
public class CustomerDebtAnalytical extends javax.swing.JFrame {

    Vector row;
    ArrayList<CustomerModel> model;
    CustomerModel customerModel;

    /**
     * Creates new form CustomerDebtAnalytical
     */

    public CustomerDebtAnalytical(ArrayList<CustomerModel> model, CustomerModel customerModel) {
        this.model = model;
        this.customerModel = customerModel;
        setTitle("Ανάλυση Οφειλών Έτους" + " " + Calendar.getInstance().get(Calendar.YEAR));
        initComponents();
    }

    private CustomerDebtAnalytical() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerDebtScrollPane = new javax.swing.JScrollPane();
        customerDebtTable = new javax.swing.JTable();
        backArrowLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        customerDebtTable.setBackground(new java.awt.Color(204, 204, 204));
        customerDebtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        customerDebtScrollPane.setViewportView(customerDebtTable);

        getContentPane().add(customerDebtScrollPane);
        customerDebtScrollPane.setBounds(90, 11, 452, 402);

        backArrowLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backArrowLabelMouseReleased(evt);
            }
        });
        getContentPane().add(backArrowLabel);
        backArrowLabel.setBounds(630, 250, 90, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        getContentPane().setBackground(Color.GRAY);
        try {
            customerDebtScrollPane.setVisible(false);
            backArrowLabel.setVisible(false);
            NumberFormat numberFormatter = new DecimalFormat("###,###.##");
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int w = (int) screenSize.getWidth();
            int h = (int) screenSize.getHeight();
            setSize(w * 90 / 100, h * 80 / 100);
            setLocationRelativeTo(null);
            BufferedImage img = null;
            setLocationRelativeTo(null);
            URL urlToImage = getClass().getResource("/img/backArrow.png");
            try {
                img = ImageIO.read(urlToImage);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Image dimg = img.getScaledInstance(w * 4 / 100, h * 2 / 100, Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            backArrowLabel.setIcon(imageIcon);
            backArrowLabel.setLocation(w * 3 / 100, h * 3 / 100);
            backArrowLabel.setSize(w * 4 / 100, h * 2 / 100);
            DefaultTableModel tableModel = (DefaultTableModel) customerDebtTable.getModel();
            tableModel.addColumn("Επώνυμο");
            tableModel.addColumn("Όνομα");
            tableModel.addColumn("Αιτιολογία");
            tableModel.addColumn("Χρέος");
            tableModel.addColumn("Πίστωση");
            tableModel.addColumn("Υπόλοιπο");
            tableModel.addColumn("Ημερομηνία");
            customerDebtTable.setRowHeight(h * 5 / 100);
            customerDebtTable.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 18));
            customerDebtTable.setShowGrid(true);
            customerDebtScrollPane.setLocation(w * 1 / 100, h * 10 / 100);
            customerDebtScrollPane.setSize(w * 88 / 100, h * 65 / 100);
            ArrayList<CustomerDeptModel> itemModel;
            DBExecution select = new DBExecution();
            itemModel = select.SelectCustomersDebtAnalytical("select date, reason, xreosi, pistosi, ipolipo from customersDebtAnalytical where id = " + customerModel.id);
            for (CustomerDeptModel item : itemModel) {
                row = new Vector();
                row.add(customerModel.customerSurname);
                row.add(customerModel.customerName);
                row.add(item.reason);
                row.add(numberFormatter.format(item.xreosi));
                row.add(numberFormatter.format(item.pistosi));
                row.add(numberFormatter.format(item.ipolipo));
                row.add(item.date);
                tableModel.addRow(row);
            }
            customerDebtScrollPane.setVisible(true);
            backArrowLabel.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerDebtAnalytical.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDebtAnalytical.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void backArrowLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backArrowLabelMouseReleased
        new SearchCustomer(model).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backArrowLabelMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerDebtAnalytical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDebtAnalytical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDebtAnalytical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDebtAnalytical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDebtAnalytical().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backArrowLabel;
    private javax.swing.JScrollPane customerDebtScrollPane;
    private javax.swing.JTable customerDebtTable;
    // End of variables declaration//GEN-END:variables
}
