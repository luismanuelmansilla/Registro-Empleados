
package com.Ventanas;
import com.Class.*;
import com.Ventanas.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;


public class EditarEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form EditarEmpleado
     */
    public EditarEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atras = new javax.swing.JButton();
        lbID = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        elegir = new javax.swing.JButton();
        lbBienID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtIdSupervisor = new javax.swing.JTextField();
        jtSalario = new javax.swing.JTextField();
        cbTipoDepartamento = new javax.swing.JComboBox();
        lbErrorID = new javax.swing.JLabel();
        lbErrorContacto = new javax.swing.JLabel();
        lbBienContacto = new javax.swing.JLabel();
        jtCedula1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtCedula2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtCedula3 = new javax.swing.JTextField();
        lbErrorNombre2 = new javax.swing.JLabel();
        lbErrorIDSupervisor = new javax.swing.JLabel();
        lbErrorSalario = new javax.swing.JLabel();
        lbErrorCedula = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        lbID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbID.setText("ID Empleado:");

        jtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIDKeyTyped(evt);
            }
        });

        elegir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        elegir.setText("Elegir");
        elegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elegirActionPerformed(evt);
            }
        });

        lbBienID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbBienID.setForeground(new java.awt.Color(0, 153, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cédula:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Departamento:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("ID Supervisor:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Salario:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jtIdSupervisor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIdSupervisorKeyTyped(evt);
            }
        });

        jtSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtSalarioKeyTyped(evt);
            }
        });

        cbTipoDepartamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Servicio al cliente", "Ventas", "Almacen", "Tecnología" }));
        cbTipoDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoDepartamentoActionPerformed(evt);
            }
        });

        lbErrorID.setForeground(new java.awt.Color(255, 0, 0));

        lbErrorContacto.setForeground(new java.awt.Color(255, 51, 0));

        lbBienContacto.setForeground(new java.awt.Color(0, 204, 0));

        jtCedula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCedula1ActionPerformed(evt);
            }
        });
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

        jLabel8.setText("-");

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

        lbErrorNombre2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbErrorNombre2.setForeground(new java.awt.Color(255, 51, 0));

        lbErrorIDSupervisor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbErrorIDSupervisor.setForeground(new java.awt.Color(255, 51, 0));

        lbErrorSalario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbErrorSalario.setForeground(new java.awt.Color(255, 51, 0));

        lbErrorCedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbErrorCedula.setForeground(new java.awt.Color(255, 51, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Editor de empleados:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(atras)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtCedula2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtCedula3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbErrorCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbErrorNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtNombre)
                                    .addComponent(jtApellido)
                                    .addComponent(cbTipoDepartamento, 0, 280, Short.MAX_VALUE)
                                    .addComponent(jtIdSupervisor)
                                    .addComponent(jtSalario, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbErrorIDSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbErrorSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(176, 176, 176))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lbBienID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(222, 222, 222))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbBienContacto, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(lbErrorContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbID)
                                .addGap(33, 33, 33)
                                .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(elegir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbErrorID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbID)
                        .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(elegir))
                    .addComponent(lbErrorID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbBienID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jtCedula2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jtCedula3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbErrorNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbErrorCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtIdSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(lbErrorIDSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(lbErrorSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErrorContacto, javax.swing.GroupLayout.DEFAULT_SIZE, 3, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(lbBienContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(19, 19, 19)
                .addComponent(atras)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        ListarEmpleados obj = new ListarEmpleados();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasActionPerformed
    
    public void limpiarErrores(){
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
        this.jtIdSupervisor.setText("");
        this.jtSalario.setText("");
        this.jtID.setText("");
        this.lbBienContacto.setText("");
        this.lbBienID.setText("");
        this.lbErrorID.setText("");
        this.lbErrorContacto.setText("");
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String errores = "Error: ";
            
            String nombre = this.jtNombre.getText(); 
            String apellido = this.jtApellido.getText();
            String cedula = this.jtCedula1.getText() + this.jtCedula2.getText() + this.jtCedula3.getText();
            TipoDepartamento departamento = TipoDepartamento.SERVICIOCLIENTE;
            String idSupervisor = this.jtIdSupervisor.getText();
            String salario1 =this.jtSalario.getText();
            int salario=0;
                        
            if(!(salario1.equals("")))
                salario = Integer.parseInt(salario1);
            
            int indiceCB = cbTipoDepartamento.getSelectedIndex();
            if(indiceCB==0){departamento = TipoDepartamento.SERVICIOCLIENTE;}
            if(indiceCB==1){departamento = TipoDepartamento.VENTAS;}
            if(indiceCB==2){departamento = TipoDepartamento.ALMACEN;}
            if(indiceCB==3){departamento = TipoDepartamento.TECNOLOGIA;}
            
            //Set departamento editado
            if(departamento == TipoDepartamento.SERVICIOCLIENTE){
                Registro.empleados.get(ID).setTipoDepartamento(TipoDepartamento.SERVICIOCLIENTE);
            }
            if(departamento == TipoDepartamento.VENTAS){
                Registro.empleados.get(ID).setTipoDepartamento(TipoDepartamento.VENTAS);
            }
            if(departamento == TipoDepartamento.ALMACEN){
                Registro.empleados.get(ID).setTipoDepartamento(TipoDepartamento.ALMACEN);
            }
            if(departamento == TipoDepartamento.TECNOLOGIA){
                Registro.empleados.get(ID).setTipoDepartamento(TipoDepartamento.TECNOLOGIA);
            }
            
            if(!(nombre.equals("")))
                Registro.empleados.get(ID).setNombre(nombre);
            
            if(!(apellido.equals("")))
                Registro.empleados.get(ID).setApellido(apellido);
            
            if(!(cedula.equals(""))){
                if((cedula.length()) == 11){
                Registro.empleados.get(ID).setCedula(cedula);
                }else{
                    errores = errores + " Cédula";
                    this.lbErrorCedula.setText("*");
                }
            }
       
            if(!(salario1.equals(""))){
                if(salario >= Registro.empleados.get(ID).getSalario())
                    Registro.empleados.get(ID).setSalario(salario);
                else{
                    errores = errores + " Salario";
                    this.lbErrorSalario.setText("*");
                }
            }
            
            if(!(idSupervisor.equals(""))){
                if((Registro.buscarEmpleado(TipoBusqueda.ID, idSupervisor)).isEmpty()){
                    errores = errores + " Supervisor (no encontrado)";
                    this.lbErrorIDSupervisor.setText("*");
                }else
                    Registro.empleados.get(ID).setIdSupervisor(idSupervisor);
            }else{
                Registro.empleados.get(ID).setIdSupervisor(idSupervisor);
            }
            
            if(errores.equals("Error: ")){ 
                limpiarVentana();
                this.lbBienContacto.setText("Empleado editado con éxito");
            }
            else this.lbErrorContacto.setText(errores);
        }catch(Exception e){
            this.lbBienContacto.setText("");
            this.lbErrorContacto.setText("Error al editar empleado");
        }
        this.ID = 1000000000;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void elegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elegirActionPerformed
        try{

            String IDS = jtID.getText();
            
            limpiarErrores();
            limpiarVentana();
            this.jtID.setText(IDS);
            if(!(IDS.equals(""))){
                this.ID = Integer.parseInt(IDS);
                this.jtNombre.setText(Registro.empleados.get(this.ID).getNombre());
                this.jtApellido.setText(Registro.empleados.get(this.ID).getApellido());
                String cedula1 = (Registro.empleados.get(this.ID).getCedula()).substring(0,3);
                String cedula2 = (Registro.empleados.get(this.ID).getCedula()).substring(3,10);
                String cedula3 = (Registro.empleados.get(this.ID).getCedula()).substring(10,11);
                this.jtCedula1.setText(cedula1);
                this.jtCedula2.setText(cedula2);
                this.jtCedula3.setText(cedula3);
                if(Registro.empleados.get(this.ID).getTipoDepartamento() == TipoDepartamento.SERVICIOCLIENTE)
                    this.cbTipoDepartamento.setSelectedItem("Servicio al cliente");
                if(Registro.empleados.get(this.ID).getTipoDepartamento() == TipoDepartamento.VENTAS)
                    this.cbTipoDepartamento.setSelectedItem("Ventas");
                if(Registro.empleados.get(this.ID).getTipoDepartamento() == TipoDepartamento.ALMACEN)
                    this.cbTipoDepartamento.setSelectedItem("Almacen");
                if(Registro.empleados.get(this.ID).getTipoDepartamento() == TipoDepartamento.TECNOLOGIA)
                    this.cbTipoDepartamento.setSelectedItem("Tecnología");
                this.jtIdSupervisor.setText(Registro.empleados.get(this.ID).getIdSupervisor());
                this.jtSalario.setText(Integer.toString(Registro.empleados.get(this.ID).getSalario()));
            }else{this.lbErrorID.setText("Error, digite el ID");}
        }catch(Exception e){
            this.lbErrorID.setText("Error al buscar empleado");
        }
    }//GEN-LAST:event_elegirActionPerformed

    private void cbTipoDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoDepartamentoActionPerformed

    }//GEN-LAST:event_cbTipoDepartamentoActionPerformed

    private void jtCedula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCedula1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCedula1ActionPerformed

    private void jtCedula2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCedula2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCedula2ActionPerformed

    private void jtCedula3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCedula3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCedula3ActionPerformed

    private void jtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIDKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();     
    }//GEN-LAST:event_jtIDKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && 
           (c!='á') && (c!='é') && (c!='í') && (c!='ó') && (c!='ú') && (c!='ñ') &&
           (c!='Á') && (c!='É') && (c!='Í') && (c!='Ó') && (c!='Ú') && (c!='Ñ') &&             
           (c!=(char)KeyEvent.VK_SPACE) ){
            evt.consume();
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

    private void jtIdSupervisorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdSupervisorKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();     
    }//GEN-LAST:event_jtIdSupervisorKeyTyped

    private void jtSalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtSalarioKeyTyped
        char c = evt.getKeyChar();
         if(jtSalario.getText().length()>9) evt.consume();
        if(c<'0' || c>'9') evt.consume();     
    }//GEN-LAST:event_jtSalarioKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarEmpleado().setVisible(true);
            }
        });
    }
    public int ID=1000000000;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JComboBox cbTipoDepartamento;
    private javax.swing.JButton elegir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCedula1;
    private javax.swing.JTextField jtCedula2;
    private javax.swing.JTextField jtCedula3;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtIdSupervisor;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtSalario;
    private javax.swing.JLabel lbBienContacto;
    private javax.swing.JLabel lbBienID;
    private javax.swing.JLabel lbErrorCedula;
    private javax.swing.JLabel lbErrorContacto;
    private javax.swing.JLabel lbErrorID;
    private javax.swing.JLabel lbErrorIDSupervisor;
    private javax.swing.JLabel lbErrorNombre2;
    private javax.swing.JLabel lbErrorSalario;
    private javax.swing.JLabel lbID;
    // End of variables declaration//GEN-END:variables
}
