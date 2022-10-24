package ru.skillbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skillbox.dto.PostDto;
import ru.skillbox.model.Post;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}