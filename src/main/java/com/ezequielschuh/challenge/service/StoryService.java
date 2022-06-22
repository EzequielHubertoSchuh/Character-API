package com.ezequielschuh.challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezequielschuh.challenge.domain.Story;
import com.ezequielschuh.challenge.repository.StoryRepository;

@Service
public class StoryService {

    @Autowired
    private StoryRepository storyRepository;

    public List<Story> listAllByCharacterId(Integer id) {
	List<Story> storys = storyRepository.findAllByCharacterId(id);

	return storys;
    }

}
