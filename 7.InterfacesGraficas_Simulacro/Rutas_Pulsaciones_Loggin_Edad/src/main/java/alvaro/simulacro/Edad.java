package alvaro.simulacro;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Edad extends javax.swing.JFrame {

    private Calendar c;
    private File men;
    private File may;
    private PrintWriter pw;
    
    private Edad() {
        initComponents();
        men = new File("menores.txt");
        may = new File("mayores.txt");
    }
    
    private void crearFichero(File f){
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al crear el fichero");
            }
        }
    }
    
    private int calcularEdad(){
        c = Calendar.getInstance();
        int edad = c.get(Calendar.YEAR) - (int)jsAno.getValue();
        if ((int)jsMes.getValue() > c.get(Calendar.MONTH)+1) {
            edad--;
        }else if((int)jsMes.getValue() == c.get(Calendar.MONTH)+1){
            if ((int)jsDia.getValue() > c.get(Calendar.DAY_OF_MONTH)) {
                edad--;
            }
        }
        return edad;
    }
    
    private void borrarCampos(){
        tDNI.setText("");
        tNombre.setText("");
        tApe.setText("");
        jsDia.setValue(1);
        jsMes.setValue(1);
        jsAno.setValue(1900);
    }
    
    private void imprimirArchivo(File f){
        try {
                pw = new PrintWriter(new FileWriter(f, true));
                pw.println(tDNI.getText() + ';' + tNombre.getText() + ';' + tApe.getText());
                pw.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "No se puede acceder al fichero");
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

        pFondo = new javax.swing.JPanel();
        lDNI = new javax.swing.JLabel();
        tDNI = new javax.swing.JTextField();
        lNombre = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        lApe = new javax.swing.JLabel();
        tApe = new javax.swing.JTextField();
        lFecha = new javax.swing.JLabel();
        jsDia = new javax.swing.JSpinner();
        jsMes = new javax.swing.JSpinner();
        jsAno = new javax.swing.JSpinner();
        bEdad = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        lSalida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos usuario");

        pFondo.setBackground(new java.awt.Color(0, 153, 255));

        lDNI.setText("DNI:");

        lNombre.setText("Nombre:");

        lApe.setText("Apellido:");

        lFecha.setText("Fecha Nacimiento:");

        jsDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jsMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jsAno.setModel(new javax.swing.SpinnerNumberModel(1900, 1900, 2021, 1));

        bEdad.setText("Calcular edad");
        bEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEdadActionPerformed(evt);
            }
        });

        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pFondoLayout = new javax.swing.GroupLayout(pFondo);
        pFondo.setLayout(pFondoLayout);
        pFondoLayout.setHorizontalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pFondoLayout.createSequentialGroup()
                                .addComponent(bEdad)
                                .addGap(41, 41, 41)
                                .addComponent(lSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bCancelar)
                            .addComponent(bGuardar)))
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lApe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lDNI))
                        .addGap(18, 18, 18)
                        .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(tNombre)
                            .addComponent(tApe, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addComponent(lFecha)
                        .addGap(18, 18, 18)
                        .addComponent(jsDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jsMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jsAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        pFondoLayout.setVerticalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDNI))
                .addGap(18, 18, 18)
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombre)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lApe)
                    .addComponent(tApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lFecha)
                    .addComponent(jsAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bEdad)
                    .addComponent(lSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bGuardar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEdadActionPerformed
        lSalida.setText(calcularEdad() + " años");
    }//GEN-LAST:event_bEdadActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        crearFichero(men);
        crearFichero(may);
        if (calcularEdad() < 18) {
            imprimirArchivo(men);
        }else{
            imprimirArchivo(may);
        }
        borrarCampos();
    }//GEN-LAST:event_bGuardarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        borrarCampos();
    }//GEN-LAST:event_bCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Edad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bEdad;
    private javax.swing.JButton bGuardar;
    private javax.swing.JSpinner jsAno;
    private javax.swing.JSpinner jsDia;
    private javax.swing.JSpinner jsMes;
    private javax.swing.JLabel lApe;
    private javax.swing.JLabel lDNI;
    private javax.swing.JLabel lFecha;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lSalida;
    private javax.swing.JPanel pFondo;
    private javax.swing.JTextField tApe;
    private javax.swing.JTextField tDNI;
    private javax.swing.JTextField tNombre;
    // End of variables declaration//GEN-END:variables
}
