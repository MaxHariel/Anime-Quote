package resource;
import org.jboss.resteasy.reactive.RestQuery;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import model.Quote;
import model.dto.PageListDTO;
import service.QuoteService;

@Path("/quotes")
public class QuoteResource {
    
    @Inject
    QuoteService quoteService;

    @GET
    public PageListDTO<Quote> list(@RestQuery("name") String name, @RestQuery("page") int page) {
        return quoteService.list(name, page);
    }
}
