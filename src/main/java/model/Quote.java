package model;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection="quote")
public class Quote  {
    private String anime;
    private String character;
    private String quote;

    public Quote() {
    }

    public Quote(String anime, String character, String quote) {
        this.anime = anime;
        this.character = character;
        this.quote = quote;
    }

    public String getAnime() {
        return this.anime;
    }

    public void setAnime(String anime) {
        this.anime = anime;
    }

    public String getCharacter() {
        return this.character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getQuote() {
        return this.quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
