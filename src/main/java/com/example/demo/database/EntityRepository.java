package com.example.demo.database;

import com.example.demo.entity.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityRepository extends JpaRepository<entity,Long>{
    
}
