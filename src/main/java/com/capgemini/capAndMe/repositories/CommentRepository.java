package com.capgemini.capAndMe.repositories;

import com.capgemini.capAndMe.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
