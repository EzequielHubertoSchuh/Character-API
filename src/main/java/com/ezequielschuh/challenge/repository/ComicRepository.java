package com.ezequielschuh.challenge.repository;

import java.util.List;

import com.ezequielschuh.challenge.domain.Comic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicRepository extends JpaRepository<Comic, Integer> {

    public List<Comic> findAllByCharacterId(Integer id);
}
