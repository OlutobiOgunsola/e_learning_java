package com.tobi.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name="author_tbl")
public class Author extends BaseEntity {

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

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
