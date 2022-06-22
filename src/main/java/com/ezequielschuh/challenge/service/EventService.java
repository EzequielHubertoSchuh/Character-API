package com.ezequielschuh.challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezequielschuh.challenge.domain.Event;
import com.ezequielschuh.challenge.repository.EventRepository;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> listAllByCharacterId(Integer id) {
	
	return eventRepository.findAllByCharacterId(id);
    }

}
