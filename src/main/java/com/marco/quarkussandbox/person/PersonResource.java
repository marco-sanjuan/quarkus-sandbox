package com.marco.quarkussandbox.person;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/person")
public class PersonResource {

    @GET
    @Path("/1")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson() {
        return new Person("Markus", "Smith", 30, true);
    }

    @POST
    //TESTING: curl -d '{"age":30,"hasPet":true,"lastName":"Smith","name":"Markus"}' -H "Content-Type: application/json" -X POST http://localhost:8080/person
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createPerson(@Valid Person person){
        System.out.println("Created: " + person);
        return Response.ok().build();
    }

}