package de.blacklinerdev.passwordmanager.gui;

import de.blacklinerdev.passwordmanager.Account;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;

public class View extends javax.swing.JFrame {
    
    private JDialog dialog;
    private DefaultListModel dlm;

    public View() {
        initComponents();
        this.dialog = new checkPassword(this, true);
        this.dialog.setVisible(true);
        dlm = new DefaultListModel();
    }
    
    public String[] getAccount(){
        return new String[]{websitetb.getText(), passworttb.getText(), benutzertb.getText()};
    }
    public int getSelected(){
        return list.getSelectedIndex();
    }
    public void setList(List<Account> list){
        dlm.removeAllElements();
        dlm.addAll(list);
        this.list.setModel(dlm);
    }
    public void setText(Account a){
        websitetb.setText(a.getWebsite());
        passworttb.setText(a.getPassword());
        benutzertb.setText(a.getBenutzer());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        websitetb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passworttb = new javax.swing.JTextField();
        benutzertb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addbt = new javax.swing.JButton();
        removebt = new javax.swing.JButton();
        editbt = new javax.swing.JButton();
        closebt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password Manager");
        setName("main"); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 260));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        jScrollPane1.setViewportView(list);

        jLabel1.setText("Website: ");

        jLabel2.setText("Passwort: ");

        jLabel3.setText("Benutzer: ");

        addbt.setText("Hinzufügen");

        removebt.setText("Entfernen");

        editbt.setText("Bearbeiten");

        closebt.setText("Beenden");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(closebt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(editbt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removebt)
                        .addGap(0, 0, 0)
                        .addComponent(addbt))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(benutzertb, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(websitetb, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(passworttb, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(6, 6, 6))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(websitetb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passworttb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(benutzertb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addbt)
                            .addComponent(editbt)
                            .addComponent(closebt)
                            .addComponent(removebt)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbt;
    private javax.swing.JTextField benutzertb;
    private javax.swing.JButton closebt;
    private javax.swing.JButton editbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list;
    private javax.swing.JTextField passworttb;
    private javax.swing.JButton removebt;
    private javax.swing.JTextField websitetb;
    // End of variables declaration//GEN-END:variables
}
