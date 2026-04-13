package org.cslt.movies_app.services;

import org.cslt.movies_app.models.Movie;
import org.cslt.movies_app.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(Long id) {
        for (Movie movie : movieRepository.findAll()) {
            if (Objects.equals(movie.getId(), id)) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public String deleteMovie(Long id) {
        movieRepository.deleteById(id);
        return "Movie with id: " + id + " has been deleted";
    }

    @Override
    public Movie updateMovie(Long id, Movie movie) {
        if (movieRepository.existsById(id)) {
            movie.setId(id);
            return movieRepository.save(movie);
        }
        return null;
    }

}
