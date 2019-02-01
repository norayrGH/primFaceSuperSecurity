package com.example.demo.model;

import com.example.demo.model.enums.Role;
import com.example.demo.model.enums.State;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Data
@Builder
@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String hashPassword;
    @Enumerated(value = EnumType.STRING)
    private Role   role;
    @Enumerated(value = EnumType.STRING)
    private State  state;

}
