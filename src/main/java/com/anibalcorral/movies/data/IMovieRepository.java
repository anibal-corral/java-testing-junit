package com.anibalcorral.movies.data;

import com.anibalcorral.movies.model.Movie;

import java.util.Collection;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
public interface IMovieRepository {
Movie findById(long id);
Collection<Movie>findAll();
void saveOrUpdate(Movie movie);
    Collection<Movie>findByName(String name);
    Collection<Movie>findByDirector(String name);
}
