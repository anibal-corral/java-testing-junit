package com.anibalcorral.movies.data;

import com.anibalcorral.movies.model.Genre;
import com.anibalcorral.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
public class IMovieRepositoryImpl implements IMovieRepository {
    private final JdbcTemplate jdbcTemplate;

    public IMovieRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {
        Object[] filters = {id};
        return jdbcTemplate.queryForObject(
                "SELECT * from movies where id = ?",
                filters,
                mapper);
    }

    @Override
    public Collection<Movie> findAll() {

        return jdbcTemplate.query("SELECT * from movies",
                mapper);
    }

    @Override
    public void saveOrUpdate(Movie movie) {

    }
    private static RowMapper<Movie> mapper = new RowMapper<Movie>() {
        @Override
        public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Movie(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("minutes"),
                    Genre.valueOf(rs.getString("genre"))
            );
        }
    };
}
