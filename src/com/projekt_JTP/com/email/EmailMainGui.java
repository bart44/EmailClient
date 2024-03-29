/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projekt_JTP.com.email;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Bartek
 */

public class EmailMainGui extends javax.swing.JFrame {

    /**
     * Creates new form EmailMainGui
     */
    /**
     * initialize global variables
     */
    int yMouse;
    /**
     * initialize global variables
     */
    int xMouse;
    /**
     * initialize global variables
     */
    public String attachment;

    public String getAttachment() {
        return attachment;
    }

    LaunchBrowser LB = new LaunchBrowser();
    
     /**
      * initializing components for our GUI
      */
    public EmailMainGui() {
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

        MoveLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ToEmail = new javax.swing.JTextField();
        CCEmail = new javax.swing.JTextField();
        Close = new javax.swing.JLabel();
        Send = new javax.swing.JLabel();
        GmailRedirect = new javax.swing.JLabel();
        Attach = new javax.swing.JLabel();
        path = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(630, 450));
        setMinimumSize(new java.awt.Dimension(630, 450));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MoveLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoveLabelMouseDragged(evt);
            }
        });
        MoveLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MoveLabelMousePressed(evt);
            }
        });
        getContentPane().add(MoveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 590, 30));

        jScrollPane1.setBorder(null);

        jTextArea1.setBackground(new java.awt.Color(155, 193, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 550, 170));

        ToEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ToEmail.setForeground(new java.awt.Color(255, 255, 255));
        ToEmail.setBorder(null);
        ToEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        ToEmail.setOpaque(false);
        getContentPane().add(ToEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 490, 20));

        CCEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CCEmail.setForeground(new java.awt.Color(255, 255, 255));
        CCEmail.setBorder(null);
        CCEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        CCEmail.setOpaque(false);
        getContentPane().add(CCEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 420, 20));

        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CloseMouseReleased(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 30, 20));

        Send.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SendMouseReleased(evt);
            }
        });
        getContentPane().add(Send, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 120, 40));

        GmailRedirect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GmailRedirect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GmailRedirectMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                GmailRedirectMouseReleased(evt);
            }
        });
        getContentPane().add(GmailRedirect, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 40, 40));

        Attach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Attach.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                AttachAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Attach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AttachMouseReleased(evt);
            }
        });
        getContentPane().add(Attach, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 40, 40));

        path.setBackground(new java.awt.Color(155, 193, 255));
        getContentPane().add(path, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 340, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projekt_JTP/com/image/gui_v3_1.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        setSize(new java.awt.Dimension(630, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
 * after clicking on X button the application will close
 * @param evt 
 */
    private void CloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseReleased
        System.exit(0);
    }//GEN-LAST:event_CloseMouseReleased
/**
 * after clicking on SEND button class SendEmail will use fields:
 * TO, SUBJECT and MESSAGE that will be used to send an email
 * @param evt 
 */
    private void SendMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendMouseReleased
        SendEmail SE;
        SE = new SendEmail(ToEmail.getText(), CCEmail.getText(), jTextArea1.getText());
    }//GEN-LAST:event_SendMouseReleased
/**
 * click and press the top of the application
 * initialize variables for method that will drag the application window on your deskop
 * it uses getX() and getY()
 * @param evt 
 */
    private void MoveLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveLabelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();            
    }//GEN-LAST:event_MoveLabelMousePressed
/**
 * press on the top of application window 
 * drag it wherever you want on your deskop
 * @param evt 
 */
    private void MoveLabelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveLabelMouseDragged
        int x = evt.getXOnScreen(); 
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_MoveLabelMouseDragged

    private void GmailRedirectMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GmailRedirectMousePressed
        // Button pressed effect
    }//GEN-LAST:event_GmailRedirectMousePressed
/**
 * This method redirects you to Gmail website and shows the logging screen
 * you can log in your Gmail account now
 * @param evt 
 */
    private void GmailRedirectMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GmailRedirectMouseReleased
        // Button released effect
        LB.LaunchGmail();
    }//GEN-LAST:event_GmailRedirectMouseReleased
/**
 * Method that downloads the path for the attachement from standard file browser on your PC
 * Click on it to choose the file to attach and send it with your message
 * @param evt 
 */
    public void AttachMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AttachMouseReleased
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        attachment = f.getAbsolutePath();
        path.setText(attachment);
        //System.out.println(attachment);
    }//GEN-LAST:event_AttachMouseReleased

    private void AttachAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_AttachAncestorAdded
         // TODO add your handling code here:
    }//GEN-LAST:event_AttachAncestorAdded

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmailMainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmailMainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmailMainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmailMainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmailMainGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Attach;
    private javax.swing.JLabel Background;
    private javax.swing.JTextField CCEmail;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel GmailRedirect;
    private javax.swing.JLabel MoveLabel;
    private javax.swing.JLabel Send;
    private javax.swing.JTextField ToEmail;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField path;
    // End of variables declaration//GEN-END:variables

   
}

