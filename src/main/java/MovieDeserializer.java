import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class MovieDeserializer extends ObjectMapperDeserializer<Movie> {
    public MovieDeserializer() {
        super(Movie.class);
    }
}