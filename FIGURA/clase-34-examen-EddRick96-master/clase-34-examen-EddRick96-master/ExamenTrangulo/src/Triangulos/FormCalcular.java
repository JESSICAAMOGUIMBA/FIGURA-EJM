/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangulos;

import javax.swing.JOptionPane;

/**
 *
 * @author ESFOT
 */
public class FormCalcular extends javax.swing.JFrame {

    /**
     * Creates new form FormClacular
     */
    public FormCalcular() {
        initComponents();
        jplResultados.setVisible(false);
        
    }
    
    public boolean comprobarTriangulo(double a, double b, double c){
        if(a+b > c && b+c > a && a+c > b){
            JOptionPane.showMessageDialog(rootPane, "Los lados ingresados concuerdan con los de un triángulo.");
            return true;
        }
        JOptionPane.showMessageDialog(rootPane, "Los lados ingresados NO concuerdan con los de un triángulo.");
        return false;
    }
    public static Double formatDecimal(Double numero, Integer numeroDecimales) {
        return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbTriangulos = new javax.swing.JComboBox<>();
        lblTdetriangulo = new javax.swing.JLabel();
        lblLado1 = new javax.swing.JLabel();
        lblLado2 = new javax.swing.JLabel();
        lblLado3 = new javax.swing.JLabel();
        txtLado1 = new javax.swing.JTextField();
        txtLado2 = new javax.swing.JTextField();
        txtLado3 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jplResultados = new javax.swing.JPanel();
        lblResultados = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblPerimetro = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        cmbTriangulos.setBackground(new java.awt.Color(0, 0, 204));
        cmbTriangulos.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        cmbTriangulos.setForeground(new java.awt.Color(255, 255, 255));
        cmbTriangulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rectangulo", "Isosceles", "Escaleno", "Equilatero" }));

        lblTdetriangulo.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        lblTdetriangulo.setText("Tipo de Triángulo:");

        lblLado1.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        lblLado1.setText("Lado 1:");

        lblLado2.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        lblLado2.setText("Lado 2:");

        lblLado3.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        lblLado3.setText("Lado 3:");

        txtLado1.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N

        txtLado2.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N

        txtLado3.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N

        btnCalcular.setBackground(new java.awt.Color(0, 0, 204));
        btnCalcular.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblResultados.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        lblResultados.setText("Resultados");

        lblArea.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        lblArea.setText("Área: ...");

        lblPerimetro.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        lblPerimetro.setText("Perímetro: ...");

        lblAltura.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        lblAltura.setText("Altura: ...");

        javax.swing.GroupLayout jplResultadosLayout = new javax.swing.GroupLayout(jplResultados);
        jplResultados.setLayout(jplResultadosLayout);
        jplResultadosLayout.setHorizontalGroup(
            jplResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplResultadosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jplResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPerimetro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jplResultadosLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lblResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 94, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jplResultadosLayout.setVerticalGroup(
            jplResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResultados)
                .addGap(18, 18, 18)
                .addComponent(lblArea)
                .addGap(18, 18, 18)
                .addComponent(lblPerimetro)
                .addGap(18, 18, 18)
                .addComponent(lblAltura)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblTdetriangulo)
                        .addGap(18, 18, 18)
                        .addComponent(cmbTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLado2)
                                .addGap(18, 18, 18)
                                .addComponent(txtLado2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLado1)
                                .addGap(18, 18, 18)
                                .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLado3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCalcular)
                                    .addComponent(txtLado3))))))
                .addGap(18, 18, 18)
                .addComponent(jplResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTdetriangulo))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLado1)
                            .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLado2)
                            .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLado3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jplResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        String lado1 = txtLado1.getText();
        String lado2 = txtLado2.getText();
        String lado3 = txtLado3.getText();
        String triangulos = cmbTriangulos.getSelectedItem().toString();
        
        if(triangulos == "Isosceles"){
            txtLado3.setEnabled(false);
        }else if(triangulos == "Equilatero"){
            txtLado2.setEnabled(false);
            txtLado3.setEnabled(false);
        }
        boolean comprobar = comprobarTriangulo(Double.valueOf(lado1), Double.valueOf(lado2), Double.valueOf(lado3));
        if(!lado1.equals("") && !lado2.equals("") && !lado3.equals("")){
            jplResultados.setVisible(comprobar);
            if(comprobar){
                
                Triangulo newTriangulo = new Triangulo(Double.valueOf(lado1), Double.valueOf(lado2), Double.valueOf(lado3));
                newTriangulo.setTipo(triangulos);
                lblAltura.setText("Altura: "+String.valueOf(formatDecimal(newTriangulo.calcularAltura(), 2)));
                lblPerimetro.setText("Perímetro: "+String.valueOf(formatDecimal(newTriangulo.calcularPerimetro(), 2)));
                lblArea.setText("Área: "+String.valueOf(formatDecimal(newTriangulo.calcularArea(),2)));
                
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Por favor, llene todos los campos.", "¡Alerta!", 0);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(FormCalcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCalcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCalcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCalcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCalcular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cmbTriangulos;
    private javax.swing.JPanel jplResultados;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblLado1;
    private javax.swing.JLabel lblLado2;
    private javax.swing.JLabel lblLado3;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JLabel lblResultados;
    private javax.swing.JLabel lblTdetriangulo;
    private javax.swing.JTextField txtLado1;
    private javax.swing.JTextField txtLado2;
    private javax.swing.JTextField txtLado3;
    // End of variables declaration//GEN-END:variables
}
