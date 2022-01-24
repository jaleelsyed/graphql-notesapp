package com.demo.graphql.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class NoteRequest implements Serializable {

    private int id;
    private String name;
    private String body;
    private String type;
}
