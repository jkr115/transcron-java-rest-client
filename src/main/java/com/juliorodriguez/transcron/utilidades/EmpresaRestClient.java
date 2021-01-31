package com.juliorodriguez.transcron.utilidades;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.juliorodriguez.transcron.modelo.Empresa;
import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.Vector;

public class EmpresaRestClient {
    Properties propiedades = new Properties();
    private static final String EMPRESA_RESOURCE = "empresa";
    private static final String POST = "nuevo";
    private static final String DELETE = "eliminar";
    private static final String PUT = "modificar";

    private WebTarget webTarget;
    private Client client;

    public EmpresaRestClient() {
        try {
            propiedades.load(new FileReader("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        client = ClientBuilder.newClient(
                new ClientConfig().register(JacksonJsonProvider.class));
        webTarget = client.target(propiedades.getProperty("URL_BASE_API")).path(EMPRESA_RESOURCE);
    }

    public Vector getAllEmpresas()  {

        Response response = webTarget
                .request(MediaType.APPLICATION_JSON)
                .get();

        System.out.println();
        System.out.println("GET All StatusCode = " + response.getStatus());
        System.out.println("GET All Headers = " + response.getHeaders());
        System.out.println("GET Body (object list): ");

        return new Vector(Arrays.asList(response.readEntity(Empresa[].class)));

    }

    public void postOneEmpresa(Empresa empresa) {

        Response response = webTarget.path(POST)
                .request()
                .post(Entity.entity(empresa, MediaType.APPLICATION_JSON_TYPE));

        System.out.println();
        System.out.println("POST executed");
        System.out.println("POST StatusCode = " + response.getStatus());
        System.out.println("POST Header location = "
                + response.getHeaders().get("location"));
    }

    public void deleteEmpresa(String id) {
        Response response = webTarget.path(DELETE)
                .path(id)
                .request()
                .delete();

        System.out.println();
        System.out.println("DELETE StatusCode = " + response.getStatus());
        System.out.println("DELETE Headers = " + response.getHeaders());
    }

    public void putOneEmpresa(Empresa empresa) {
        Response response = webTarget.path(PUT)
                .path(empresa.getId())
                .request()
                .put(Entity.entity(empresa, MediaType.APPLICATION_JSON_TYPE));

        System.out.println();
        System.out.println("PUT StatusCode = " + response.getStatus());
        System.out.println("PUT Headers = " + response.getHeaders());
    }

    private static void getOneEmpresa(WebTarget webTarget) {
        Response response = webTarget.path("3")
                .request(MediaType.APPLICATION_JSON_TYPE)
                .get();

        System.out.println();
        System.out.println("GET StatusCode = " + response.getStatus());
        System.out.println("GET Headers = " + response.getHeaders());
        System.out.println("GET Body (object): "
                + response.readEntity(Empresa.class));

    }
}
