package com.anibalcorral.movies.service;

import com.anibalcorral.movies.data.IMovieRepository;
import com.anibalcorral.movies.model.Genre;
import com.anibalcorral.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
class MovieServiceTest {

@Test
    public void return_movies_by_genre(){
    IMovieRepository mr = Mockito.mock(IMovieRepository.class);
    Mockito.when(mr.findAll()).thenReturn(
            Arrays.asList(new Movie(1, "Dark Knight", 152, Genre.ACTION),
                    new Movie(2, "Memento", 113, Genre.THRILLER),
                    new Movie(3, "There's Something About Marty", 119, Genre.COMEDY),
                    new Movie(4, "Super 8", 112, Genre.THRILLER),
                    new Movie(5, "Scream", 111, Genre.HORROR),
                    new Movie(6, "Home Alone", 103, Genre.COMEDY),
                    new Movie(7, "Matrix", 136, Genre.ACTION))


    );
    MovieService ms = new MovieService(mr);
    Collection<Movie> moviesByGenre= ms.findMoviesByGenre(Genre.COMEDY);
    List<Integer> movieIds= moviesByGenre.stream().map(
            movie->movie.getId()).collect(Collectors.toList());
    assertThat(movieIds, CoreMatchers.is(Arrays.asList(3,6)));
}
}