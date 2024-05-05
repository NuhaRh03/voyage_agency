
package AgenceDevoyage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VoyageOrganise extends javax.swing.JFrame {

    
    public VoyageOrganise() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SupBtn = new javax.swing.JButton();
        AffBtn = new javax.swing.JButton();
        ModBtn = new javax.swing.JButton();
        AjouBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        datdepart = new javax.swing.JTextField();
        MTransport = new javax.swing.JTextField();
        idv = new javax.swing.JTextField();
        Nhotel = new javax.swing.JTextField();
        datretour = new javax.swing.JTextField();
        Nplaces = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Tvoyage = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(756, 473));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText(" VOYAGE ORGANISE");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel3.setText("<-- RETOUR ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jlbl.setText("ID de voyage");

        jLabel5.setText("Date de Depart");

        jLabel6.setText("Date de Retour");

        jLabel7.setText("Nombre des places");

        jLabel8.setText("Nom de l'hotel");

        jLabel9.setText("Moyanne Transport");

        SupBtn.setBackground(new java.awt.Color(237, 215, 194));
        SupBtn.setText("SUPRIMER");
        SupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupBtnActionPerformed(evt);
            }
        });

        AffBtn.setBackground(new java.awt.Color(237, 215, 194));
        AffBtn.setText("AFFICHER");
        AffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AffBtnActionPerformed(evt);
            }
        });

        ModBtn.setBackground(new java.awt.Color(237, 215, 194));
        ModBtn.setText("MODIFIER");
        ModBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModBtnActionPerformed(evt);
            }
        });

        AjouBtn.setBackground(new java.awt.Color(237, 215, 194));
        AjouBtn.setText("AJOUTER");
        AjouBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouBtnActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(237, 215, 194));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID voyage", "Date Depart", "Date  Retour", "Nombre Places", "Nom Hotel", "Moyanne Transport", "Type Voyage"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        datdepart.setActionCommand("<Not Set>");

        idv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idvActionPerformed(evt);
            }
        });

        Nhotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhotelActionPerformed(evt);
            }
        });

        jLabel2.setText("Type de Voyage");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idv, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbl))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datdepart, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datretour, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(Nplaces, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nhotel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(MTransport, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Tvoyage, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 25, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(195, 195, 195)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(AjouBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(164, 164, 164)
                                        .addComponent(AffBtn)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ModBtn)
                                .addGap(70, 70, 70)
                                .addComponent(SupBtn)
                                .addGap(237, 237, 237)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jlbl)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MTransport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nhotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nplaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datretour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datdepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tvoyage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AjouBtn)
                    .addComponent(ModBtn)
                    .addComponent(AffBtn)
                    .addComponent(SupBtn))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      
TbleauDeBord obj =new TbleauDeBord();
obj.setVisible(true);
dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void idvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idvActionPerformed
       
    }//GEN-LAST:event_idvActionPerformed

    private void NhotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhotelActionPerformed
        
    }//GEN-LAST:event_NhotelActionPerformed

    private void AjouBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouBtnActionPerformed

try{
Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/agencevoyage", "root", "");
String sql = "insert into voyage values (?,?,?,?,?,?,?)";
PreparedStatement ptst= con.prepareStatement(sql);
ptst.setString(1,idv.getText());
ptst.setString(2,datdepart.getText());
ptst.setString(3,datretour.getText());
ptst.setString(4,Nplaces.getText());
ptst.setString(5,Nhotel.getText());
ptst.setString(6,MTransport.getText());
ptst.setString(7,Tvoyage.getText());
ptst.executeUpdate();
JOptionPane.showMessageDialog(this, "Bien Ajouter!");
con.close();
}
catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_AjouBtnActionPerformed

    private void ModBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModBtnActionPerformed
   try{
String id=idv.getText();
String dated=datdepart.getText();
String dater=datretour.getText();
String nomp=Nplaces.getText();
String  hotel=Nhotel.getText();
String Myt=MTransport.getText();
String typev=Tvoyage.getText();
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/agencevoyage", "root", "");

String sql= "UPDATE voyage SET date_depart=?, date_retour=?, nb_places=?,hotel=?, moy_transport=?,typev=? WHERE id=?";
PreparedStatement ptst = con.prepareStatement(sql);
ptst.setString(1, dated);
ptst.setString(2, dater);
ptst.setString(3, nomp);
ptst.setString(4, hotel);
ptst.setString(5, Myt);
ptst.setString(6, typev);
ptst.setString(7, id);

ptst.execute();

JOptionPane.showMessageDialog(this, " Modifier!");

}
catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_ModBtnActionPerformed

    private void AffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AffBtnActionPerformed
            try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/agencevoyage", "root", "");
Statement st = con.createStatement();
String sql ="SELECT * from voyage WHERE typev='organise'";
PreparedStatement ptst= con.prepareStatement(sql);
ResultSet rs= ptst.executeQuery();
DefaultTableModel dt= (DefaultTableModel)jTable1.getModel();
dt.setRowCount(0);
while(rs.next()){
Object o[]= {rs.getString("id"),rs.getString("date_depart"),rs.getString("date_arrivee"),rs.getString("nb_places"),rs.getString("hotel"),rs.getString("moy_transport"),rs.getString("typev")};
dt.addRow(o);
}

}
catch(Exception e){
  JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_AffBtnActionPerformed

    private void SupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupBtnActionPerformed
        try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/agencevoyage", "root", "");
Statement st = con.createStatement();

String ID = idv.getText();
String sql = "DELETE FROM voyage WHERE typev='organise' AND id="+ID+"";
PreparedStatement ptst = con.prepareStatement(sql);
ptst.executeUpdate();
JOptionPane.showMessageDialog(this, "Supprimer!");
con.close();

}
catch(Exception e){
 JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_SupBtnActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VoyageOrganise().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AffBtn;
    private javax.swing.JButton AjouBtn;
    private javax.swing.JTextField MTransport;
    private javax.swing.JButton ModBtn;
    private javax.swing.JTextField Nhotel;
    private javax.swing.JTextField Nplaces;
    private javax.swing.JButton SupBtn;
    private javax.swing.JTextField Tvoyage;
    private javax.swing.JTextField datdepart;
    private javax.swing.JTextField datretour;
    private javax.swing.JTextField idv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlbl;
    // End of variables declaration//GEN-END:variables
}
