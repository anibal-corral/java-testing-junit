package com.anibalcorral.movies.data;

import com.anibalcorral.movies.model.Genre;
import com.anibalcorral.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import static org.hamcrest.MatcherAssert.assertThat;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
class IMovieRepositoryImplTest {
    @Test
    void load_all_movies() throws SQLException {
        DriverManagerDataSource ds = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL", "sa", "sa");
        //de la librería spring jdbc para cargar la base en memoria
        ScriptUtils.executeSqlScript(ds.getConnection(), new ClassPathResource("sql-scripts/test-sata.sql"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
        IMovieRepositoryImpl iMovieRepository = new IMovieRepositoryImpl(jdbcTemplate);
        Collection<Movie> all = iMovieRepository.findAll();
 assertThat(all, CoreMatchers.is(Arrays.asList(
         new Movie(1, "Dark Knight", 152, Genre.ACTION) ,
         new Movie(2, "Memento", 113, Genre.DRAMA) ,
         new Movie(3, "Matrix", 136, Genre.ACTION)
 )));

    }
}