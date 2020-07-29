package com.domseko.moviebasespring.services;

import java.util.Set;

public interface CrudImpl <T, ID>{

        Set<T> findAll();

        T findById(ID id);

        T saveObject(T object);

        void deleteObject(T object);

        void deleteById(ID id);


}
