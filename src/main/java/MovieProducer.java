import io.smallrye.reactive.messaging.kafka.Record;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@ApplicationScoped
public class MovieProducer {

    @Inject
    @Channel("movies-out")
//    Emitter<Record<Integer, String>> emitter;
    Emitter<Movie> emitter;

    public void sendMovieToKafka(Movie movie) {
//        emitter.send(Record.of(movie.year, movie.title));
        emitter.send(movie);
    }

}
