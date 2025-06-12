package com.example.exceptionhandling.controller;

import com.example.exceptionhandling.model.Model;
import com.example.exceptionhandling.repo.Repository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    public Repository repo ;

    @GetMapping("/register")
    public ResponseEntity<Integer> register(@Valid @RequestBody Model model){

        repo.save(model);
        return ResponseEntity.ok().body(model.getId());

    }

}
