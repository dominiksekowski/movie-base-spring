package com.domseko.moviebasespring.services.profiles;

import com.domseko.moviebasespring.domain.MovieBase;
import com.domseko.moviebasespring.repositories.MovieBaseRepository;
import com.domseko.moviebasespring.services.MovieBaseServiceImpl;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("movie")
public class MovieBaseService implements MovieBaseServiceImpl {

    private final MovieBaseRepository movieBaseRepository;

    public MovieBaseService(MovieBaseRepository movieBaseRepository) {
        this.movieBaseRepository = movieBaseRepository;
    }
    /***********************************************************/

    @Override
    public Set<MovieBase> findAll() {
        Set<MovieBase> movieBases = new HashSet<>();
        movieBaseRepository.findAll().forEach(movieBases::add);
        return movieBases;    }

    @Override
    public MovieBase findById(Long aLong) {
        return movieBaseRepository.findById(aLong).orElse(null);
    }

    @Override
    public MovieBase saveObject(MovieBase object) {
        return movieBaseRepository.save(object);
    }

    @Override
    public void deleteObject(MovieBase object) {
        movieBaseRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        movieBaseRepository.deleteById(aLong);

    }
}
