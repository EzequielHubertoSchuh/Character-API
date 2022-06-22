package com.ezequielschuh.challenge.repository;

import java.util.List;

import com.ezequielschuh.challenge.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {

    public List<Event> findAllByCharacterId(Integer id);
}
