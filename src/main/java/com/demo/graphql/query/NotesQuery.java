package com.demo.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.demo.graphql.dao.entity.Note;
import com.demo.graphql.dao.entity.User;
import com.demo.graphql.dao.repository.NotesRepository;
import com.demo.graphql.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class NotesQuery implements GraphQLQueryResolver {


    @Autowired
    private NotesRepository notesRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Note> getNotes() {
        return this.notesRepository.findAll();
    }

    public Optional<Note> getNote(int id) {
        return this.notesRepository.findById(id);
    }

    public boolean deleteNote(int id) {
        this.notesRepository.deleteById(id);
        return true;
    }

    //users operations

    public User findUserById(int id) {
        return this.userRepository.findById(id).get();
    }

    public List<User> findAllUsers(){
        return this.userRepository.findAll();
    }

    public boolean deleteUserById(int id) {
        this.userRepository.deleteById(id);
        return true;
    }


}
