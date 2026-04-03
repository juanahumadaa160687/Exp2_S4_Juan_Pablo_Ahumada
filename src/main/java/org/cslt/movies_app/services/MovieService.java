package org.cslt.movies_app.services;

import org.cslt.movies_app.models.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> getAllMovies();
    Movie getMovieById(Long id);
    Movie saveMovie(Movie movie);
    void deleteMovie(Long id);
    Movie updateMovie(Long id, Movie movie);

}
