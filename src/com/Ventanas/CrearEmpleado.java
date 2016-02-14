
package com.Ventanas;
import com.Class.*;
import com.Ejecutador.Main;
import com.Ventanas.*;
import com.sun.glass.events.KeyEvent;
import java.util.ArrayList;
import java.util.Collection;

public class CrearEmpleado extends javax.swing.JFrame {

    public CrearEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Introducir Empleado");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNombre = new javax.swing.JLabel();
        lbApellido = new javax.swing.JLabel();
        lbCedula = new javax.swing.JLabel();
        lbDepartamento = new javax.swing.JLabel();
        lbIDSupervisor = new javax.swing.JLabel();
        lbSalario = new javax.swing.JLabel();
        btAtrás = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtIDSupervisor = new javax.swing.JTextField();
        jtSalario = new javax.swing.JTextField();
        cbTipoDepartamento = new javax.swing.JComboBox();
        lbBien = new javax.swing.JLabel();
        lbMal = new javax.swing.JLabel();
        jtCedula1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtCedula2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtCedula3 = new javax.swing.JTextField();
        lbErrorNombre = new javax.swing.JLabel();
        lbErrorApellido = new javax.swing.JLabel();
        lbErrorCedula = new javax.swing.JLabel();
        lbErrorIDSupervisor = new javax.swing.JLabel();
        lbErrorSalario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNombre.setText("Nombre:");

        lbApellido.setText("Apellido:");

        lbCedula.setText("Cédula:");

        lbDepartamento.setText("Departamento:");

        lbIDSupervisor.setText("ID Supervisor:");

        lbSalario.setText("Salario:");

        btAtrás.setText("Atrás");
        btAtrás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtrásActionPerformed(evt);
            }
        });

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });

        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });

        jtIDSupervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIDSupervisorActionPerformed(evt);
            }
        });
        jtIDSupervisor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIDSupervisorKeyTyped(evt);
            }
        });

        jtSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtSalarioKeyTyped(evt);
            }
        });

        cbTipoDepartamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Servicio al Cliente", "Ventas", "Almacen", "Tecnología" }));
        cbTipoDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoDepartamentoActionPerformed(evt);
            }
        });

        lbBien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbBien.setForeground(new java.awt.Color(0, 153, 0));

        lbMal.setForeground(new java.awt.Color(255, 0, 51));

        jtCedula1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCedula1KeyTyped(evt);
            }
        });

        jLabel1.setText("-");

        jtCedula2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCedula2ActionPerformed(evt);
            }
        });
        jtCedula2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCedula2KeyTyped(evt);
            }
        });

        jLabel2.setText("-");

        jtCedula3.setMinimumSize(new java.awt.Dimension(6, 15));
        jtCedula3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCedula3ActionPerformed(evt);
            }
        });
        jtCedula3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCedula3KeyTyped(evt);
            }
        });

        lbErrorNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbErrorNombre.setForeground(new java.awt.Color(255, 51, 0));

        lbErrorApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbErrorApellido.setForeground(new java.awt.Color(255, 51, 0));

        lbErrorCedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbErrorCedula.setForeground(new java.awt.Color(255, 51, 0));

        lbErrorIDSupervisor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbErrorIDSupervisor.setForeground(new java.awt.Color(255, 51, 0));

        lbErrorSalario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbErrorSalario.setForeground(new java.awt.Color(255, 51, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Ingresar nuevo empleado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(37, Short.MAX_VALUE)
                        .addComponent(lbMal, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btAtrás)
                        .addGap(106, 106, 106)
                        .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lbBien, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbDepartamento)
                                    .addComponent(lbApellido)
                                    .addComponent(lbNombre)
                                    .addComponent(lbCedula)
                                    .addComponent(lbIDSupervisor)
                                    .addComponent(lbSalario))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtNombre)
                                            .addComponent(jtApellido)
                                            .addComponent(jtIDSupervisor, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                            .addComponent(jtSalario)
                                            .addComponent(cbTipoDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lbErrorIDSupervisor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                                            .addComponent(lbErrorApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbErrorNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbErrorSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtCedula2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtCedula3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbErrorCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbErrorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jtCedula2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jtCedula3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbErrorCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbTipoDepartamento)
                            .addComponent(lbDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbIDSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtIDSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbErrorIDSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbBien, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btAtrás))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btGuardar))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbErrorSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void limpiarErrores(){
        this.lbErrorNombre.setText("");
        this.lbErrorApellido.setText("");
        this.lbErrorCedula.setText("");
        this.lbErrorIDSupervisor.setText("");
        this.lbErrorSalario.setText("");
} 
public void limpiarVentana(){
        this.jtNombre.setText("");
        this.jtApellido.setText("");
        this.jtCedula1.setText("");
        this.jtCedula2.setText("");
        this.jtCedula3.setText("");
        this.jtIDSupervisor.setText("");
        this.jtSalario.setText("");
        this.lbBien.setText("");
        this.lbMal.setText("");
        
    }
    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        limpiarErrores();
        try{
            String errores="Error: ";
            
            String nombre = this.jtNombre.getText(); 
            String apellido = this.jtApellido.getText();
            String cedula = this.jtCedula1.getText() + this.jtCedula2.getText() + this.jtCedula3.getText();
            TipoDepartamento departamento = TipoDepartamento.SERVICIOCLIENTE;
            String idSupervisor = this.jtIDSupervisor.getText();
            String salario1 =this.jtSalario.getText();
            int salario=0;

            if(!(salario1.equals("")))
                salario = Integer.parseInt(salario1);
            
            int indiceCB = cbTipoDepartamento.getSelectedIndex();
            if(indiceCB==0){departamento = TipoDepartamento.SERVICIOCLIENTE;}
            if(indiceCB==1){departamento = TipoDepartamento.VENTAS;}
            if(indiceCB==2){departamento = TipoDepartamento.ALMACEN;}
            if(indiceCB==3){departamento = TipoDepartamento.TECNOLOGIA;}
            
            if(this.jtNombre.getText().equals("")){
                errores = errores + ", Nombre";
                this.lbErrorNombre.setText("*");
            }
            if(this.jtApellido.getText().equals("")){
                errores = errores + ", Apellido";
                this.lbErrorApellido.setText("*");
            }
            //Restricciones de Cedula
            if((cedula.length())!=11){
                errores = errores + ", Cédula";
                this.lbErrorCedula.setText("*");
            }
            if((cedula.length()) == 11){
                ArrayList <Empleado> t = Registro.buscarEmpleado(TipoBusqueda.CEDULA, cedula);
                if(!(t.isEmpty())){
                     errores = errores + ", Cédula";
                     this.lbErrorCedula.setText("*");
                }
            }
                
            if(!(this.jtIDSupervisor.getText().equals(""))){
                ArrayList <Empleado> t = Registro.buscarEmpleado(TipoBusqueda.ID, idSupervisor);
                if(t.isEmpty()){
                    errores = errores + ", Supervisor(no encontrado)"; 
                    this.lbErrorIDSupervisor.setText("*");
                }
            }
            //Si el salario es menor que 0 y si el campo esta vacio
            if(this.jtSalario.getText().equals("") || (salario <0)){
                errores = errores + ", Salario"; 
                this.lbErrorSalario.setText("*");
            }
            
            if(errores.equals("Error: ")){
                limpiarVentana();
                Registro.crearEmpleado(nombre, apellido, cedula, departamento, idSupervisor, salario, Integer.toString((Registro.empleados.size())));
                this.lbBien.setText("Empleado añadido, ID: "+ Integer.toString((Registro.empleados.size())-1) + ", Nombre: "+ apellido +", "+ nombre);
            }else{
                this.lbMal.setText(errores + ".");
            }
        }catch(Exception NumbreFormartException){
            this.lbMal.setText("Error al ingresar el empleado, intentelo denuevo.");
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void cbTipoDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoDepartamentoActionPerformed
     
    }//GEN-LAST:event_cbTipoDepartamentoActionPerformed

    private void btAtrásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtrásActionPerformed
        MenuPrincipal obj = new MenuPrincipal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btAtrásActionPerformed

    private void jtIDSupervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIDSupervisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIDSupervisorActionPerformed

    private void jtCedula2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCedula2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCedula2ActionPerformed

    private void jtCedula3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCedula3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCedula3ActionPerformed

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && 
           (c!='á') && (c!='é') && (c!='í') && (c!='ó') && (c!='ú') && (c!='ñ') &&
           (c!='Á') && (c!='É') && (c!='Í') && (c!='Ó') && (c!='Ú') && (c!='Ñ') &&             
           (c!=(char)KeyEvent.VK_SPACE) ){
            evt.consume();
        }
        
        if(!(jtNombre.getText().equals(""))){
                this.lbBien.setText("");
            }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && 
           (c!='á') && (c!='é') && (c!='í') && (c!='ó') && (c!='ú') && (c!='ñ') &&
           (c!='Á') && (c!='É') && (c!='Í') && (c!='Ó') && (c!='Ú') && (c!='Ñ') &&             
           (c!=(char)KeyEvent.VK_SPACE) ){
            evt.consume();
        }
        
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtIDSupervisorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIDSupervisorKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jtIDSupervisorKeyTyped

    private void jtSalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtSalarioKeyTyped
        char c = evt.getKeyChar();
        if(jtSalario.getText().length()>=9) evt.consume();
        if(c<'0' || c>'9') evt.consume();     
    }//GEN-LAST:event_jtSalarioKeyTyped

    private void jtCedula1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCedula1KeyTyped
        char c = evt.getKeyChar();
        if(jtCedula1.getText().length()>=3){
            evt.consume();
            jtCedula2.requestFocus();
        }
        if(c<'0' || c>'9') evt.consume(); 
    }//GEN-LAST:event_jtCedula1KeyTyped

    private void jtCedula2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCedula2KeyTyped
        char c = evt.getKeyChar();
        if(jtCedula2.getText().length()>=7){
            evt.consume();
            jtCedula3.requestFocus();
        }
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jtCedula2KeyTyped

    private void jtCedula3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCedula3KeyTyped
        char c = evt.getKeyChar();
        if(jtCedula3.getText().length()>=1) evt.consume();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jtCedula3KeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtrás;
    private javax.swing.JButton btGuardar;
    private javax.swing.JComboBox cbTipoDepartamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCedula1;
    private javax.swing.JTextField jtCedula2;
    private javax.swing.JTextField jtCedula3;
    private javax.swing.JTextField jtIDSupervisor;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtSalario;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbBien;
    private javax.swing.JLabel lbCedula;
    private javax.swing.JLabel lbDepartamento;
    private javax.swing.JLabel lbErrorApellido;
    private javax.swing.JLabel lbErrorCedula;
    private javax.swing.JLabel lbErrorIDSupervisor;
    private javax.swing.JLabel lbErrorNombre;
    private javax.swing.JLabel lbErrorSalario;
    private javax.swing.JLabel lbIDSupervisor;
    private javax.swing.JLabel lbMal;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbSalario;
    // End of variables declaration//GEN-END:variables
}
