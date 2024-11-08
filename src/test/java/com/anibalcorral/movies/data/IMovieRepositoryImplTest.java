package com.anibalcorral.movies.data;

import com.anibalcorral.movies.model.Genre;
import com.anibalcorral.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
class IMovieRepositoryImplTest {


    private IMovieRepositoryImpl iMovieRepository;
    private DriverManagerDataSource ds;

    @BeforeEach
    void setUp() throws SQLException {
         ds = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL", "sa", "sa");
        //de la librería spring jdbc para cargar la base en memoria
        ScriptUtils.executeSqlScript(ds.getConnection(), new ClassPathResource("sql-scripts/test-sata.sql"));
        JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
         iMovieRepository = new IMovieRepositoryImpl(jdbcTemplate);
    }

    @Test
    void load_all_movies() throws SQLException {

        
        Collection<Movie> all = iMovieRepository.findAll();
        assertThat(all, is(Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION),
                new Movie(2, "Memento", 113, Genre.THRILLER),
                new Movie(3, "Matrix", 136, Genre.ACTION)
        )));

    }
    @Test
    void load_movie_by_id(){
        Movie movie = iMovieRepository.findById(2);
        assertThat(movie, is(new Movie(2, "Memento", 113, Genre.THRILLER)));
    }
    @Test
    void insert_movie(){
        Movie movie = new Movie("Power Puff Girls", 132, Genre.COMEDY);
        iMovieRepository.saveOrUpdate(movie);
        Movie createdMovie = iMovieRepository.findById(4);
        assertThat(new Movie(4,"Power Puff Girls", 132, Genre.COMEDY), is(createdMovie));
    }

    @AfterEach
    void tearDown() throws SQLException {
        final Statement s = ds.getConnection().createStatement();
        s.execute("drop all objects delete files");
    }
}