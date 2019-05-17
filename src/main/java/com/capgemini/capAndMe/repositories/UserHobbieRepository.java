package com.capgemini.capAndMe.repositories;

import com.capgemini.capAndMe.entities.UserHobbie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserHobbieRepository extends JpaRepository<UserHobbie, Long> {
}
