
package Interface;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tt = new javax.swing.JTextField();
        dd = new javax.swing.JTextField();
        pl = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        des = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        insertbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        exportbtn = new javax.swing.JButton();
        startbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Task Title");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Description");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("Due Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setText("Priority Level");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        tt.setBackground(new java.awt.Color(0, 153, 102));
        tt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 140, 40));

        dd.setBackground(new java.awt.Color(0, 153, 102));
        dd.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 240, 40));

        pl.setModel(new javax.swing.SpinnerListModel(new String[] {"Low", "Medium", "High"}));
        jPanel1.add(pl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 140, 40));

        des.setBackground(new java.awt.Color(0, 153, 102));
        des.setColumns(20);
        des.setForeground(new java.awt.Color(255, 255, 255));
        des.setRows(5);
        jScrollPane1.setViewportView(des);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 240, 110));

        jTable1.setBackground(new java.awt.Color(0, 153, 102));
        jTable1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task Title", "Priority Level", "Due Date", "Description"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 700, 220));

        insertbtn.setBackground(new java.awt.Color(0, 51, 51));
        insertbtn.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        insertbtn.setForeground(new java.awt.Color(204, 204, 255));
        insertbtn.setText("INSERT");
        insertbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertbtnActionPerformed(evt);
            }
        });
        jPanel1.add(insertbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 110, -1));

        deletebtn.setBackground(new java.awt.Color(0, 51, 51));
        deletebtn.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(204, 204, 255));
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 110, -1));

        updatebtn.setBackground(new java.awt.Color(0, 51, 51));
        updatebtn.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(204, 204, 255));
        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        exitbtn.setBackground(new java.awt.Color(0, 51, 51));
        exitbtn.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(204, 204, 255));
        exitbtn.setText("EXIT");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, -1));

        exportbtn.setBackground(new java.awt.Color(0, 51, 51));
        exportbtn.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        exportbtn.setForeground(new java.awt.Color(204, 204, 255));
        exportbtn.setText("SAVE");
        exportbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportbtnActionPerformed(evt);
            }
        });
        jPanel1.add(exportbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 110, -1));

        startbtn.setBackground(new java.awt.Color(0, 51, 51));
        startbtn.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        startbtn.setForeground(new java.awt.Color(204, 204, 255));
        startbtn.setText("START");
        startbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startbtnActionPerformed(evt);
            }
        });
        jPanel1.add(startbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/2.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 250, 120));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/4.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/6.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        Main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 530));

        getContentPane().add(Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        setSize(new java.awt.Dimension(716, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertbtnActionPerformed
        
        String taskTitle = tt.getText();
        String dueDate = dd.getText();
        String priorityLevel = pl.getValue().toString();
        String description = des.getText();

        // Add data to the table model
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{taskTitle, priorityLevel, dueDate, description});

        // Clear text fields
        tt.setText("");
        dd.setText("");
        pl.setValue(0);
        des.setText("");
    
    }//GEN-LAST:event_insertbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        
        // Get selected row index
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) { // Check if a row is selected
            // Get input data
            String taskTitle = tt.getText();
            String dueDate = dd.getText();
            String priorityLevel = pl.getValue().toString();
            String description = des.getText();

            // Update the selected row with the new data
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setValueAt(taskTitle, selectedRow, 0);
            model.setValueAt(priorityLevel, selectedRow, 1);
            model.setValueAt(dueDate, selectedRow, 2);
            
              }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
       
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) { // Check if a row is selected
            // Remove the selected row from the table model
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.removeRow(selectedRow);
        }
              
    }//GEN-LAST:event_deletebtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        
            int confirmed = JOptionPane.showConfirmDialog(null, 
        "Are you sure you want to exit the program?", "Exit Program Message Box",
        JOptionPane.YES_NO_OPTION);

    if (confirmed == JOptionPane.YES_OPTION) {
        dispose();
    }
    }//GEN-LAST:event_exitbtnActionPerformed

    private void exportbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportbtnActionPerformed
       
        
String filePath = "D:\\To Do App\\Data.txt";
File file = new File(filePath);
try {
    FileWriter fw = new FileWriter(file);
    BufferedWriter bw = new BufferedWriter(fw);

    for (int i = 0; i < jTable1.getRowCount(); i++) {
        for (int j = 0; j < jTable1.getColumnCount(); j++) {
            bw.write(jTable1.getValueAt(i, j).toString());
            if (j < jTable1.getColumnCount() - 1) {
                bw.write(",");  
            }
        }
        bw.newLine();
    }

    bw.close();
    fw.close();

} catch (IOException ex) {
    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
}

    }//GEN-LAST:event_exportbtnActionPerformed

    private void startbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startbtnActionPerformed
                                               
    String filePath = "D:\\To Do App\\Data.txt";
    File file = new File(filePath);

    try {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);  // Clear existing rows
        Object[] lines = br.lines().toArray();

        for (Object line : lines) {
            String[] row = line.toString().split(",");  
            model.addRow(row);
        }

        br.close();
        fr.close();

    } catch (FileNotFoundException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }


    }//GEN-LAST:event_startbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main;
    private javax.swing.JTextField dd;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextArea des;
    private javax.swing.JButton exitbtn;
    private javax.swing.JButton exportbtn;
    private javax.swing.JButton insertbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner pl;
    private javax.swing.JButton startbtn;
    private javax.swing.JTextField tt;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables

}
