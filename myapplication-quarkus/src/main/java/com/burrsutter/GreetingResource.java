package com.burrsutter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

    private String from = "Supersonic Subatomic Java with Quarkus";
    
    private String HOSTNAME =
       System.getenv().getOrDefault("HOSTNAME", "unknown");

    private int count = 0;

    String greeting;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String myroot() {
        greeting = System.getenv().getOrDefault("GREETING","Jambo");
        count++;
        String result = greeting + " from " + from + " on " + HOSTNAME + ":" + count + "\n";
        System.out.println(result);
        return result;
    }

    @GET
    @Path("/alive")
    public String iamalive() {
        return "OK";
    }
 
    @GET
    @Path("/health")
    public String ready() {
        return "OK";
    }
 
}