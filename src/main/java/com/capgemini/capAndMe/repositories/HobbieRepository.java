package com.capgemini.capAndMe.repositories;

import com.capgemini.capAndMe.entities.Hobbie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbieRepository extends JpaRepository<Hobbie, Long> {
}
