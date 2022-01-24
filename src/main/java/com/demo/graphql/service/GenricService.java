package com.demo.graphql.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenricService<E, ID> {

    protected JpaRepository<E, ID> repository;

    public E save(E dto) {
        E e = repository.saveAndFlush(dto);
        return e;
    }

    public Optional<E> findById(ID id) {
        Optional<E> e = repository.findById(id);
        return e;
    }

    public List<E> findAll() {
        List<E> e = repository.findAll();
        return e;
    }

    public boolean deleteById(ID id) {
        repository.deleteById(id);
        return true;
    }

}
