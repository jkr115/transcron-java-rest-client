package com.juliorodriguez.transcron.modelo;

import com.juliorodriguez.transcron.utilidades.EmpresaRestClient;
import com.juliorodriguez.transcron.utilidades.VehiculoRestClient;

import java.util.Vector;

public class Modelo {
    public Vector empresas;
    public Vector vehiculos;
    public EmpresaRestClient clientEmpresa;
    public VehiculoRestClient clientVehiculo;

    public Modelo() {
        //this.client = new NewJerseyClient();
        this.clientEmpresa = new EmpresaRestClient();
        this.clientVehiculo = new VehiculoRestClient();
        this.empresas = new Vector();
    }

    public Vector getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Vector empresas) {
        this.empresas = empresas;
    }

    public Vector getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vector vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void recuperarEmpresas(){
        this.clientEmpresa = new EmpresaRestClient();
        empresas = clientEmpresa.getAllEmpresas();
    }

    public void crearEmpresa(Empresa empresa){
        this.clientEmpresa = new EmpresaRestClient();
        clientEmpresa.postOneEmpresa(empresa);
    }

    public void modificarEmpresa(Empresa empresa){
        this.clientEmpresa = new EmpresaRestClient();
        clientEmpresa.putOneEmpresa(empresa);
    }

    public void eliminarEmpresa(String id){
        this.clientEmpresa = new EmpresaRestClient();
            clientEmpresa.deleteEmpresa(id);
    }

    public void recuperarVehiculos(){
        this.clientVehiculo = new VehiculoRestClient();
        vehiculos = clientVehiculo.getAllVehiculos();
    }

}