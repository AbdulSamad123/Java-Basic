/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapid;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mota bhai
 */
public class Rapid6 extends javax.swing.JFrame {

    /**
     * Creates new form Rapid6
     */
    public Rapid6() {
        initComponents();
        
         try {
              Class.forName("java.sql.Driver");
             String path="jdbc:mySql://localhost/rapid_shipping_and_cargo";
             String uname="root";
             String upass="";
             
             Connection Con = DriverManager.getConnection(path,uname,upass);
             PreparedStatement stat = Con.prepareStatement("select * from client");
             ResultSet rs= stat.executeQuery();
             DefaultTableModel tbl =(DefaultTableModel) jTable1.getModel();
             tbl.setRowCount(0);
             while(rs.next())
             {
                  Object obj[]={rs.getString("id"),rs.getString("cnee"),rs.getString("blno"),rs.getString("invoice"),rs.getString("shipper"),rs.getString("pol"),rs.getString("pod")};
                  tbl.addRow(obj);
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    private void printToPrinter()
    {
        try {
            PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
pras.add(new Copies(1));
PrintService pss[] = PrintServiceLookup.lookupPrintServices(DocFlavor.INPUT_STREAM.PDF, pras);


if (pss.length == 0)  throw new    RuntimeException("No printer services available.");
    PrintService ps = pss[5];
System.out.println("Printing to " + ps);
DocPrintJob job = ps.createPrintJob();
FileInputStream fin = new FileInputStream("test.PDF");
Doc doc = new SimpleDoc(fin, DocFlavor.INPUT_STREAM.PDF, null);

job.print(doc, pras);
fin.close(); 
        } catch (Exception e) {
        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnprint = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnclose1 = new javax.swing.JButton();
        btn_Print = new javax.swing.JButton();

        btnprint.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnprint.setForeground(new java.awt.Color(0, 0, 204));
        btnprint.setText("Print");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cnee Name", "Bl No", "Invoice No", "Shipper Name", "Pol", "Pod"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnclose1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnclose1.setForeground(new java.awt.Color(0, 0, 204));
        btnclose1.setText("Close");
        btnclose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclose1ActionPerformed(evt);
            }
        });

        btn_Print.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_Print.setForeground(new java.awt.Color(0, 0, 204));
        btn_Print.setText("Print");
        btn_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnclose1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnclose1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
      printToPrinter();
    }//GEN-LAST:event_btnprintActionPerformed

    private void btnclose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclose1ActionPerformed
           Rapid1 obj = new Rapid1();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnclose1ActionPerformed

    private void btn_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PrintActionPerformed
      try
      {
         
        jTable1.print(); 
      }
      catch(Exception e)
              {
              
              }
        
               
    }//GEN-LAST:event_btn_PrintActionPerformed

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
            java.util.logging.Logger.getLogger(Rapid6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rapid6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rapid6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rapid6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rapid6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Print;
    private javax.swing.JButton btnclose1;
    private javax.swing.JButton btnprint;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}