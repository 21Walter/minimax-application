package com.minimax.customerapplication.web;

import com.minimax.customerapplication.domain.Dog;
import com.minimax.customerapplication.service.DogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dog")
public class DogController {
    private final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @PostMapping
    public ResponseEntity<Long> addDog(@RequestBody Dog dog) {
        var id = dogService.createDog(dog);
        return ResponseEntity.ok(id);
    }
}
