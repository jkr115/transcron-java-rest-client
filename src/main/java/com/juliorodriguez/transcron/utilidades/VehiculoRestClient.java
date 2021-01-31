package com.juliorodriguez.transcron.utilidades;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.juliorodriguez.transcron.modelo.Empresa;
import com.juliorodriguez.transcron.modelo.Vehiculo;
import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.Vector;

public class VehiculoRestClient {
    Properties propiedades = new Properties();
    private static final String EMPRESA_RESOURCE = "vehiculogeneral";

    private WebTarget webTarget;
    private Client client;

    public VehiculoRestClient() {
        try {
            propiedades.load(new FileReader("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        client = ClientBuilder.newClient(
                new ClientConfig().register(JacksonJsonProvider.class));
        webTarget = client.target(propiedades.getProperty("URL_BASE_API")).path(EMPRESA_RESOURCE);
    }

    public Vector getAllVehiculos()  {

        Response response = webTarget
                .request(MediaType.APPLICATION_JSON)
                .get();

        System.out.println();
        System.out.println("GET All StatusCode = " + response.getStatus());
        System.out.println("GET All Headers = " + response.getHeaders());
        System.out.println("GET Body (object list): ");

        return new Vector(Arrays.asList(response.readEntity(Vehiculo[].class)));

    }

}
