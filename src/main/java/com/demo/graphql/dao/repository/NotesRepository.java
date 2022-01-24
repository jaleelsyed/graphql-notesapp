package com.demo.graphql.dao.repository;

import com.demo.graphql.dao.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends JpaRepository<Note, Integer> {
}
