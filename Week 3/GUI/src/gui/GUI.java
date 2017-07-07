package gui;

class MyFrame extends javax.swing.JFrame {

public MyFrame() {
initComponents();
}

@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">
private void initComponents() {

jPanel1 = new javax.swing.JPanel();
jLabel1 = new javax.swing.JLabel();
jTextField1 = new javax.swing.JTextField();
jLabel2 = new javax.swing.JLabel();
jLabel3 = new javax.swing.JLabel();
jButton1 = new javax.swing.JButton();
jLabel4 = new javax.swing.JLabel();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
setResizable(false);

jPanel1.setBackground(new java.awt.Color(204, 204, 204));

jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
jLabel1.setText("Your Grade will be:");

jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
jLabel2.setText("SCORE:");

jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jButton1.setText("Convert Score TO Letter Grade");
jButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton1ActionPerformed(evt);
}
});

javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(41, 41, 41)
.addComponent(jLabel1)
.addGap(27, 27, 27)
.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
.addContainerGap(30, Short.MAX_VALUE)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(67, 67, 67))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(58, 58, 58))))
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(34, 34, 34)
.addComponent(jLabel2)
.addContainerGap(276, Short.MAX_VALUE)))
);
jPanel1Layout.setVerticalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(64, 64, 64)
.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(65, 65, 65)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel1)
.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addComponent(jLabel4)
.addGap(14, 14, 14))
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(74, 74, 74)
.addComponent(jLabel2)
.addContainerGap(197, Short.MAX_VALUE)))
);

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
}// </editor-fold>

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {   

////THIS IS FOR STORING THE SCORE VALUE
  
double score =Double.parseDouble(jTextField1.getText());
  
String grade="";//VARIABLE DECLARATION FOR GRADE
  
  
//LADDER IF-ELSE TO CHECK FOR THE GRADE TO THE GIVEN SCORE VALUE
if(score>=0&&score<=59){
grade="F";
jLabel4.setText("");
jLabel3.setText(grade);
}else if(score>=60&&score<=63){
grade="D-";
jLabel4.setText("");
jLabel3.setText(grade);
}else if(score>=64&&score<=66){
grade="D";
jLabel4.setText("");
jLabel3.setText(grade);
}else if(score>=67&&score<=69){
grade="D+";
jLabel4.setText("");
jLabel3.setText(grade);
}else if(score>=70&&score<=73){
grade="C-";
jLabel4.setText("");
jLabel3.setText(grade);
}else if(score>=74&&score<=76){
grade="C";
jLabel4.setText("");
jLabel3.setText(grade);
}else if(score>=77&&score<=79){
grade="C+";
jLabel4.setText("");
jLabel3.setText(grade);
}else if(score>=80&&score<=83){
grade="B-";
jLabel4.setText("");
jLabel3.setText(grade);
}else if(score>=84&&score<=86){
grade="B";
jLabel4.setText("");
jLabel3.setText(grade);
}else if(score>=87&&score<=89){
grade="B+";
jLabel4.setText("");
jLabel3.setText(grade);
}else if(score>=90&&score<=95){
grade="A-";
jLabel4.setText("");
jLabel3.setText(grade);
}else if(score>=96&&score<=100){
grade="A+";
jLabel4.setText("");
jLabel3.setText(grade);
}else{
jLabel4.setText("Wrong Score Value!!");
   jLabel3.setText("");
jTextField.setText("");
}
  
}

public static void main(String args[]) {
//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

try {
for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
if ("Nimbus".equals(info.getName())) {
javax.swing.UIManager.setLookAndFeel(info.getClassName());
break;
}
}
} catch (ClassNotFoundException ex) {
java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>

/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new MyFrame().setVisible(true);
}
});
}

// Variables declaration - do not modify   
private javax.swing.JButton jButton1;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JPanel jPanel1;
private javax.swing.JTextField jTextField1;
// End of variables declaration   
}