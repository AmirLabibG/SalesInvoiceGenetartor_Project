
package app.view;

import app.controllers.The_Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

public class MainFrame extends javax.swing.JFrame implements ActionListener{

   
    public MainFrame() 
    {
        controller = new The_Control(this);
        initComponents();
    }
     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        headerTab = new javax.swing.JTable();
        CretInvBtn = new javax.swing.JButton();
        CretInvBtn.addActionListener(controller);
        DeltInvBtn = new javax.swing.JButton();
        DeltInvBtn.addActionListener(controller);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NumLbl = new javax.swing.JLabel();
        Datelbl = new javax.swing.JLabel();
        namelbl = new javax.swing.JLabel();
        totallbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lineTab = new javax.swing.JTable();
        saveBtn = new javax.swing.JButton();
        saveBtn.addActionListener(controller);
        CanlcBtn = new javax.swing.JButton();
        CanlcBtn.addActionListener(controller);
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenuItem = new javax.swing.JMenu();
        LoadfileMenuItem = new javax.swing.JMenuItem();
        LoadfileMenuItem.addActionListener(controller);
        SavedataMenuItem = new javax.swing.JMenuItem();
        SavedataMenuItem.addActionListener(controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Date", "Customer", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(headerTab);

        CretInvBtn.setText("Create New Invoice");
        CretInvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CretInvBtnActionPerformed(evt);
            }
        });

        DeltInvBtn.setText("Delete Invoice");
        DeltInvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeltInvBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Invoice Number:");

        jLabel2.setText("Invoice Date:");

        jLabel3.setText("Customer Name");

        jLabel4.setText("Invoice Total");

        NumLbl.setText(".");

        Datelbl.setText(".");

        namelbl.setText(".");

        totallbl.setText(".");

        lineTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Item Name", "Item Price", "Count", "Item Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(lineTab);

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        CanlcBtn.setText("Cancel");
        CanlcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanlcBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Invoice Table.");

        FileMenuItem.setText("File");

        LoadfileMenuItem.setText("Load File");
        LoadfileMenuItem.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
                LoadfileMenuItemMenuKeyReleased(evt);
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        LoadfileMenuItem.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                LoadfileMenuItemInputMethodTextChanged(evt);
            }
        });
        FileMenuItem.add(LoadfileMenuItem);

        SavedataMenuItem.setText("Save File");
        SavedataMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavedataMenuItemActionPerformed(evt);
            }
        });
        FileMenuItem.add(SavedataMenuItem);

        jMenuBar1.add(FileMenuItem);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CretInvBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeltInvBtn))
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(namelbl))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Datelbl))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(28, 28, 28)
                                    .addComponent(NumLbl)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(58, 58, 58)
                                .addComponent(totallbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(CanlcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(NumLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Datelbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(namelbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(totallbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CretInvBtn)
                    .addComponent(DeltInvBtn)
                    .addComponent(saveBtn)
                    .addComponent(CanlcBtn))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeltInvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeltInvBtnActionPerformed
         DeltInvBtn.addActionListener(this);
         DeltInvBtn.setActionCommand("D");
    }//GEN-LAST:event_DeltInvBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        saveBtn.addActionListener(this);
        saveBtn.setActionCommand("SV");
    }//GEN-LAST:event_saveBtnActionPerformed

    private void SavedataMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavedataMenuItemActionPerformed
        SavedataMenuItem.addActionListener(this);
        SavedataMenuItem.setActionCommand("S");
    }//GEN-LAST:event_SavedataMenuItemActionPerformed

    private void LoadfileMenuItemMenuKeyReleased(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_LoadfileMenuItemMenuKeyReleased
          LoadfileMenuItem.addActionListener(this);
         LoadfileMenuItem.setActionCommand("lo");
         
    }//GEN-LAST:event_LoadfileMenuItemMenuKeyReleased

    private void CretInvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CretInvBtnActionPerformed
        CretInvBtn.addActionListener(this);
        CretInvBtn.setActionCommand("CR");
    }//GEN-LAST:event_CretInvBtnActionPerformed

    private void CanlcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanlcBtnActionPerformed
        CanlcBtn.addActionListener(this);
        CanlcBtn.setActionCommand("CNCL");
    }//GEN-LAST:event_CanlcBtnActionPerformed

    private void LoadfileMenuItemInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_LoadfileMenuItemInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadfileMenuItemInputMethodTextChanged
      
    
  
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CanlcBtn;
    private javax.swing.JButton CretInvBtn;
    private javax.swing.JLabel Datelbl;
    private javax.swing.JButton DeltInvBtn;
    private javax.swing.JMenu FileMenuItem;
    private javax.swing.JMenuItem LoadfileMenuItem;
    private javax.swing.JLabel NumLbl;
    private javax.swing.JMenuItem SavedataMenuItem;
    private javax.swing.JTable headerTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lineTab;
    private javax.swing.JLabel namelbl;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel totallbl;
    // End of variables declaration//GEN-END:variables

    
private The_Control controller;

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
