
package AgenceDevoyage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Voyageur extends javax.swing.JFrame {

 
    public Voyageur() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();
        npassport = new javax.swing.JTextField();
        tvoyage = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ajouvoyageur = new javax.swing.JButton();
        upvoyageur = new javax.swing.JButton();
        affvoyageur = new javax.swing.JButton();
        supvoyageur = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("VOYAGEUR MANAGMENT");

        jLabel2.setText("ID_VOYAGEUR");

        jLabel3.setText("NOM");

        jLabel4.setText("PRENOM");

        jLabel5.setText("NUM_PASSPORT");

        jLabel6.setText("TYPE_VOYAGE");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel7.setText("<-- RETOUR");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(237, 215, 194));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_VOYAGEUR", "NOM", "PRENOM", "NUM_PASSPORT", "TYPE_VOYAGE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        ajouvoyageur.setBackground(new java.awt.Color(237, 215, 194));
        ajouvoyageur.setText("AJOUTER");
        ajouvoyageur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouvoyageurActionPerformed(evt);
            }
        });

        upvoyageur.setBackground(new java.awt.Color(237, 215, 194));
        upvoyageur.setText("MODIFIER");
        upvoyageur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upvoyageurActionPerformed(evt);
            }
        });

        affvoyageur.setBackground(new java.awt.Color(237, 215, 194));
        affvoyageur.setText("AFFICHER");
        affvoyageur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affvoyageurActionPerformed(evt);
            }
        });

        supvoyageur.setBackground(new java.awt.Color(237, 215, 194));
        supvoyageur.setText("SUPRIMER");
        supvoyageur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supvoyageurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel3)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(npassport, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tvoyage, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(ajouvoyageur)
                .addGap(18, 18, 18)
                .addComponent(upvoyageur)
                .addGap(29, 29, 29)
                .addComponent(affvoyageur)
                .addGap(18, 18, 18)
                .addComponent(supvoyageur)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(npassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tvoyage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouvoyageur)
                    .addComponent(upvoyageur)
                    .addComponent(affvoyageur)
                    .addComponent(supvoyageur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajouvoyageurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouvoyageurActionPerformed
       
try{
Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/agencevoyage", "root", "");
String sql = "insert into voyageur values (?,?,?,?,?)";
PreparedStatement ptst= con.prepareStatement(sql);
ptst.setString(1,id.getText());
ptst.setString(2,nom.getText());
ptst.setString(3,prenom.getText());
ptst.setString(4,npassport.getText());
ptst.setString(5,tvoyage.getText());
ptst.executeUpdate();
JOptionPane.showMessageDialog(this, "Data inserted Succesfully!");
con.close();
}
catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}

    }//GEN-LAST:event_ajouvoyageurActionPerformed

    private void upvoyageurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upvoyageurActionPerformed
        
try{
String ID_VOYAGEUR =id.getText();
String NOM =nom.getText();
String PRENOM =prenom.getText();
String NUM_PASSPORT =npassport.getText();
String TYPE_VOYAGE =tvoyage.getText();
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/agencevoyage", "root", "");

String sql= "UPDATE `voyageur` SET `id`=?,`nom`=?,`prenom`=?,`passport`=?,`id_voyage`=?";
PreparedStatement ptst = con.prepareStatement(sql);
ptst.execute();

JOptionPane.showMessageDialog(this, "Record Updated!");

}
catch(Exception e){
JOptionPane.showMessageDialog(this, e);
}

    }//GEN-LAST:event_upvoyageurActionPerformed

    private void affvoyageurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affvoyageurActionPerformed
        

try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/agencevoyage", "root", "");
Statement st = con.createStatement();
String sql ="SELECT * from voyageur";
PreparedStatement ptst= con.prepareStatement(sql);
ResultSet rs= ptst.executeQuery();
DefaultTableModel dt= (DefaultTableModel)jTable1.getModel();
dt.setRowCount(0);
while(rs.next()){
Object o[]= {rs.getString("id"),rs.getString("nom"),rs.getString("prenom"),rs.getString("passport"),rs.getString("id_voyage")};
dt.addRow(o);
}

}
catch(Exception e){
JOptionPane.showMessageDialog(this, e);
}
    }//GEN-LAST:event_affvoyageurActionPerformed

    private void supvoyageurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supvoyageurActionPerformed
        
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/agencevoyage", "root", "");
Statement st = con.createStatement();

String passport = npassport.getText();
String sql = "DELETE FROM `voyageur` WHERE passport="+passport+"";
PreparedStatement ptst = con.prepareStatement(sql);
ptst.executeUpdate();
JOptionPane.showMessageDialog(this, "Data deleted succsessfully");
con.close();

}
catch(Exception e){
JOptionPane.showMessageDialog(this, e);
}

    }//GEN-LAST:event_supvoyageurActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        
TbleauDeBord obj=new TbleauDeBord();
obj.setVisible(true);
dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voyageur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton affvoyageur;
    private javax.swing.JButton ajouvoyageur;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField npassport;
    private javax.swing.JTextField prenom;
    private javax.swing.JButton supvoyageur;
    private javax.swing.JTextField tvoyage;
    private javax.swing.JButton upvoyageur;
    // End of variables declaration//GEN-END:variables
}
