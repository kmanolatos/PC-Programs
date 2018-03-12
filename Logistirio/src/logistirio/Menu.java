/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logistirio;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;

/**
 *
 * @author Kostas
 */
public class Menu extends javax.swing.JFrame {

    ArrayList<CustomerModel> model;

    /**
     * Creates new form Menu
     */
    public Menu(ArrayList<CustomerModel> model) {
        this.model = model;
        initComponents();
    }

    Menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insertCustomerButton = new javax.swing.JButton();
        searchCustomerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        insertCustomerButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        insertCustomerButton.setText("Καταχώρηση Πελάτη");
        insertCustomerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                insertCustomerButtonMouseReleased(evt);
            }
        });
        getContentPane().add(insertCustomerButton);
        insertCustomerButton.setBounds(75, 75, 260, 44);

        searchCustomerButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchCustomerButton.setText("Αναζήτηση - Διαχείρηση Πελατών");
        searchCustomerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchCustomerButtonMouseReleased(evt);
            }
        });
        getContentPane().add(searchCustomerButton);
        searchCustomerButton.setBounds(50, 170, 270, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertCustomerButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertCustomerButtonMouseReleased
        new UpsertCustomerData("insert", null, model).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_insertCustomerButtonMouseReleased

    private void searchCustomerButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchCustomerButtonMouseReleased
        new SearchCustomer(model).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_searchCustomerButtonMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        getContentPane().setBackground(Color.GRAY);
        insertCustomerButton.setVisible(false);
        searchCustomerButton.setVisible(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int w = (int) screenSize.getWidth();
        int h = (int) screenSize.getHeight();
        setSize(w * 46 / 100, h * 42 / 100);
        setLocationRelativeTo(null);
        Font currentFont = insertCustomerButton.getFont();
        insertCustomerButton.setFont(currentFont.deriveFont(Font.BOLD, w * 0.9F / 100));
        insertCustomerButton.setSize(w * 23 / 100, h * 8 / 100);
        insertCustomerButton.setLocation(w * 11 / 100, h * 7 / 100);
        searchCustomerButton.setFont(currentFont.deriveFont(Font.BOLD, w * 0.9F / 100));
        searchCustomerButton.setSize(w * 23 / 100, h * 8 / 100);
        searchCustomerButton.setLocation(w * 11 / 100, h * 22 / 100);
        insertCustomerButton.setVisible(true);
        searchCustomerButton.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertCustomerButton;
    private javax.swing.JButton searchCustomerButton;
    // End of variables declaration//GEN-END:variables
}