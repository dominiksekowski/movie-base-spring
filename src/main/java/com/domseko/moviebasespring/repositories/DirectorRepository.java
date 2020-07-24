package com.domseko.moviebasespring.repositories;

import com.domseko.moviebasespring.domain.Director;
import org.springframework.data.repository.CrudRepository;

public interface DirectorRepository extends CrudRepository<Director, Long> {
}
