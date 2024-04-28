package com.minimax.customerapplication.service;

import com.minimax.customerapplication.domain.Dog;
import com.minimax.customerapplication.repository.DogRepository;
import org.springframework.stereotype.Service;

@Service
public class DogService {
    private final DogRepository dogRepository;

    public DogService(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public Long createDog(Dog dog) {
        return dogRepository.save(dog).getId();
    }
}
