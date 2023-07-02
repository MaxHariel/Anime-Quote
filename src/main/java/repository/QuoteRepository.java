package repository;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import io.quarkus.mongodb.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import model.Quote;
import model.dto.PageListDTO;

@ApplicationScoped
public class QuoteRepository implements PanacheMongoRepository<Quote> {

    public PageListDTO<Quote> findByName(String name, Integer page) {
        PanacheQuery<Quote> quotes = find("{'character': {$regex: ?1, $options: 'i'}}", name);
        quotes.page(page-1, 2);

        PageListDTO<Quote> pagedlist = new PageListDTO<>();
        pagedlist.setItems(quotes.list());
        pagedlist.setHasNextPage(quotes.hasNextPage());
        pagedlist.setHasPreviousPage(quotes.hasPreviousPage());
        pagedlist.setPageCount(quotes.pageCount());

        return pagedlist;
    }
}
