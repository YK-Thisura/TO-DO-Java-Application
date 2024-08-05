
package Interface;

import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;


public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginbtn = new javax.swing.JButton();
        uname = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        registerbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginbtn.setBackground(new java.awt.Color(0, 51, 51));
        loginbtn.setFont(new java.awt.Font("Cooper Black", 0, 20)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(204, 204, 255));
        loginbtn.setText("LOGIN");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        uname.setBackground(new java.awt.Color(0, 153, 102));
        uname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 150, 30));

        pw.setBackground(new java.awt.Color(0, 153, 102));
        pw.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 150, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 10, 440, 480));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, -20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cooper Black", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("USER NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 150, 30));

        jLabel5.setFont(new java.awt.Font("Cooper Black", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("PASSWORD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        registerbtn.setBackground(new java.awt.Color(0, 51, 51));
        registerbtn.setFont(new java.awt.Font("Cooper Black", 0, 20)); // NOI18N
        registerbtn.setForeground(new java.awt.Color(204, 204, 255));
        registerbtn.setText("REGISTER");
        registerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbtnActionPerformed(evt);
            }
        });
        jPanel1.add(registerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/7.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, 260));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/9.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, -20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        setSize(new java.awt.Dimension(716, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
     String username = uname.getText();
        String password = new String(pw.getPassword());

        if (isValidLogin(username, password)) {
            Main m1 = new Main();
            m1.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "UserName or Password is incorrect");
        }
        
    }//GEN-LAST:event_loginbtnActionPerformed

    private void registerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbtnActionPerformed
        String username = uname.getText();
        String password = new String(pw.getPassword());

        if (saveUserCredentials(username, password)) {
            JOptionPane.showMessageDialog(null, "User registered successfully!");
             uname.setText("");
             pw.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Error in registration.");
        }
    }                                           

    private boolean saveUserCredentials(String username, String password) {
        try (FileWriter fw = new FileWriter("D:\\To Do App\\Login.txt", true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(username + ":" + password);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean isValidLogin(String username, String password) {
        try (Scanner scanner = new Scanner(new File("D:\\To Do App\\Login.txt"))) {
            while (scanner.hasNextLine()) {
                String[] credentials = scanner.nextLine().split(":");
                if (credentials[0].equals(username) && credentials[1].equals(password)) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }//GEN-LAST:event_registerbtnActionPerformed

  
    public static void main(String args[]) {
       
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField pw;
    private javax.swing.JButton registerbtn;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
