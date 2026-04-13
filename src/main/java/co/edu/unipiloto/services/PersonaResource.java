/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.services;

import co.edu.unipiloto.model.Persona;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author jdgal
 */
@Path("personas")
public class PersonaResource {

    PersonaService service = new PersonaService();

    // 1. Obtener lista
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Persona> getPersonas() {
        return service.getPersonas();
    }

    // 2. Agregar persona
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addPersona(Persona p) {
        service.addPersona(p);
    }

    // 3. Promedio salarios (XML)
    @GET
    @Path("promedio")
    @Produces(MediaType.APPLICATION_XML)
    public String getPromedio() {
        double promedio = service.getPromedioSalarios();
        return "<promedio>" + promedio + "</promedio>";
    }

    // 4. Suma salarios (JSON)
    @GET
    @Path("suma")
    @Produces(MediaType.APPLICATION_JSON)
    public String getSuma() {
        double suma = service.getSumaSalarios();
        return "{\"suma\":" + suma + "}";
    }
}