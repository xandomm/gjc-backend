package com.example.demo.database;

import java.util.List;

import com.example.demo.entity.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class EntityRest {
    @Autowired
    private EntityRepository repo;

    @GetMapping
    public List<entity> listar(){
        return repo.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody entity entity){
        repo.save(entity);
    }

    @PutMapping
    public void alterar(@RequestBody entity entity){
        if(entity.getId() > 0)
        repo.save(entity);
    }

    @DeleteMapping
    public void excluir(@RequestBody entity entity){
        repo.delete(entity);
    }

    public EntityRepository getRepo() {
        return repo;
    }

    public void setRepo(EntityRepository repo) {
        this.repo = repo;
    }
}
