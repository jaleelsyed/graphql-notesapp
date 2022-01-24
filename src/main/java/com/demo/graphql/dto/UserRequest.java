package com.demo.graphql.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class UserRequest implements Serializable {

    private int id;
    private String username;
    private String password;
}