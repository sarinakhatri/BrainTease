/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package braintease;
import java.sql.*;
import sqlConnect.ConnectionProvider;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author sarina
 */
public class Deletion extends javax.swing.JFrame {

    /**
     * Creates new form Deletion
     */
    public Deletion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DisplayQuestion = new javax.swing.JLabel();
        Qno = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        questionField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        answerField = new javax.swing.JTextField();
        option1Field = new javax.swing.JTextField();
        option2Field = new javax.swing.JTextField();
        option3Field = new javax.swing.JTextField();
        option4Field = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Myanmar MN", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("-");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.png"))); // NOI18N
        jButton3.setText("Back to Home");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 677, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));

        jLabel5.setFont(new java.awt.Font("Kokonor", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete Question.png"))); // NOI18N
        jLabel5.setText("DELETE QUESTIONS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 470, -1));

        jLabel6.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setText("Search Question Number: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 240, -1));

        DisplayQuestion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.add(DisplayQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 770, 300));
        jPanel1.add(Qno, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 60, 40));

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 242, 242));
        jLabel7.setText("Answer");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));
        jPanel1.add(questionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 560, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 242, 242));
        jLabel8.setText("Question");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(242, 242, 242));
        jLabel9.setText("Option 1");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(242, 242, 242));
        jLabel10.setText("Option 2");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(242, 242, 242));
        jLabel11.setText("Option 3");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(242, 242, 242));
        jLabel12.setText("Option 4");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));
        jPanel1.add(answerField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 520, -1));
        jPanel1.add(option1Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 520, -1));
        jPanel1.add(option2Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 520, -1));
        jPanel1.add(option3Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 520, -1));
        jPanel1.add(option4Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 520, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        jButton2.setText("Clear");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButton4.setText("Delete");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 800, 380));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete4.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AdminPage h=new AdminPage();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String no=Qno.getText();
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs=st.executeQuery("select * from questions where no='"+no+"'");
            if(rs.first())
            {
                questionField.setText(rs.getString(2));
                option1Field.setText(rs.getString(3));
                option2Field.setText(rs.getString(4));
                option3Field.setText(rs.getString(5));
                option4Field.setText(rs.getString(6));
                answerField.setText(rs.getString(7));
                Qno.setEditable(false);
            }
            else{
                JFrame jf= new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,"Question does not exist");
            }
        }
        catch(Exception e){
            JFrame jf= new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,e);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Qno.setText("");
        questionField.setText("");
        option1Field.setText("");
        option2Field.setText("");
        option3Field.setText("");
        option4Field.setText("");
        answerField.setText("");
        Qno.setEditable(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String no=Qno.getText();
        try{
            Connection con=ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("delete from questions where no=?");
            ps.setString(1, no);
            ps.executeUpdate();
             JFrame jf= new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,"Question deleted successfully");
                setVisible(false);
                new Deletion().setVisible(true);
        }
        catch(Exception e){
        JFrame jf= new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Deletion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deletion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deletion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deletion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deletion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DisplayQuestion;
    private javax.swing.JTextField Qno;
    private javax.swing.JTextField answerField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField option1Field;
    private javax.swing.JTextField option2Field;
    private javax.swing.JTextField option3Field;
    private javax.swing.JTextField option4Field;
    private javax.swing.JTextField questionField;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
