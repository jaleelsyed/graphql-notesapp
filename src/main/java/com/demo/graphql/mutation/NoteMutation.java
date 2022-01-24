package com.demo.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.demo.graphql.dao.entity.Note;
import com.demo.graphql.dao.entity.User;
import com.demo.graphql.dao.repository.NotesRepository;
import com.demo.graphql.dao.repository.UserRepository;
import com.demo.graphql.dto.NoteRequest;
import com.demo.graphql.dto.UserRequest;
import com.demo.graphql.service.GenricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NoteMutation implements GraphQLMutationResolver {

    @Autowired
    private NotesRepository notesRepository;

    @Autowired
    private UserRepository userRepository;

    public Note createNote(NoteRequest noteRequest) {
        Note note = new Note();
        note.setBody(noteRequest.getBody());
        note.setName(noteRequest.getName());
        note.setType(noteRequest.getType());
        return this.notesRepository.save(note);
    }

    public Note updateNote(NoteRequest noteRequest) {
        Note note = notesRepository.findById(noteRequest.getId()).get();
        note.setBody(noteRequest.getBody());
        note.setName(noteRequest.getName());
        note.setType(noteRequest.getType());
        return this.notesRepository.save(note);
    }

    public User createUser(UserRequest userRequest){

        User user=new User();
        user.setUsername(userRequest.getUsername());
        user.setPassword(userRequest.getPassword());
        return userRepository.save(user);

    }
    public User updateUser(UserRequest userRequest){

        User user=userRepository.findById(userRequest.getId()).get();
        user.setUsername(userRequest.getUsername());
        user.setPassword(userRequest.getPassword());
        return userRepository.save(user);

    }

}
