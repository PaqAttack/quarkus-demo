package org.paqattack.app.model;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class FilmResource {

    @GET
    @Path("/helloWorld")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello, World!";
    }

    @GET
    @Path("/helloWorld3")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello3() {
        return "Hello, World. This is 4";
    }
}
