package com.tobi.jpa.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Resource {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Integer size;

    private String url;

    @OneToOne()
    @JoinColumn(name="lecture_id")
    private Lecture lecture;
}
