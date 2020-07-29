package com.domseko.moviebasespring.services.profiles;

import com.domseko.moviebasespring.domain.Director;
import com.domseko.moviebasespring.repositories.DirectorRepository;
import com.domseko.moviebasespring.services.DirectorServiceImpl;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("movie")
public class DirectorService implements DirectorServiceImpl {

    private final DirectorRepository directorRepository;

    public DirectorService(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }
    /***********************************************************/

    @Override
    public Set<Director> findAll() {
        Set<Director> directors = new HashSet<>();
        directorRepository.findAll().forEach(directors::add);
        return directors;    }

    @Override
    public Director findById(Long aLong) {
        return directorRepository.findById(aLong).orElse(null);
    }

    @Override
    public Director saveObject(Director object) {
        return directorRepository.save(object);
    }

    @Override
    public void deleteObject(Director object) {
        directorRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        directorRepository.deleteById(aLong);

    }
}
