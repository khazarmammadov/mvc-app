package org.khazar.mvcapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyDatabaseService {

    private final JdbcTemplate jdbcTemplate;

    public int countRows() {
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM my_table", Integer.class);
    }

    // Other database operations...
}
