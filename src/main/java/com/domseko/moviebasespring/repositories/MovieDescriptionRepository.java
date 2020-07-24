package com.domseko.moviebasespring.repositories;

import com.domseko.moviebasespring.domain.MovieDescription;
import org.springframework.data.repository.CrudRepository;

public interface MovieDescriptionRepository extends CrudRepository<MovieDescription,Long> {
}
