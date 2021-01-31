package com.juliorodriguez.transcron.modelo;

public class Vehiculo {
    private String id;
    private String placa;
    private String empresa;
    private String tipo_doc_empresa;
    private String no_doc_empresa;
    private String representante_legal;
    private String tipo_doc_representante;
    private String no_doc_representante;
    private String no_conductores;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTipo_doc_empresa() {
        return tipo_doc_empresa;
    }

    public void setTipo_doc_empresa(String tipo_doc_empresa) {
        this.tipo_doc_empresa = tipo_doc_empresa;
    }

    public String getNo_doc_empresa() {
        return no_doc_empresa;
    }

    public void setNo_doc_empresa(String no_doc_empresa) {
        this.no_doc_empresa = no_doc_empresa;
    }

    public String getRepresentante_legal() {
        return representante_legal;
    }

    public void setRepresentante_legal(String representante_legal) {
        this.representante_legal = representante_legal;
    }

    public String getTipo_doc_representante() {
        return tipo_doc_representante;
    }

    public void setTipo_doc_representante(String tipo_doc_representante) {
        this.tipo_doc_representante = tipo_doc_representante;
    }

    public String getNo_doc_representante() {
        return no_doc_representante;
    }

    public void setNo_doc_representante(String no_doc_representante) {
        this.no_doc_representante = no_doc_representante;
    }

    public String getNo_conductores() {
        return no_conductores;
    }

    public void setNo_conductores(String no_conductores) {
        this.no_conductores = no_conductores;
    }
}
