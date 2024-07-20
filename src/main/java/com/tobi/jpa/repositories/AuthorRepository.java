package com.tobi.jpa.repositories;

import com.tobi.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
