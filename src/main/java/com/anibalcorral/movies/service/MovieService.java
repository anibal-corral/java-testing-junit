package com.anibalcorral.movies.service;

import com.anibalcorral.movies.data.IMovieRepository;
import com.anibalcorral.movies.model.Genre;
import com.anibalcorral.movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
public class MovieService {

    IMovieRepository repository;

    public MovieService(IMovieRepository repository) {
        this.repository = repository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        return repository.findAll().stream().filter(m->m.getGenre()==genre).collect(Collectors.toList());
    }
}
