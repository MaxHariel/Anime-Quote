package service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import model.Quote;
import model.dto.PageListDTO;
import repository.QuoteRepository;

@ApplicationScoped
public class QuoteService {

    @Inject
    QuoteRepository quoteRepository;

    public PageListDTO<Quote> list(String name, Integer page) {
        return quoteRepository.findByName(name, page);
    }
}
