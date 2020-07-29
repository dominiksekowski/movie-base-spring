package com.domseko.moviebasespring.services.profiles;

import com.domseko.moviebasespring.domain.Actor;
import com.domseko.moviebasespring.repositories.ActorRepository;
import com.domseko.moviebasespring.services.ActorServiceImpl;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("movie")
public class ActorService implements ActorServiceImpl {

   private final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }
/***********************************************************/
    @Override
    public Set<Actor> findAll() {
        Set<Actor> actors = new HashSet<>();
        actorRepository.findAll().forEach(actors::add);
        return actors;    }

    @Override
    public Actor findById(Long aLong) {
        return actorRepository.findById(aLong).orElse(null);
    }

    @Override
    public Actor saveObject(Actor object) {
        return actorRepository.save(object);
    }

    @Override
    public void deleteObject(Actor object) {
        actorRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        actorRepository.deleteById(aLong);

    }
}
