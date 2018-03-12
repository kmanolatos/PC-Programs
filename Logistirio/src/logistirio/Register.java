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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kmanolatos
 */
public class Register extends javax.swing.JFrame {

    char[] phoneValue = {};
    int username = 0, password = 0, phone = 0, key = 0;

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameLabel = new javax.swing.JLabel();
        confirmPasswordLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        keyLabel = new javax.swing.JLabel();
        keyText = new javax.swing.JTextField();
        phoneNumberText = new javax.swing.JTextField();
        usernameText = new javax.swing.JTextField();
        confirmPasswordText = new javax.swing.JPasswordField();
        passwordText = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Εγγραφή Χρήστη");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usernameLabel.setText("* Username :");
        getContentPane().add(usernameLabel);
        usernameLabel.setBounds(40, 60, 170, 22);

        confirmPasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        confirmPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        confirmPasswordLabel.setText("* Επιβεβαίωση Password  :");
        getContentPane().add(confirmPasswordLabel);
        confirmPasswordLabel.setBounds(0, 200, 270, 22);

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwordLabel.setText("* Password  :");
        getContentPane().add(passwordLabel);
        passwordLabel.setBounds(10, 140, 150, 22);

        phoneNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        phoneNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phoneNumberLabel.setText("* Τηλέφωνο :");
        getContentPane().add(phoneNumberLabel);
        phoneNumberLabel.setBounds(20, 100, 150, 22);

        keyLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        keyLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        keyLabel.setText("* Λέξη - Κλειδί :");
        getContentPane().add(keyLabel);
        keyLabel.setBounds(50, 270, 200, 22);

        keyText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                keyTextKeyReleased(evt);
            }
        });
        getContentPane().add(keyText);
        keyText.setBounds(260, 270, 150, 20);

        phoneNumberText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneNumberTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneNumberTextKeyReleased(evt);
            }
        });
        getContentPane().add(phoneNumberText);
        phoneNumberText.setBounds(190, 100, 120, 20);

        usernameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameTextKeyReleased(evt);
            }
        });
        getContentPane().add(usernameText);
        usernameText.setBounds(230, 60, 120, 20);

        confirmPasswordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                confirmPasswordTextKeyReleased(evt);
            }
        });
        getContentPane().add(confirmPasswordText);
        confirmPasswordText.setBounds(280, 200, 111, 20);

        passwordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordTextKeyReleased(evt);
            }
        });
        getContentPane().add(passwordText);
        passwordText.setBounds(190, 140, 100, 20);

        registerButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registerButton.setText("Εγγραφή");
        registerButton.setEnabled(false);
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                registerButtonMouseReleased(evt);
            }
        });
        getContentPane().add(registerButton);
        registerButton.setBounds(530, 250, 100, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        getContentPane().setBackground(Color.GRAY);
        usernameLabel.setVisible(false);
        usernameText.setVisible(false);
        passwordLabel.setVisible(false);
        passwordText.setVisible(false);
        confirmPasswordLabel.setVisible(false);
        confirmPasswordText.setVisible(false);
        phoneNumberLabel.setVisible(false);
        phoneNumberText.setVisible(false);
        keyLabel.setVisible(false);
        keyText.setVisible(false);
        registerButton.setVisible(false);
        usernameLabel.setVisible(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int w = (int) screenSize.getWidth();
        int h = (int) screenSize.getHeight();
        setSize(w * 52 / 100, h * 70 / 100);
        setLocationRelativeTo(null);
        Font currentFont = usernameLabel.getFont();
        usernameLabel.setFont(currentFont.deriveFont(Font.BOLD, w * 1.2F / 100));
        usernameLabel.setSize(w * 52 / 100, h * 5 / 100);
        usernameLabel.setLocation(w * -29 / 100, h * 7 / 100);
        usernameText.setLocation(w * 25 / 100, h * 8 / 100);
        usernameText.setSize(w * 15 / 100, h * 4 / 100);
        usernameText.setFont(currentFont.deriveFont(Font.PLAIN, w * 0.8F / 100));
        passwordLabel.setFont(currentFont.deriveFont(Font.BOLD, w * 1.2F / 100));
        passwordLabel.setSize(w * 52 / 100, h * 5 / 100);
        passwordLabel.setLocation(w * -29 / 100, h * 16 / 100);
        passwordText.setLocation(w * 25 / 100, h * 17 / 100);
        passwordText.setSize(w * 15 / 100, h * 4 / 100);
        passwordText.setFont(currentFont.deriveFont(Font.PLAIN, w * 0.8F / 100));
        confirmPasswordLabel.setFont(currentFont.deriveFont(Font.BOLD, w * 1.2F / 100));
        confirmPasswordLabel.setSize(w * 52 / 100, h * 5 / 100);
        confirmPasswordLabel.setLocation(w * -29 / 100, h * 25 / 100);
        confirmPasswordText.setLocation(w * 25 / 100, h * 26 / 100);
        confirmPasswordText.setSize(w * 15 / 100, h * 4 / 100);
        confirmPasswordText.setFont(currentFont.deriveFont(Font.PLAIN, w * 0.8F / 100));
        phoneNumberLabel.setSize(w * 52 / 100, h * 5 / 100);
        phoneNumberLabel.setFont(currentFont.deriveFont(Font.BOLD, w * 1.2F / 100));
        phoneNumberLabel.setLocation(w * -29 / 100, h * 34 / 100);
        phoneNumberText.setLocation(w * 25 / 100, h * 35 / 100);
        phoneNumberText.setSize(w * 15 / 100, h * 4 / 100);
        phoneNumberText.setFont(currentFont.deriveFont(Font.PLAIN, w * 0.8F / 100));
        keyLabel.setFont(currentFont.deriveFont(Font.BOLD, w * 1.2F / 100));
        keyLabel.setSize(w * 52 / 100, h * 5 / 100);
        keyLabel.setLocation(w * -29 / 100, h * 43 / 100);
        keyText.setLocation(w * 25 / 100, h * 44 / 100);
        keyText.setSize(w * 15 / 100, h * 4 / 100);
        keyText.setFont(currentFont.deriveFont(Font.PLAIN, w * 0.8F / 100));
        registerButton.setFont(currentFont.deriveFont(Font.BOLD, w * 1 / 100));
        registerButton.setLocation(w * 19 / 100, h * 54 / 100);
        registerButton.setSize(w * 15 / 100, h * 5 / 100);
        usernameText.setVisible(true);
        passwordLabel.setVisible(true);
        passwordText.setVisible(true);
        confirmPasswordLabel.setVisible(true);
        confirmPasswordText.setVisible(true);
        phoneNumberLabel.setVisible(true);
        phoneNumberText.setVisible(true);
        keyLabel.setVisible(true);
        keyText.setVisible(true);
        registerButton.setVisible(true);
        usernameLabel.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void registerButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseReleased
        if (registerButton.isEnabled()) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Είστε σίγουρος πως θέλετε να κάνετε εγγραφή με τα στοιχεία που δώσατε?", "Επιβεβαίωση", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                DBExecution select = new DBExecution();
                try {
                    select.UpsertOrDelete("insert into admin values ('" + usernameText.getText() + "' ,'" + passwordText.getText() + "','" + phoneNumberText.getText() + "','" + keyText.getText() + "')");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this,
                        "Η εγγραφή έγινε με επιτυχία!");
                new Login().setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_registerButtonMouseReleased

    private void usernameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTextKeyReleased
        if (usernameText.getText().trim().isEmpty()) {
            username = 0;
        } else {
            username = 1;
        }
        enableRegisterButton();
    }//GEN-LAST:event_usernameTextKeyReleased

    private void passwordTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextKeyReleased
        if (passwordText.getText().trim().isEmpty() || !(passwordText.getText().equals(confirmPasswordText.getText()))) {
            password = 0;
        } else {
            password = 1;
        }
        enableRegisterButton();
    }//GEN-LAST:event_passwordTextKeyReleased

    private void confirmPasswordTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmPasswordTextKeyReleased
        if (confirmPasswordText.getText().trim().isEmpty() || !(passwordText.getText().equals(confirmPasswordText.getText()))) {
            password = 0;
        } else {
            password = 1;
        }
        enableRegisterButton();
    }//GEN-LAST:event_confirmPasswordTextKeyReleased

    private void keyTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyTextKeyReleased
        if (keyText.getText().trim().isEmpty()) {
            key = 0;
        } else {
            key = 1;
        }
        enableRegisterButton();
    }//GEN-LAST:event_keyTextKeyReleased

    private void phoneNumberTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberTextKeyPressed
        phoneValue = phoneNumberText.getText().toCharArray();
        if (phoneValue.length == 11 && phoneValue.length > 0 && evt.getKeyCode() != 8) {
            phoneValue[phoneValue.length - 1] = ' ';
        }
        phoneNumberText.setText(String.valueOf(phoneValue).trim().replaceAll("[^0-9]+", ""));
        if (phoneNumberText.getText().trim().isEmpty() || phoneNumberText.getText().length() < 10) {
            phone = 0;
        } else {
            phone = 1;
        }
    }//GEN-LAST:event_phoneNumberTextKeyPressed

    private void phoneNumberTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberTextKeyReleased
        phoneValue = phoneNumberText.getText().toCharArray();
        if (phoneValue.length == 11 && evt.getKeyCode() != 8) {
            phoneValue[phoneValue.length - 1] = ' ';
        }
        phoneNumberText.setText(String.valueOf(phoneValue).trim().replaceAll("[^0-9]+", ""));
        if (phoneNumberText.getText().trim().isEmpty() || phoneNumberText.getText().length() < 10) {
            phone = 0;
        } else {
            phone = 1;
        }
        enableRegisterButton();
    }//GEN-LAST:event_phoneNumberTextKeyReleased

    public void enableRegisterButton() {
        if (username == 1 && password == 1 && phone == 1 && key == 1) {
            registerButton.setEnabled(true);
        } else {
            registerButton.setEnabled(false);
        }
    }

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
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPasswordField confirmPasswordText;
    private javax.swing.JLabel keyLabel;
    private javax.swing.JTextField keyText;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
