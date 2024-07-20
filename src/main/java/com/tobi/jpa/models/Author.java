package com.tobi.jpa.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
public class Author {

    @Id
    @GeneratedValue
    private Integer Id;

    private String firstName;

    private String lastName;

    private Integer age;

    private String email;


}
