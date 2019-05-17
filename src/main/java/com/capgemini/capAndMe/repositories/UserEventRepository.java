package com.capgemini.capAndMe.repositories;

import com.capgemini.capAndMe.entities.UserEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEventRepository extends JpaRepository<UserEvent, Long> {
}
