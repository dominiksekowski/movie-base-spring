package com.domseko.moviebasespring.repositories;

import com.domseko.moviebasespring.domain.Biography;
import org.springframework.data.repository.CrudRepository;

public interface BiographyRepository extends CrudRepository <Biography, Long> {
}
