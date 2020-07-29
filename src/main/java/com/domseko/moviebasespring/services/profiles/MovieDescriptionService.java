package com.domseko.moviebasespring.services.profiles;

import com.domseko.moviebasespring.domain.MovieDescription;
import com.domseko.moviebasespring.repositories.MovieDescriptionRepository;
import com.domseko.moviebasespring.services.MovieDescriptionServiceImpl;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("movie")
public class MovieDescriptionService implements MovieDescriptionServiceImpl {

    private final MovieDescriptionRepository movieDescriptionRepository;

    public MovieDescriptionService(MovieDescriptionRepository movieDescriptionRepository) {
        this.movieDescriptionRepository = movieDescriptionRepository;
    }
    /***********************************************************/

    @Override
    public Set<MovieDescription> findAll() {
        Set<MovieDescription> movieDescriptions = new HashSet<>();
        movieDescriptionRepository.findAll().forEach(movieDescriptions::add);
        return movieDescriptions;
    }

    @Override
    public MovieDescription findById(Long aLong) {
        return movieDescriptionRepository.findById(aLong).orElse(null);
    }

    @Override
    public MovieDescription saveObject(MovieDescription object) {
        return movieDescriptionRepository.save(object);
    }

    @Override
    public void deleteObject(MovieDescription object) {
        movieDescriptionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        movieDescriptionRepository.deleteById(aLong);
    }
}
