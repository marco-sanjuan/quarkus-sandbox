package com.marco.quarkussandbox.greeting;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingsResource {

    @Inject
    private GreetingsGenerator greetingsGenerator;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return greetingsGenerator.generate();
    }
}