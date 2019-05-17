package com.capgemini.capAndMe.repositories;

import com.capgemini.capAndMe.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
