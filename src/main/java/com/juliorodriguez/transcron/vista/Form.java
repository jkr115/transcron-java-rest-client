package com.juliorodriguez.transcron.vista;

import javax.swing.*;

public class Form extends javax.swing.JFrame {

    public Form() {
        initComponents();
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public JTextField getTxfNoDocEmpresa() {
        return txfNoDocEmpresa;
    }

    public JTextField getTxfTipoDocEmpresa() {
        return txfTipoDocEmpresa;
    }

    public JTextField getTxfNombreEmpresa() {
        return txfNombreEmpresa;
    }

    public JTextField getTxfDireccionEmpresa() {
        return txfDireccionEmpresa;
    }

    public JTextField getTxfCiudadEmpresa() {
        return txfCiudadEmpresa;
    }

    public JTextField getTxfDepartamentoEmpresa() {
        return txfDepartamentoEmpresa;
    }

    public JTextField getTxfPaisEmpresa() {
        return txfPaisEmpresa;
    }

    public JTextField getTxfTelefonoEmpresa() {
        return txfTelefonoEmpresa;
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblNoDocEmpresa = new javax.swing.JLabel();
        lblTipoDocEmpresa = new javax.swing.JLabel();
        lblNombreEmpresa = new javax.swing.JLabel();
        lblDireccionEmpresa = new javax.swing.JLabel();
        lblCiudadEmpresa = new javax.swing.JLabel();
        lblDepartamentoEmpresa = new javax.swing.JLabel();
        lblPaisEmpresa = new javax.swing.JLabel();
        lblTelefonoEmpresa= new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txfNoDocEmpresa = new javax.swing.JTextField();
        txfTipoDocEmpresa = new javax.swing.JTextField();
        txfNombreEmpresa = new javax.swing.JTextField();
        txfDireccionEmpresa = new javax.swing.JTextField();
        txfCiudadEmpresa = new javax.swing.JTextField();
        txfDepartamentoEmpresa = new javax.swing.JTextField();
        txfPaisEmpresa = new javax.swing.JTextField();
        txfTelefonoEmpresa = new javax.swing.JTextField();


        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblNoDocEmpresa.setText("No. Documento");
        lblTipoDocEmpresa.setText("Tipo Documento");
        lblNombreEmpresa.setText("Nombre Empresa");
        lblDireccionEmpresa.setText("Dirección");
        lblCiudadEmpresa.setText("Ciudad");
        lblDepartamentoEmpresa.setText("Departamento");
        lblPaisEmpresa.setText("País");
        lblTelefonoEmpresa.setText("Teléfono");

        btnRegistrar.setText("Registrar");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNoDocEmpresa)
                                        .addComponent(lblTipoDocEmpresa)
                                        .addComponent(lblNombreEmpresa)
                                        .addComponent(lblDireccionEmpresa)
                                        .addComponent(lblCiudadEmpresa)
                                        .addComponent(lblDepartamentoEmpresa)
                                        .addComponent(lblPaisEmpresa)
                                        .addComponent(lblTelefonoEmpresa))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txfNoDocEmpresa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                        .addComponent(txfTipoDocEmpresa, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txfNombreEmpresa, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txfDireccionEmpresa, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txfCiudadEmpresa, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txfDepartamentoEmpresa, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txfPaisEmpresa, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txfTelefonoEmpresa, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addContainerGap(192, Short.MAX_VALUE)
                                .addComponent(btnRegistrar)
                                .addGap(192, 192, 192))
        );
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNoDocEmpresa)
                                        .addComponent(txfNoDocEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTipoDocEmpresa)
                                        .addComponent(txfTipoDocEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNoDocEmpresa)
                                        .addComponent(txfNoDocEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNombreEmpresa)
                                        .addComponent(txfNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblDireccionEmpresa)
                                        .addComponent(txfDireccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblCiudadEmpresa)
                                        .addComponent(txfCiudadEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblDepartamentoEmpresa)
                                        .addComponent(txfDepartamentoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPaisEmpresa)
                                        .addComponent(txfPaisEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTelefonoEmpresa)
                                        .addComponent(txfTelefonoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addComponent(btnRegistrar)
                                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    // Variables declaration - do not modify
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField txfNoDocEmpresa;
    private javax.swing.JTextField txfTipoDocEmpresa;
    private javax.swing.JTextField txfNombreEmpresa;
    private javax.swing.JTextField txfDireccionEmpresa;
    private javax.swing.JTextField txfCiudadEmpresa;
    private javax.swing.JTextField txfDepartamentoEmpresa;
    private javax.swing.JTextField txfPaisEmpresa;
    private javax.swing.JTextField txfTelefonoEmpresa;
    private javax.swing.JLabel lblNoDocEmpresa;
    private javax.swing.JLabel lblTipoDocEmpresa;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblDireccionEmpresa;
    private javax.swing.JLabel lblCiudadEmpresa;
    private javax.swing.JLabel lblDepartamentoEmpresa;
    private javax.swing.JLabel lblPaisEmpresa;
    private javax.swing.JLabel lblTelefonoEmpresa;
    private javax.swing.JPanel panel;
    // End of variables declaration
}
