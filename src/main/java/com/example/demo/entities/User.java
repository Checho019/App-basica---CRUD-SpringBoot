package com.example.demo.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="User")
public class User {

    private static final Long serialVersionUID = 1L;

    @Id
    @Column(name = "userid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(name = "name")
    private String name;

}
