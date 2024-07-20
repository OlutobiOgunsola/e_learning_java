package com.tobi.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name="author_tbl")
public class Author {

    @Id
    @GeneratedValue
    private Integer Id;

    @Column(
            name="f_name",
            length = 35
    )
    private String firstName;

    private String lastName;

    private Integer age;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;

    @Column(
            updatable = false,
            nullable = false
    )
    private LocalDateTime createdAt;

    @Column(
            insertable = false
    )
    private LocalDateTime lastModified;
}
