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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author kmanolatos
 */
public class UpsertCustomerData extends javax.swing.JFrame {

    char[] homePhoneValue = {};
    char[] mobilePhoneValue = {};
    char[] debtValue = {};
    String upsert;
    ArrayList<CustomerModel> model;
    CustomerModel modelToUpdate;
    int modelSize;
    NumberFormat numberFormatter = new DecimalFormat("###,###.##");

    /**
     * Creates new form Menu
     */
    public UpsertCustomerData(String upsert, CustomerModel modelToUpdate, ArrayList<CustomerModel> model) {
        this.upsert = upsert;
        this.model = model;
        this.modelToUpdate = modelToUpdate;
        this.modelSize = model.size() + 1;
        if (upsert.equals("insert")) {
            setTitle("Καταχώρηση Πελάτη");
        } else {
            setTitle("Αλλαγή στοιχείων Πελάτη");
        }
        initComponents();
    }

    private UpsertCustomerData() {
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

        customerMobilePhoneLabel = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        customerSurnameLabel = new javax.swing.JLabel();
        customerHomePhoneLabel = new javax.swing.JLabel();
        customerMobilePhoneText = new javax.swing.JTextField();
        customerSurnameText = new javax.swing.JTextField();
        customerHomePhoneText = new javax.swing.JTextField();
        customerNameText = new javax.swing.JTextField();
        upsertCustomerButton = new javax.swing.JButton();
        backArrowLabel = new javax.swing.JLabel();
        customerDebtLabel = new javax.swing.JLabel();
        customerDebtText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        customerMobilePhoneLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customerMobilePhoneLabel.setText("Κινητό : ");
        getContentPane().add(customerMobilePhoneLabel);
        customerMobilePhoneLabel.setBounds(70, 180, 140, 22);

        customerNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customerNameLabel.setText("* Όνομα : ");
        getContentPane().add(customerNameLabel);
        customerNameLabel.setBounds(70, 90, 180, 22);

        customerSurnameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customerSurnameLabel.setText("* Επώνυμο : ");
        getContentPane().add(customerSurnameLabel);
        customerSurnameLabel.setBounds(80, 50, 160, 20);

        customerHomePhoneLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customerHomePhoneLabel.setText("Σταθερό : ");
        getContentPane().add(customerHomePhoneLabel);
        customerHomePhoneLabel.setBounds(70, 130, 160, 22);
        getContentPane().add(customerMobilePhoneText);
        customerMobilePhoneText.setBounds(210, 190, 110, 20);
        getContentPane().add(customerSurnameText);
        customerSurnameText.setBounds(230, 50, 110, 20);
        getContentPane().add(customerHomePhoneText);
        customerHomePhoneText.setBounds(220, 130, 110, 20);
        getContentPane().add(customerNameText);
        customerNameText.setBounds(230, 90, 110, 20);

        upsertCustomerButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        upsertCustomerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                upsertCustomerButtonMouseReleased(evt);
            }
        });
        getContentPane().add(upsertCustomerButton);
        upsertCustomerButton.setBounds(380, 300, 160, 40);

        backArrowLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backArrowLabelMouseReleased(evt);
            }
        });
        getContentPane().add(backArrowLabel);
        backArrowLabel.setBounds(430, 40, 80, 40);

        customerDebtLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customerDebtLabel.setText("Χρέος :");
        getContentPane().add(customerDebtLabel);
        customerDebtLabel.setBounds(70, 230, 120, 40);

        customerDebtText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        customerDebtText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                customerDebtTextKeyReleased(evt);
            }
        });
        getContentPane().add(customerDebtText);
        customerDebtText.setBounds(200, 240, 110, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        getContentPane().setBackground(Color.GRAY);
        customerNameLabel.setVisible(false);
        customerNameText.setVisible(false);
        customerSurnameLabel.setVisible(false);
        customerSurnameText.setVisible(false);
        customerHomePhoneLabel.setVisible(false);
        customerHomePhoneText.setVisible(false);
        customerMobilePhoneLabel.setVisible(false);
        customerMobilePhoneText.setVisible(false);
        upsertCustomerButton.setVisible(false);
        customerDebtLabel.setVisible(false);
        customerDebtText.setVisible(false);
        backArrowLabel.setVisible(false);
        BufferedImage img = null;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int w = (int) screenSize.getWidth();
        int h = (int) screenSize.getHeight();
        setSize(w * 49 / 100, h * 95 / 100);
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
        Font currentFont = customerNameLabel.getFont();
        customerSurnameLabel.setFont(currentFont.deriveFont(Font.BOLD, w * 2 / 100));
        customerSurnameLabel.setSize(w * 49 / 100, h * 5 / 100);
        customerSurnameLabel.setLocation(w * 18 / 100, h * 8 / 100);
        customerSurnameText.setLocation(w * 18 / 100, h * 13 / 100);
        customerSurnameText.setSize(w * 15 / 100, h * 4 / 100);
        customerSurnameText.setFont(currentFont.deriveFont(Font.PLAIN, w * 1.7F / 100));
        customerNameLabel.setFont(currentFont.deriveFont(Font.BOLD, w * 2 / 100));
        customerNameLabel.setSize(w * 49 / 100, h * 5 / 100);
        customerNameLabel.setLocation(w * 18 / 100, h * 21 / 100);
        customerNameText.setLocation(w * 18 / 100, h * 26 / 100);
        customerNameText.setSize(w * 15 / 100, h * 4 / 100);
        customerNameText.setFont(currentFont.deriveFont(Font.PLAIN, w * 1.7F / 100));
        customerHomePhoneLabel.setFont(currentFont.deriveFont(Font.BOLD, w * 2 / 100));
        customerHomePhoneLabel.setSize(w * 49 / 100, h * 5 / 100);
        customerHomePhoneLabel.setLocation(w * 18 / 100, h * 34 / 100);
        customerHomePhoneText.setLocation(w * 18 / 100, h * 39 / 100);
        customerHomePhoneText.setSize(w * 15 / 100, h * 4 / 100);
        customerHomePhoneText.setFont(currentFont.deriveFont(Font.PLAIN, w * 1.7F / 100));
        customerMobilePhoneLabel.setFont(currentFont.deriveFont(Font.BOLD, w * 2 / 100));
        customerMobilePhoneLabel.setSize(w * 49 / 100, h * 5 / 100);
        customerMobilePhoneLabel.setLocation(w * 18 / 100, h * 47 / 100);
        customerMobilePhoneText.setLocation(w * 18 / 100, h * 52 / 100);
        customerMobilePhoneText.setSize(w * 15 / 100, h * 4 / 100);
        customerMobilePhoneText.setFont(currentFont.deriveFont(Font.PLAIN, w * 1.7F / 100));
        customerDebtLabel.setFont(currentFont.deriveFont(Font.BOLD, w * 2 / 100));
        customerDebtLabel.setSize(w * 49 / 100, h * 5 / 100);
        customerDebtLabel.setLocation(w * 18 / 100, h * 60 / 100);
        customerDebtText.setLocation(w * 18 / 100, h * 65 / 100);
        customerDebtText.setSize(w * 15 / 100, h * 4 / 100);
        customerDebtText.setFont(currentFont.deriveFont(Font.PLAIN, w * 1.7F / 100));
        upsertCustomerButton.setFont(currentFont.deriveFont(Font.BOLD, w * 1 / 100));
        upsertCustomerButton.setLocation(w * 15 / 100, h * 77 / 100);
        upsertCustomerButton.setSize(w * 20 / 100, h * 6 / 100);
        if (upsert.equals("insert")) {
            upsertCustomerButton.setText("Καταχώρηση");
        } else {
            customerNameText.setText(modelToUpdate.customerName);
            customerSurnameText.setText(modelToUpdate.customerSurname);
            customerHomePhoneText.setText(modelToUpdate.customerHomePhone);
            customerMobilePhoneText.setText(modelToUpdate.customerMobilePhone);
            customerDebtText.setText(numberFormatter.format(modelToUpdate.customerDebt));
            customerDebtText.setDisabledTextColor(Color.BLACK);
            customerDebtText.setEnabled(false);
            customerDebtText.setFont(currentFont.deriveFont(Font.PLAIN, w * 2 / 100));
            upsertCustomerButton.setText("Αλλαγή στοιχείων");
        }
        customerNameLabel.setVisible(true);
        customerNameText.setVisible(true);
        customerSurnameLabel.setVisible(true);
        customerSurnameText.setVisible(true);
        customerHomePhoneLabel.setVisible(true);
        customerHomePhoneText.setVisible(true);
        customerMobilePhoneLabel.setVisible(true);
        customerMobilePhoneText.setVisible(true);
        customerDebtText.setVisible(true);
        upsertCustomerButton.setVisible(true);
        customerDebtLabel.setVisible(true);
        backArrowLabel.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void upsertCustomerButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upsertCustomerButtonMouseReleased
        if (customerNameText.getText().trim().length() == 0 || customerSurnameText.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this,
                    "Τα πεδία Όνομα, Επώνυμο πρέπει να συμπληρωθούν!",
                    "Σφάλμα",
                    JOptionPane.ERROR_MESSAGE);
        } else if ((customerHomePhoneText.getText().trim().length() != 10 && customerHomePhoneText.getText().trim().length() != 0) || (customerMobilePhoneText.getText().trim().length() != 10 && customerMobilePhoneText.getText().trim().length() != 0)) {
            JOptionPane.showMessageDialog(this,
                    "Το πεδίο Τηλέφωνο ή Κινητό πρέπει να περιέχει υπωχρεωτικά 10 ψηφία!",
                    "Σφάλμα",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            DBExecution dbUpsert = new DBExecution();
            if (upsert.equals("insert")) {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Είστε σίγουρος πως θέλετε να εισάγετε τον πελάτη με τα στοιχεία που δώσατε?", "Επιβεβαίωση", dialogButton);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    try {
                        String getCustomerDebtText = "";
                        if (customerDebtText.getText().trim().length() > 0) {
                            getCustomerDebtText = customerDebtText.getText().trim().replaceAll("[.]", "").replaceAll(",", ".");
                            if (!getCustomerDebtText.contains(".")) {
                                getCustomerDebtText = getCustomerDebtText + ".00";
                            } else if (getCustomerDebtText.indexOf(".") == getCustomerDebtText.length() - 2) {
                                getCustomerDebtText = getCustomerDebtText + "0";
                            }
                        } else {
                            getCustomerDebtText = "0.00";
                        }
                        double debt = Double.parseDouble(getCustomerDebtText);
                        dbUpsert.UpsertOrDelete("insert into customers values (" + modelSize + ", '" + customerNameText.getText().replaceAll("'", "") + "', '" + customerSurnameText.getText().replaceAll("'", "") + "', '" + customerHomePhoneText.getText() + "', '" + customerMobilePhoneText.getText() + "', " + debt + ", " + Calendar.getInstance().get(Calendar.YEAR) + ")");
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate localDate = LocalDate.now();
                        dbUpsert.UpsertOrDelete("insert into customersDebtAnalytical values (" + modelSize + ", '" + dtf.format(localDate) + "', 'ΓΡΑΦΕΙΟ', " + debt + ", 0.00, " + debt + ")");

                        CustomerModel temp = new CustomerModel();
                        temp.id = modelSize;
                        temp.customerName = customerNameText.getText();
                        temp.customerSurname = customerSurnameText.getText();
                        temp.customerHomePhone = customerHomePhoneText.getText();
                        temp.customerMobilePhone = customerMobilePhoneText.getText();
                        temp.customerDebt = debt;
                        temp.currentYear = Calendar.getInstance().get(Calendar.YEAR);
                        model.add(temp);
                        customerNameText.setText("");
                        customerSurnameText.setText("");
                        customerHomePhoneText.setText("");
                        customerMobilePhoneText.setText("");
                        customerDebtText.setText("");
                        modelSize++;
                        JOptionPane.showMessageDialog(this,
                                "Η καταχώρηση του πελάτη έγινε με επιτυχία!");
                    } catch (ClassNotFoundException ex) {
                        JOptionPane.showMessageDialog(this,
                                "Η καταχώρηση του πελάτη απέτυχε!",
                                "Σφάλμα",
                                JOptionPane.ERROR_MESSAGE);
                        Logger.getLogger(UpdateCustomerCurrentDebt.class.getName()).log(Level.SEVERE, null, ex);

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this,
                                "Η καταχώρηση του πελάτη απέτυχε!",
                                "Σφάλμα",
                                JOptionPane.ERROR_MESSAGE);
                        Logger.getLogger(UpdateCustomerCurrentDebt.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Είστε σίγουρος πως θέλετε να πραγματοποιήσετε αλλαγή στοιχείων του πελάτη με τα στοιχεία που δώσατε?", "Επιβεβαίωση", dialogButton);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    try {
                        dbUpsert.UpsertOrDelete("update customers set name = '" + customerNameText.getText().replaceAll("'", "") + "', surname = '" + customerSurnameText.getText().replaceAll("'", "") + "', homePhoneNumber = '" + customerHomePhoneText.getText() + "', mobileNumber = '" + customerMobilePhoneText.getText() + "' where id = " + modelToUpdate.id);
                        JOptionPane.showMessageDialog(this,
                                "Η αλλαγή στοιχείων του πελάτη έγινε με επιτυχία!");
                        CustomerModel temp = new CustomerModel();
                        temp.id = modelToUpdate.id;
                        temp.customerName = customerNameText.getText();
                        temp.customerSurname = customerSurnameText.getText();
                        temp.customerHomePhone = customerHomePhoneText.getText();
                        temp.customerMobilePhone = customerMobilePhoneText.getText();
                        temp.customerDebt = modelToUpdate.customerDebt;
                        temp.currentYear = modelToUpdate.currentYear;
                        model.set((int) (modelToUpdate.id - 1), temp);
                        this.dispose();
                        new SearchCustomer(model).setVisible(true);
                    } catch (ClassNotFoundException ex) {
                        JOptionPane.showMessageDialog(this,
                                "Η αλλαγή στοιχείων του πελάτη απέτυχε!",
                                "Σφάλμα",
                                JOptionPane.ERROR_MESSAGE);
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this,
                                "Η αλλαγή στοιχείων του πελάτη απέτυχε!",
                                "Σφάλμα",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_upsertCustomerButtonMouseReleased

    private void backArrowLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backArrowLabelMouseReleased
        if (upsert.equals("insert")) {
            new Menu(model).setVisible(true);
        } else {
            new SearchCustomer(model).setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_backArrowLabelMouseReleased

    private void customerDebtTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerDebtTextKeyReleased
        double customerTextDouble = 0;
        if (!((evt.getKeyCode() == 8 && customerDebtText.getText().trim().indexOf(",") == customerDebtText.getText().trim().length() - 1 && customerDebtText.getText().trim().indexOf(",") != -1) || (evt.getKeyCode() == 8 && customerDebtText.getText().trim().indexOf(",") == customerDebtText.getText().trim().length() - 2 && customerDebtText.getText().trim().indexOf("0") == customerDebtText.getText().trim().length() - 1))) {
            if (evt.getKeyCode() != 44) {
                if (customerDebtText.getText().trim().indexOf(",") == customerDebtText.getText().trim().length() - 1 && customerDebtText.getText().trim().indexOf(",") != -1) {
                    customerTextDouble = Double.valueOf(customerDebtText.getText().trim().replaceAll("[.]", "").replaceAll(",", ""));
                    customerDebtText.setText(numberFormatter.format(customerTextDouble));
                } else {
                    if (!((customerDebtText.getText().trim().indexOf(",") == customerDebtText.getText().trim().length() - 2 && evt.getKeyCode() == 48) || (customerDebtText.getText().trim().indexOf(",") == customerDebtText.getText().trim().length() - 1 && evt.getKeyCode() == 8))) {
                        if (customerDebtText.getText().trim().indexOf(",") == customerDebtText.getText().trim().length() - 1) {
                            customerDebtText.setText(customerDebtText.getText().trim().replace(",", ""));
                        }
                        if (customerDebtText.getText().trim().length() == 0) {
                        } else {
                            customerTextDouble = Double.valueOf(customerDebtText.getText().trim().replaceAll("[.]", "").replaceAll(",", "."));
                            customerDebtText.setText(numberFormatter.format(customerTextDouble));
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_customerDebtTextKeyReleased

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
            java.util.logging.Logger.getLogger(UpsertCustomerData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpsertCustomerData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpsertCustomerData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpsertCustomerData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpsertCustomerData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backArrowLabel;
    private javax.swing.JLabel customerDebtLabel;
    private javax.swing.JTextField customerDebtText;
    private javax.swing.JLabel customerHomePhoneLabel;
    private javax.swing.JTextField customerHomePhoneText;
    private javax.swing.JLabel customerMobilePhoneLabel;
    private javax.swing.JTextField customerMobilePhoneText;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JTextField customerNameText;
    private javax.swing.JLabel customerSurnameLabel;
    private javax.swing.JTextField customerSurnameText;
    private javax.swing.JButton upsertCustomerButton;
    // End of variables declaration//GEN-END:variables
}