package DataBase;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class FormsOfEntertainment {

    private static LoadedMovies loadedMovies = new LoadedMovies();
    private static LoadedTvShows loadedTvShows = new LoadedTvShows();

    public static FormsOfEntertainment prikazi(int genreId) {
        try {

            loadedMovies.clear();
            Statement stmt = DataBase.get().createStatement();
            ResultSet rs = stmt.executeQuery("select * from entertainment.film where genre_id = " + String.valueOf(genreId));

            while (rs.next()) {
                MoviePOJO current = new MoviePOJO();
                current.setId(rs.getInt("id"));
                current.setTitle(rs.getString("title"));
                loadedMovies.add(current);
            }
            return null;
        } catch (Exception e) {

            System.err.println(e);
            return null;
        }
    }

    public static FormsOfEntertainment prikaziSerije(int genreId) {
        try {

            loadedTvShows.clear();
            Statement stmt = DataBase.get().createStatement();
            ResultSet rs = stmt.executeQuery("select * from tv_shows where genre_id = " + String.valueOf(genreId));

            while (rs.next()) {
                TvShowsPOJO current = new TvShowsPOJO();
                current.setId(rs.getInt("id"));
                current.setTitle(rs.getString("title"));

                loadedTvShows.add(current);

            }

            return null;
        } catch (Exception e) {

            System.err.println(e);
            return null;
        }
    }

    public static String getSynopsis(int movieId) {
        try {

            Statement stmt = DataBase.get().createStatement();
            ResultSet rs = stmt.executeQuery("select * from film where id = " + String.valueOf(movieId));
            String synopsis = null;

            while (rs.next()) {
                //results.add(String.valueOf(id));
                synopsis = rs.getString("Synopsis");

            }

            return synopsis;
        } catch (Exception e) {

            System.err.println(e);
            return null;
        }
    }

    public static String getSynopsisSerije(int tvId) {
        try {

            Statement stmt = DataBase.get().createStatement();
            ResultSet rs = stmt.executeQuery("select * from tv_shows where id = " + String.valueOf(tvId));
            String synopsis = null;

            while (rs.next()) {
                //results.add(String.valueOf(id));
                synopsis = rs.getString("Synopsis");

            }

            return synopsis;
        } catch (Exception e) {

            System.err.println(e);
            return null;
        }
    }

    public static String getDate(int movieId) {
        try {

            Statement stmt = DataBase.get().createStatement();
            ResultSet rs = stmt.executeQuery("select * from film where id = " + String.valueOf(movieId));
            String synopsis = null;

            while (rs.next()) {
                synopsis = rs.getString("Year");

            }

            return synopsis;
        } catch (Exception e) {

            System.err.println(e);
            return null;
        }
    }

    public static LoadedMovies getLoadedMovies() {
        return loadedMovies;
    }

    public static LoadedTvShows getLoadedTvShows() {
        return loadedTvShows;
    }

}
