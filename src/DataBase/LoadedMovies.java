package DataBase;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author Nemanja
 */
public class LoadedMovies extends ArrayList<MoviePOJO> {

    public ArrayList<String> getMovieTitles() {
        ArrayList<String> result = new ArrayList<>();
        for (MoviePOJO current : this) {
            result.add(current.getTitle());
        }
        return result;
    }
}
