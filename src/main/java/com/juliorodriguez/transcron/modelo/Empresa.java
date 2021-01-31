package com.juliorodriguez.transcron.modelo;

public class Empresa {

    private String id;
    private String no_documento;
    private String tipo;
    private String nombre;
    private String direccion;
    private String ciudad;
    private String departamento;
    private String pais;
    private String telefono;

    public String getId() { return id; }

    public void setId(String id) {
        this.id = id;
    }

    public String getNo_documento() { return no_documento; }

    public void setNo_documento(String no_documento) {
        this.no_documento = no_documento;
    }

    public String getTipo() { return tipo;    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() { return nombre;    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() { return direccion; }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() { return ciudad;    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() { return departamento;    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPais() { return pais;    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() { return telefono;    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", no_documento=" + no_documento +
                ", tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", departamento='" + departamento + '\'' +
                ", pais='" + pais + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
