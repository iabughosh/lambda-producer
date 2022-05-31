package io.quarkus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello jaxrs";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("rest")
    public GreetingMsg helloRest() {
        GreetingMsg greetingMsg = new GreetingMsg();
        greetingMsg.msg = "Hello Lambda!";

        return greetingMsg;
    }
}