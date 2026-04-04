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
    public Movie getMovieById(int id) {
        for (Movie movie : movieRepository.findAll()) {
            if (Objects.equals(movie.getId(), id)) {
                return movie;
            }
        }
        return null;
    }
}
