/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package week3;

import java.awt.Component;
import java.awt.ComponentOrientation;
import javax.swing.JOptionPane;

/**
 *
 * @author Yavuuz
 */
public class AddWithoutButton extends javax.swing.JFrame {
    private int firstValue1;
    private int firstValue2;
    /**
     * Creates new form ToplaButonsuz
     */
    public AddWithoutButton() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Add Without Button");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_num1 = new javax.swing.JTextField();
        txt_num2 = new javax.swing.JTextField();
        txt_result = new javax.swing.JTextField();
        lbl_num1 = new javax.swing.JLabel();
        lbl_num2 = new javax.swing.JLabel();
        lbl_sonuc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        txt_num1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_num1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_num1FocusLost(evt);
            }
        });

        txt_num2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_num2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_num2FocusLost(evt);
            }
        });

        lbl_num1.setText("Num 1");

        lbl_num2.setText("Num 2");

        lbl_sonuc.setText("Result");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_num1)
                    .addComponent(lbl_num2)
                    .addComponent(lbl_sonuc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_result, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_num1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_num2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_sonuc))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_num1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_num1FocusGained
        firstValue1 = Integer.parseInt(txt_num1.getText());
    }//GEN-LAST:event_txt_num1FocusGained

    private void txt_num1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_num1FocusLost
        try
        {
            if(firstValue1 != Integer.parseInt(txt_num1.getText()))
                JOptionPane.showMessageDialog(null, "Value has changed!", "Info", JOptionPane.INFORMATION_MESSAGE);
            txt_num2.requestFocus();
        }
        catch(NumberFormatException e)
        {
            if(txt_num1.getText().equals(""))
                JOptionPane.showMessageDialog(null, "This field can not be empty!", "Warning!", JOptionPane.WARNING_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "Enter integer!", "Warning!", JOptionPane.WARNING_MESSAGE);
            txt_num1.requestFocus();
        }
    }//GEN-LAST:event_txt_num1FocusLost

    private void txt_num2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_num2FocusGained
        firstValue2 = Integer.parseInt(txt_num2.getText());
    }//GEN-LAST:event_txt_num2FocusGained

    private void txt_num2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_num2FocusLost
        try
        {
            if(firstValue2 != Integer.parseInt(txt_num2.getText()))
                JOptionPane.showMessageDialog(null, "Value has changed!", "Info", JOptionPane.INFORMATION_MESSAGE);
            txt_result.setText(String.valueOf(Integer.parseInt(txt_num1.getText()) + Integer.parseInt(txt_num2.getText())));
        }
        catch(NumberFormatException e)
        {
            if(txt_num2.getText().equals(""))
                JOptionPane.showMessageDialog(null, "This field can not be empty!", "Warning!", JOptionPane.WARNING_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "Enter integer!", "Warning!", JOptionPane.WARNING_MESSAGE);
            txt_num2.requestFocus();
        }
    }//GEN-LAST:event_txt_num2FocusLost

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        this.requestFocus();
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(AddWithoutButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddWithoutButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddWithoutButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddWithoutButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddWithoutButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_num1;
    private javax.swing.JLabel lbl_num2;
    private javax.swing.JLabel lbl_sonuc;
    private javax.swing.JTextField txt_num1;
    private javax.swing.JTextField txt_num2;
    private javax.swing.JTextField txt_result;
    // End of variables declaration//GEN-END:variables
}
