package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Models;

public interface BookRepo extends JpaRepository<Models, Integer>{

}
