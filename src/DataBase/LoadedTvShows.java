package DataBase;

import java.util.ArrayList;

public class LoadedTvShows extends ArrayList<TvShowsPOJO> {

    public ArrayList<String> getTvShowsTitles() {
        ArrayList<String> result = new ArrayList<>();
        for (TvShowsPOJO current : this) {
            result.add(current.getTitle());

        }
        return result;
    }
}
