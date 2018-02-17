package vista;

import controlador.controlasoc;
import java.util.LinkedList;
import javax.swing.JComponent;
import javax.swing.table.DefaultTableModel;
import modelo.Asociado;

public class addAsoc extends javax.swing.JInternalFrame {

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    Boolean enatxt = false;
    LinkedList<Asociado> ListadoAsociados= new LinkedList<Asociado>();

    public addAsoc() {
        initComponents();
        Barra.remove(0);
        enabletxtcontrol();
        btnCancelar.setVisible(false);
        filltableall();
//        btntest.setVisible(false);
    }

    public void enabletxtcontrol(){
        txtEmailasoc.setEnabled(enatxt);
        txtNomasoc.setEnabled(enatxt);
        txtPassPortalasoc.setEnabled(enatxt);
        txtTelasoc.setEnabled(enatxt);
        txtUserPortalasoc.setEnabled(enatxt);
        if(enatxt == true){
            enatxt = false;
        }else
            enatxt = true;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomasoc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTelasoc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmailasoc = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtUserPortalasoc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPassPortalasoc = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmuestra = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtAsocbucador = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnNuevoAsoc = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btntest = new javax.swing.JButton();

        setClosable(true);
        setTitle("Socios DM Guerrero");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Información"));

        jLabel1.setText("Nombre");

        txtNomasoc.setEnabled(false);

        jLabel2.setText("Telefono");

        txtTelasoc.setEnabled(false);

        jLabel3.setText("E-mail");

        txtEmailasoc.setEnabled(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Acceso Portal Administrativo"));

        txtUserPortalasoc.setEnabled(false);

        jLabel15.setText("Usuario Portal");

        txtPassPortalasoc.setEnabled(false);

        jLabel16.setText("Contraseña");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserPortalasoc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassPortalasoc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(46, 46, 46)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserPortalasoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtPassPortalasoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmailasoc)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtNomasoc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelasoc)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomasoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelasoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailasoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Asociado"));

        tblmuestra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblmuestra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmuestraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblmuestra);
        if (tblmuestra.getColumnModel().getColumnCount() > 0) {
            tblmuestra.getColumnModel().getColumn(0).setMinWidth(50);
            tblmuestra.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel4.setText("Asociado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAsocbucador)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAsocbucador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnNuevoAsoc.setText("Nuevo");
        btnNuevoAsoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAsocActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btntest.setText("test");
        btntest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevoAsoc)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(38, 38, 38)
                        .addComponent(btntest)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnModificar)
                        .addComponent(btnNuevoAsoc))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btntest)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void controlbtns(){
        if(enatxt==true){btnCancelar.setVisible(false);}else{btnCancelar.setVisible(true);}
        btnModificar.setEnabled(enatxt);
        btnNuevoAsoc.setEnabled(enatxt);
    }
    
    private void btnNuevoAsocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAsocActionPerformed
        enabletxtcontrol();
        controlbtns();
        btnNuevoAsoc.setEnabled(true);
        btnNuevoAsoc.setText("Registrar");
        if(enatxt == true){ //Entra cuando el botón está en Registrar y se preciona para cambiar y realizar un INSERT IN TO
            /*
            *CODIGO AQUÍ
            */
            
            
            btnNuevoAsoc.setText("Nuevo");
        }
    }//GEN-LAST:event_btnNuevoAsocActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        enabletxtcontrol();
        controlbtns();
        btnNuevoAsoc.setText("Nuevo");
        btnModificar.setText("Modificar");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
//      enatxt es false cuando entra a modificar y true cuando sale
        enabletxtcontrol();
        controlbtns();
        btnModificar.setEnabled(true);
        btnModificar.setText("Guardar");
        if(enatxt == true){ //Entra cuando el botón está en Guardar y se preciona para cambiar y realizar la consulta UPDATE
            /*
            *CODIGO AQUÍ
            */
            
            
            btnModificar.setText("Modificar");
        }
        
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void filltableall(){
        controlasoc ctrlasoc = new controlasoc();
        DefaultTableModel dtm = (DefaultTableModel) tblmuestra.getModel();
//        LinkedList<Asociado> ListadoAsociados= new LinkedList<Asociado>();
        ListadoAsociados = ctrlasoc.Queryasocgeneral();
        dtm.setNumRows(0);
        
        for(int i =0; i<ListadoAsociados.size(); i++)
            {
               Object [] row = {ListadoAsociados.get(i).getIdasociado(), ListadoAsociados.get(i).getNombreasociado(), ListadoAsociados.get(i).getTelefonoasociado()};
               dtm.addRow(row);
            }
    }

    private void btntestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntestActionPerformed
            /* REVISIÓN<-------------------
//        controlasoc ctrlasoc = new controlasoc();
//        DefaultTableModel dtm = (DefaultTableModel) tblmuestra.getModel();
//        ListadoAsociados = ctrlasoc.Queryasocbuscar(txtAsocbucador.getText());
//        dtm.setNumRows(0);
//        
//        for(int i =0; i<ListadoAsociados.size(); i++)
//            {
//               Object [] row = {ListadoAsociados.get(i).getIdasociado(), ListadoAsociados.get(i).getNombreasociado(), ListadoAsociados.get(i).getTelefonoasociado()};
//               dtm.addRow(row);
//            }
            REVISIÓN<-------------------*/
    }//GEN-LAST:event_btntestActionPerformed

    private void tblmuestraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmuestraMouseClicked
        // TODO add your handling code here:
        controlasoc ctrlasoc = new controlasoc();
        DefaultTableModel dtm = (DefaultTableModel) tblmuestra.getModel();
        int aux = tblmuestra.getSelectedRow();
        txtNomasoc.setText(ListadoAsociados.get(aux).getNombreasociado()+ "");
        txtTelasoc.setText(ListadoAsociados.get(aux).getTelefonoasociado()+ "");
        txtUserPortalasoc.setText(ListadoAsociados.get(aux).getUserasociado()+ "");
        txtPassPortalasoc.setText(ListadoAsociados.get(aux).getPassasociado()+ "");
        txtEmailasoc.setText(ListadoAsociados.get(aux).getCorreoasociado()+ "");
    }//GEN-LAST:event_tblmuestraMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevoAsoc;
    private javax.swing.JButton btntest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblmuestra;
    private javax.swing.JTextField txtAsocbucador;
    private javax.swing.JTextField txtEmailasoc;
    private javax.swing.JTextField txtNomasoc;
    private javax.swing.JTextField txtPassPortalasoc;
    private javax.swing.JTextField txtTelasoc;
    private javax.swing.JTextField txtUserPortalasoc;
    // End of variables declaration//GEN-END:variables
}
