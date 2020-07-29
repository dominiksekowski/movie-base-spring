package com.domseko.moviebasespring.services.profiles;

import com.domseko.moviebasespring.domain.Scenarist;
import com.domseko.moviebasespring.repositories.ScenaristRepository;
import com.domseko.moviebasespring.services.ScenaristServiceImpl;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("movie")
public class ScenaristService implements ScenaristServiceImpl {

   private final ScenaristRepository scenaristRepository;

    public ScenaristService(ScenaristRepository scenaristRepository) {
        this.scenaristRepository = scenaristRepository;
    }
    /***********************************************************/

    @Override
    public Set<Scenarist> findAll() {
        Set<Scenarist> scenarists = new HashSet<>();
        scenaristRepository.findAll().forEach(scenarists::add);
        return scenarists;
    }

    @Override
    public Scenarist findById(Long aLong) {
        return scenaristRepository.findById(aLong).orElse(null);
    }

    @Override
    public Scenarist saveObject(Scenarist object) {
        return scenaristRepository.save(object);
    }

    @Override
    public void deleteObject(Scenarist object) {
    scenaristRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
    scenaristRepository.deleteById(aLong);
    }
}
