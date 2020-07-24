package com.domseko.moviebasespring.repositories;

import com.domseko.moviebasespring.domain.MovieBase;
import org.springframework.data.repository.CrudRepository;

public interface MovieBaseRepository extends CrudRepository<MovieBase,Long> {
}
