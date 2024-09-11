package click.klaassen;

import org.jboss.resteasy.reactive.RestQuery;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    private AiService aiService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@RestQuery("question") String question) {
        return aiService.request(question);
    }
}
