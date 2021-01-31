package com.juliorodriguez.transcron.controlador;

import com.juliorodriguez.transcron.modelo.Empresa;
import com.juliorodriguez.transcron.modelo.Modelo;
import com.juliorodriguez.transcron.vista.Form;
import com.juliorodriguez.transcron.vista.Vista;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class Controlador implements ActionListener {

    public Modelo m;
    public Vista v;
    public JFrame f;
    public Form form;

    public Empresa empresa;

    private int selectedRow = -1;

    private boolean registro;


    public Controlador() {
        m = new Modelo();
        v = new Vista();
        f = new JFrame();
        form = new Form();
        eventoTabla();
    }

    public static void main(String[] args) {
        Controlador main = new Controlador();

        main.form.getBtnRegistrar().addActionListener(main);
        main.v.getBtnCrear().addActionListener(main);
        main.v.getBtnEliminar().addActionListener(main);
        main.v.getBtnActualizar().addActionListener(main);
        main.v.getBtnEmpresa().addActionListener(main);
        main.v.getBtnCrear().setVisible(false);
        main.v.getBtnActualizar().setVisible(false);
        main.v.getBtnEliminar().setVisible(false);

        main.m.recuperarVehiculos();
        //main.m.recuperarEmpresas();
        //main.vista.setData(main.modelo.getEmpresas());
        //main.vista.cargarTablaEmpresas();
        main.v.setData(main.m.getVehiculos());
        main.v.cargarTablaVehiculo();
        JOptionPane.showMessageDialog(null,"La vista por defecto muestra el resultado " +
                "de la consulta según el requerimiento de la prueba");
        //System.out.println(main.m.empresas);

        main.f.add(main.v);
        main.f.setSize(700, 400);
        main.f.setVisible(true);
        //main.f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void eventoTabla(){
        v.getTableEmpresa().getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                selectedRow = v.getTableEmpresa().getSelectedRow();
                //System.out.println(selectedRow);
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (v.getBtnCrear() == e.getSource()) {
            form.getTxfNoDocEmpresa().setText("");
            form.getTxfTipoDocEmpresa().setText("");
            form.getTxfNombreEmpresa().setText("");
            form.getTxfDireccionEmpresa().setText("");
            form.getTxfCiudadEmpresa().setText("");
            form.getTxfDepartamentoEmpresa().setText("");
            form.getTxfPaisEmpresa().setText("");
            form.getTxfTelefonoEmpresa().setText("");
            form.setTitle("Crear nueva empresa");
            form.getBtnRegistrar().setText("Registrar");
            form.setVisible(true);
            registro = true;
        }

        if (v.getBtnActualizar()== e.getSource()) {
            if (selectedRow > -1){
                Vector objeto = (Vector) v.getModelo().getDataVector().get(selectedRow);

                form.getTxfNoDocEmpresa().setText(String.valueOf(objeto.get(1)));
                form.getTxfTipoDocEmpresa().setText(String.valueOf(objeto.get(2)));
                form.getTxfNombreEmpresa().setText(String.valueOf(objeto.get(3)));
                form.getTxfDireccionEmpresa().setText(String.valueOf(objeto.get(4)));
                form.getTxfCiudadEmpresa().setText(String.valueOf(objeto.get(5)));
                form.getTxfDepartamentoEmpresa().setText(String.valueOf(objeto.get(6)));
                form.getTxfPaisEmpresa().setText(String.valueOf(objeto.get(7)));
                form.getTxfTelefonoEmpresa().setText(String.valueOf(objeto.get(8)));
                form.setTitle("Actualizar empresa");
                form.getBtnRegistrar().setText("Actualizar");
                form.setVisible(true);
                registro = false;
            } else
                JOptionPane.showMessageDialog(null,"Debes seleccionar un registro");
        }

        if(v.getBtnEliminar() == e.getSource()){
            if (selectedRow > -1){
                Vector objeto = (Vector) this.v.getModelo().getDataVector().get(selectedRow);
                empresa = new Empresa();
                empresa.setId(String.valueOf(objeto.get(0)));
                m.eliminarEmpresa(empresa.getId());
                m.recuperarEmpresas();
                v.setData(m.getEmpresas());
                v.cargarTablaEmpresas();
            } else
                JOptionPane.showMessageDialog(null,"Debes seleccionar un registro");
        }

        if (form.getBtnRegistrar() == e.getSource()) {
            if(camposLlenos()){
                if(registro)
                    m.crearEmpresa(empresa);
                else{
                    Vector objeto = (Vector) this.v.getModelo().getDataVector().get(selectedRow);
                    empresa.setId(String.valueOf(objeto.get(0)));
                    m.modificarEmpresa(empresa);
                }

                m.recuperarEmpresas();
                v.setData(m.getEmpresas());
                v.cargarTablaEmpresas();
                form.setVisible(false);
            } else
                JOptionPane.showMessageDialog(null,"Rellena todos los campos!");
        }

        if (v.getBtnEmpresa() == e.getSource()) {
            v.getScrollPane().setViewportView(v.getTableEmpresa());
            m.recuperarEmpresas();
            v.setData(m.getEmpresas());
            v.cargarTablaEmpresas();
            form.setVisible(false);
            v.getTableEmpresa().setVisible(true);
            v.getBtnCrear().setVisible(true);
            v.getBtnActualizar().setVisible(true);
            v.getBtnEliminar().setVisible(true);
            v.getBtnEmpresa().setVisible(false);
        }

    }

    public boolean camposLlenos() {
        empresa = new Empresa();
        this.empresa.setNo_documento(form.getTxfNoDocEmpresa().getText());
        this.empresa.setTipo(form.getTxfTipoDocEmpresa().getText());
        this.empresa.setNombre(form.getTxfNombreEmpresa().getText());
        this.empresa.setDireccion(form.getTxfDireccionEmpresa().getText());
        this.empresa.setCiudad(form.getTxfCiudadEmpresa().getText());
        this.empresa.setDepartamento(form.getTxfDepartamentoEmpresa().getText());
        this.empresa.setPais(form.getTxfPaisEmpresa().getText());
        this.empresa.setTelefono(form.getTxfTelefonoEmpresa().getText());

        if(empresa.getNo_documento().equals("") || empresa.getTipo().equals("") || empresa.getNombre().equals("") ||
                empresa.getDireccion().equals("")  || empresa.getCiudad().equals("") ||
                empresa.getDepartamento().equals("") || empresa.getPais().equals("") ||
                empresa.getTelefono().equals(""))
            return false;

        return true;
    }
}
