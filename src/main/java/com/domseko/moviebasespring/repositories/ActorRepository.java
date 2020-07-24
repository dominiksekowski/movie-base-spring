package com.domseko.moviebasespring.repositories;

import com.domseko.moviebasespring.domain.Actor;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository <Actor, Long> {
}
