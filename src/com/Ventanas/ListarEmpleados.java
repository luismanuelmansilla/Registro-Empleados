package com.Ventanas;

import com.Class.Comparadores.CompEmpSalario;
import com.Class.Comparadores.CompEmpNombre;
import com.Class.Comparadores.CompEmpIdSupervisor;
import com.Class.Comparadores.CompEmpCedula;
import com.Class.*;
import static com.Class.Registro.empleados;
import com.Ventanas.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class ListarEmpleados extends javax.swing.JFrame {
    public ListarEmpleados() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("");
        
        tablaDefault(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbAtras = new javax.swing.JButton();
        cbTipoBusqueda = new javax.swing.JComboBox();
        jbBuscar = new javax.swing.JButton();
        jtBusquedaPersonalizada = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLista = new javax.swing.JTable();
        jbIrAEditarEmpleado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbAtras.setText("Atrás");
        jbAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtrasActionPerformed(evt);
            }
        });

        cbTipoBusqueda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "Nombre", "Apellido", "Cédula", "Departamento de Servicio al cliente", "Departamento de Ventas", "Departamento de Almacen", "Departamento de Tecnología", "Supervisor", "Salario" }));
        cbTipoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoBusquedaActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jtBusquedaPersonalizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBusquedaPersonalizadaActionPerformed(evt);
            }
        });

        jLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jLista.setName(""); // NOI18N
        jScrollPane1.setViewportView(jLista);

        jbIrAEditarEmpleado.setText("Editar Un Empleado");
        jbIrAEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIrAEditarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jbBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtBusquedaPersonalizada, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbTipoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbIrAEditarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtBusquedaPersonalizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbIrAEditarEmpleado)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAtras)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtrasActionPerformed
        MenuPrincipal obj = new MenuPrincipal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbAtrasActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        String busquedaPersonalizada = jtBusquedaPersonalizada.getText();
        int indice = cbTipoBusqueda.getSelectedIndex();
        
        if(indice == 0)
            insertarTabla(Registro.buscarEmpleado(TipoBusqueda.ID, busquedaPersonalizada));
        if(indice == 1)
            insertarTabla(Registro.buscarEmpleado(TipoBusqueda.NOMBRE, busquedaPersonalizada));
        if(indice == 2)
           insertarTabla(Registro.buscarEmpleado(TipoBusqueda.APELLIDO, busquedaPersonalizada));
        if(indice == 3)
            insertarTabla(Registro.buscarEmpleado(TipoBusqueda.CEDULA, busquedaPersonalizada));  
        if(indice == 4)
            insertarTabla(Registro.buscarEmpleado(TipoBusqueda.SERVICIOCLIENTE, null));  
        if(indice == 5)
            insertarTabla(Registro.buscarEmpleado(TipoBusqueda.VENTAS, null));
        if(indice == 6)
            insertarTabla(Registro.buscarEmpleado(TipoBusqueda.ALMACEN, null));
        if(indice == 7)
            insertarTabla(Registro.buscarEmpleado(TipoBusqueda.TECNOLOGIA, null));
        if(indice == 8)
            Registro.buscarEmpleado(TipoBusqueda.SUPERVISOR, busquedaPersonalizada);
        if(indice == 9)
            Registro.buscarEmpleado(TipoBusqueda.SALARIO, busquedaPersonalizada);
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbIrAEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIrAEditarEmpleadoActionPerformed
        EditarEmpleado vent = new EditarEmpleado();
        vent.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbIrAEditarEmpleadoActionPerformed
    
    private void cbTipoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoBusquedaActionPerformed
        int indice = cbTipoBusqueda.getSelectedIndex();
        
        if(indice == 0){
            ArrayList<Empleado> temp = new ArrayList<Empleado>();
            temp.addAll(Registro.empleados);
            insertarTabla(temp);
        }
        if(indice == 1){
            ArrayList<Empleado> temp = new ArrayList<Empleado>();
            temp.addAll(Registro.empleados);
            Collections.sort(temp, new CompEmpNombre());
            insertarTabla(temp);  
        }
        if(indice == 2)
           tablaDefault();   
        if(indice == 3){
            ArrayList<Empleado> temp = new ArrayList<Empleado>();
            temp.addAll(Registro.empleados);
            Collections.sort(temp, new CompEmpCedula());
            insertarTabla(temp);
        }  
        if(indice == 4)
            insertarTabla(Registro.buscarEmpleado(TipoBusqueda.SERVICIOCLIENTE, null));  
        if(indice == 5)
            insertarTabla(Registro.buscarEmpleado(TipoBusqueda.VENTAS, null));
        if(indice == 6)
            insertarTabla(Registro.buscarEmpleado(TipoBusqueda.ALMACEN, null));
        if(indice == 7)
            insertarTabla(Registro.buscarEmpleado(TipoBusqueda.TECNOLOGIA, null));
        if(indice == 8){
            ArrayList<Empleado> temp = new ArrayList<Empleado>();
            temp.addAll(Registro.empleados);
            Collections.sort(temp, new CompEmpIdSupervisor());
            insertarTabla(temp);
        }
        if(indice == 9){
            ArrayList<Empleado> temp = new ArrayList<Empleado>();
            temp.addAll(Registro.empleados);
            Collections.sort(temp, new CompEmpSalario());
            insertarTabla(temp);
        }
    }//GEN-LAST:event_cbTipoBusquedaActionPerformed

    private void jtBusquedaPersonalizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBusquedaPersonalizadaActionPerformed

    }//GEN-LAST:event_jtBusquedaPersonalizadaActionPerformed
    
    public void tablaDefault(){
        ArrayList<Empleado> empleadosCopy = new ArrayList<Empleado>();
        empleadosCopy.addAll(Registro.empleados);
        Collections.sort(empleadosCopy);
        insertarTabla(empleadosCopy);
    }
    
    private void insertarTabla(ArrayList<Empleado> temp){
        
        DefaultTableModel manejadorTabla;
        manejadorTabla= new DefaultTableModel();
        manejadorTabla.addColumn("ID");
        manejadorTabla.addColumn("Nombre");
        manejadorTabla.addColumn("Apellido");
        manejadorTabla.addColumn("Cedula");
        manejadorTabla.addColumn("Departamento");
        manejadorTabla.addColumn("Supervisor");
        manejadorTabla.addColumn("Salario");
        this.jLista.setModel(manejadorTabla);
        
        for(int i=0; i<temp.size(); i++){
            String []empleado = new String [7];
            empleado[0] = temp.get(i).getId();
            empleado[1] = temp.get(i).getNombre();
            empleado[2] = temp.get(i).getApellido();
            empleado[3] = temp.get(i).getCedula();
            if(temp.get(i).getTipoDepartamento() == TipoDepartamento.SERVICIOCLIENTE)
                empleado[4] = "Servicio al Cliente";
            if(temp.get(i).getTipoDepartamento() == TipoDepartamento.VENTAS)
                empleado[4] = "Ventas";
            if(temp.get(i).getTipoDepartamento() == TipoDepartamento.ALMACEN)
                empleado[4] = "Almacen";
            if(temp.get(i).getTipoDepartamento() == TipoDepartamento.TECNOLOGIA)
                empleado[4] = "Tecnología";
            
            String idSupervisor = temp.get(i).getIdSupervisor();
            if(idSupervisor.equals("")){
                empleado[5] = "";
            }else{
                empleado[5] = Registro.empleados.get(Integer.parseInt(idSupervisor)).getNombre() + " " +
                              Registro.empleados.get(Integer.parseInt(idSupervisor)).getApellido();
            }
            empleado[6] = Integer.toString(temp.get(i).getSalario());
            
            manejadorTabla.addRow(empleado);
        }
    }
    
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
            java.util.logging.Logger.getLogger(ListarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarEmpleados().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbTipoBusqueda;
    private javax.swing.JTable jLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtras;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbIrAEditarEmpleado;
    private javax.swing.JTextField jtBusquedaPersonalizada;
    // End of variables declaration//GEN-END:variables
}