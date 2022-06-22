package com.ezequielschuh.challenge.repository;

import com.ezequielschuh.challenge.domain.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Integer> {
    
}
