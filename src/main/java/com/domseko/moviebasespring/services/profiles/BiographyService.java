package com.domseko.moviebasespring.services.profiles;

import com.domseko.moviebasespring.domain.Biography;
import com.domseko.moviebasespring.repositories.BiographyRepository;
import com.domseko.moviebasespring.services.BiographyServiceImpl;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("movie")
public class BiographyService implements BiographyServiceImpl {

    private final BiographyRepository biographyRepository;

    public BiographyService(BiographyRepository biographyRepository) {
        this.biographyRepository = biographyRepository;
    }
    /***********************************************************/

    @Override
    public Set<Biography> findAll() {
        Set<Biography> biographies = new HashSet<>();
        biographyRepository.findAll().forEach(biographies::add);
        return biographies;
    }

    @Override
    public Biography findById(Long aLong) {
        return biographyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Biography saveObject(Biography object) {
        return biographyRepository.save(object);
    }

    @Override
    public void deleteObject(Biography object) {
        biographyRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        biographyRepository.deleteById(aLong);

    }
}
