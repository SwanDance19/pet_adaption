/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signupForm;

import config.dbConnector;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import loginForm.login;
public class signup extends javax.swing.JFrame {


    public signup() {
        initComponents();
    }

     public static String email,username;
    
    public boolean duplicateCheck(){
        dbConnector dbc = new dbConnector();
        
        try{
            String query = "SELECT * FROM tbl_user WHERE user_name = '" + un.getText() + "' OR user_email = '" + em + "'";
             ResultSet resultSet = dbc.getData(query);
  
           if(resultSet.next()){
               email = resultSet.getString("user_email");
               if(email.equals(em.getText())){
                   JOptionPane.showMessageDialog(null, "Email is Already Used!!", "Message",JOptionPane.ERROR_MESSAGE);
                   em.setText("");
               }
               username = resultSet.getString("user_name");
               if(username.equals(un.getText())){
                   JOptionPane.showMessageDialog(null, "Username is Already Used!!", "Message",JOptionPane.ERROR_MESSAGE);
                   un.setText("");
               }
               return true;
           }else{
               return false;
           }
             
        }catch(SQLException ex){
            System.out.println(""+ex);
        }
        return false;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        register = new javax.swing.JButton();
        ut = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 153, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        register.setText("Register");
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        ut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utActionPerformed(evt);
            }
        });
        ut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                utKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("First name:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel15.setText("Registered ? Click Here to Login");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Last name:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Email:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Username:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Password:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Account Type:");

        fn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fnKeyPressed(evt);
            }
        });

        ln.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lnKeyPressed(evt);
            }
        });

        em.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emKeyPressed(evt);
            }
        });

        un.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                unKeyPressed(evt);
            }
        });

        pw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(137, 137, 137))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addComponent(jLabel9)
                            .addComponent(jLabel18))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel8))
                    .addComponent(un)
                    .addComponent(em)
                    .addComponent(ln)
                    .addComponent(fn)
                    .addComponent(pw)
                    .addComponent(ut, 0, 241, Short.MAX_VALUE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(ut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20)))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(350, 350, 350)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        login l = new login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_registerMouseClicked

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        if(fn.getText().isEmpty()||ln.getText().isEmpty()||em.getText().isEmpty()||
            un.getText().isEmpty()||pw.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!!", "Message",JOptionPane.ERROR_MESSAGE);
        }else if(pw.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Max password character should be 8 above!", "Message",JOptionPane.ERROR_MESSAGE);
            pw.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist");
        }else{
            dbConnector dbc = new dbConnector();
            if(dbc.insertData("INSERT INTO tbl_user(user_fname,user_lname,user_email,user_name,user_pass,account_type,account_status)"
                + "VALUES('"+fn.getText()+"','"+ln.getText()+"','"+em.getText()+"','"+un.getText()+"','"+pw.getText()+"','"
                + ut.getSelectedItem()+"','Pending')"))
        {
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            login l = new login();
            l.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Connection Error!", "Message",JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_registerActionPerformed

    private void utActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utActionPerformed

    private void utKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_utKeyPressed
        if(evt.getKeyCode () == KeyEvent.VK_ENTER){
            if(fn.getText().isEmpty()||ln.getText().isEmpty()||em.getText().isEmpty()||
                un.getText().isEmpty()||pw.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "All fields are required!!", "Message",JOptionPane.ERROR_MESSAGE);
            }else if(pw.getText().length() < 8){
                JOptionPane.showMessageDialog(null, "Max password character should be 8 above!", "Message",JOptionPane.ERROR_MESSAGE);
                pw.setText("");
            }else if(duplicateCheck()){
                System.out.println("Duplicate Exist");
            }else{
                dbConnector dbc = new dbConnector();
                if(dbc.insertData("INSERT INTO tbl_user(user_fname,user_lname,user_email,user_name,user_pass,account_type,account_status)"
                    + "VALUES('"+fn.getText()+"','"+ln.getText()+"','"+em.getText()+"','"+un.getText()+"','"+pw.getText()+"','"
                    + ut.getSelectedItem()+"','Pending')"))
            {
                JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                login l = new login();
                l.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Connection Error!", "Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        }
    }//GEN-LAST:event_utKeyPressed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        login l = new login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void fnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnKeyPressed
        if(evt.getKeyCode () == KeyEvent.VK_ENTER){
            if(fn.getText().isEmpty()||ln.getText().isEmpty()||em.getText().isEmpty()||
                un.getText().isEmpty()||pw.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "All fields are required!!", "Message",JOptionPane.ERROR_MESSAGE);
            }else if(pw.getText().length() < 8){
                JOptionPane.showMessageDialog(null, "Max password character should be 8 above!", "Message",JOptionPane.ERROR_MESSAGE);
                pw.setText("");
            }else if(duplicateCheck()){
                System.out.println("Duplicate Exist");
            }else{
                dbConnector dbc = new dbConnector();
                if(dbc.insertData("INSERT INTO tbl_user(user_fname,user_lname,user_email,user_name,user_pass,account_type,account_status)"
                    + "VALUES('"+fn.getText()+"','"+ln.getText()+"','"+em.getText()+"','"+un.getText()+"','"+pw.getText()+"','"
                    + ut.getSelectedItem()+"','Pending')"))
            {
                JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                login l = new login();
                l.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Connection Error!", "Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        }
    }//GEN-LAST:event_fnKeyPressed

    private void lnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnKeyPressed
        if(evt.getKeyCode () == KeyEvent.VK_ENTER){
            if(fn.getText().isEmpty()||ln.getText().isEmpty()||em.getText().isEmpty()||
                un.getText().isEmpty()||pw.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "All fields are required!!", "Message",JOptionPane.ERROR_MESSAGE);
            }else if(pw.getText().length() < 8){
                JOptionPane.showMessageDialog(null, "Max password character should be 8 above!", "Message",JOptionPane.ERROR_MESSAGE);
                pw.setText("");
            }else if(duplicateCheck()){
                System.out.println("Duplicate Exist");
            }else{
                dbConnector dbc = new dbConnector();
                if(dbc.insertData("INSERT INTO tbl_user(user_fname,user_lname,user_email,user_name,user_pass,account_type,account_status)"
                    + "VALUES('"+fn.getText()+"','"+ln.getText()+"','"+em.getText()+"','"+un.getText()+"','"+pw.getText()+"','"
                    + ut.getSelectedItem()+"','Pending')"))
            {
                JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                login l = new login();
                l.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Connection Error!", "Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        }
    }//GEN-LAST:event_lnKeyPressed

    private void emKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emKeyPressed
        if(evt.getKeyCode () == KeyEvent.VK_ENTER){
            if(fn.getText().isEmpty()||ln.getText().isEmpty()||em.getText().isEmpty()||
                un.getText().isEmpty()||pw.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "All fields are required!!", "Message",JOptionPane.ERROR_MESSAGE);
            }else if(pw.getText().length() < 8){
                JOptionPane.showMessageDialog(null, "Max password character should be 8 above!", "Message",JOptionPane.ERROR_MESSAGE);
                pw.setText("");
            }else if(duplicateCheck()){
                System.out.println("Duplicate Exist");
            }else{
                dbConnector dbc = new dbConnector();
                if(dbc.insertData("INSERT INTO tbl_user(user_fname,user_lname,user_email,user_name,user_pass,account_type,account_status)"
                    + "VALUES('"+fn.getText()+"','"+ln.getText()+"','"+em.getText()+"','"+un.getText()+"','"+pw.getText()+"','"
                    + ut.getSelectedItem()+"','Pending')"))
            {
                JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                login l = new login();
                l.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Connection Error!", "Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        }
    }//GEN-LAST:event_emKeyPressed

    private void unKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unKeyPressed
        if(evt.getKeyCode () == KeyEvent.VK_ENTER){
            if(fn.getText().isEmpty()||ln.getText().isEmpty()||em.getText().isEmpty()||
                un.getText().isEmpty()||pw.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "All fields are required!!", "Message",JOptionPane.ERROR_MESSAGE);
            }else if(pw.getText().length() < 8){
                JOptionPane.showMessageDialog(null, "Max password character should be 8 above!", "Message",JOptionPane.ERROR_MESSAGE);
                pw.setText("");
            }else if(duplicateCheck()){
                System.out.println("Duplicate Exist");
            }else{
                dbConnector dbc = new dbConnector();
                if(dbc.insertData("INSERT INTO tbl_user(user_fname,user_lname,user_email,user_name,user_pass,account_type,account_status)"
                    + "VALUES('"+fn.getText()+"','"+ln.getText()+"','"+em.getText()+"','"+un.getText()+"','"+pw.getText()+"','"
                    + ut.getSelectedItem()+"','Pending')"))
            {
                JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                login l = new login();
                l.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Connection Error!", "Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        }
    }//GEN-LAST:event_unKeyPressed

    private void pwKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwKeyPressed
        if(evt.getKeyCode () == KeyEvent.VK_ENTER){
            if(fn.getText().isEmpty()||ln.getText().isEmpty()||em.getText().isEmpty()||
                un.getText().isEmpty()||pw.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "All fields are required!!", "Message",JOptionPane.ERROR_MESSAGE);
            }else if(pw.getText().length() < 8){
                JOptionPane.showMessageDialog(null, "Max password character should be 8 above!", "Message",JOptionPane.ERROR_MESSAGE);
                pw.setText("");
            }else if(duplicateCheck()){
                System.out.println("Duplicate Exist");
            }else{
                dbConnector dbc = new dbConnector();
                if(dbc.insertData("INSERT INTO tbl_user(user_fname,user_lname,user_email,user_name,user_pass,account_type,account_status)"
                    + "VALUES('"+fn.getText()+"','"+ln.getText()+"','"+em.getText()+"','"+un.getText()+"','"+pw.getText()+"','"
                    + ut.getSelectedItem()+"','Pending')"))
            {
                JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                login l = new login();
                l.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Connection Error!", "Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        }
    }//GEN-LAST:event_pwKeyPressed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField ln;
    private javax.swing.JPasswordField pw;
    private javax.swing.JButton register;
    private javax.swing.JTextField un;
    private javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
