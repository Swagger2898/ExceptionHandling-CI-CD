package com.example.exceptionhandling.repo;

import com.example.exceptionhandling.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Model,Integer> {
}
