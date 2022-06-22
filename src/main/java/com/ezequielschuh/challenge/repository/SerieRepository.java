package com.ezequielschuh.challenge.repository;

import java.util.List;

import com.ezequielschuh.challenge.domain.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Integer> {

    public List<Serie> findAllByCharacterId(Integer id);
}
