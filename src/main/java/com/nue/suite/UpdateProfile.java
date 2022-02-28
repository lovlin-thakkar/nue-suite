package com.nue.suite;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateProfile {

    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:3000"})
    @PostMapping(path = "profile",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Profile> greeting(@RequestBody Profile profile) {
        System.out.println(profile);
        return new ResponseEntity<>(profile, HttpStatus.CREATED);
    }
}