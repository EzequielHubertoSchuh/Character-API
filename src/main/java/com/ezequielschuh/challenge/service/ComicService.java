package com.ezequielschuh.challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezequielschuh.challenge.domain.Comic;
import com.ezequielschuh.challenge.repository.ComicRepository;

@Service
public class ComicService {

    @Autowired
    private ComicRepository comicRepository;

    public List<Comic> listAllByCharacterId(Integer id) {

	return comicRepository.findAllByCharacterId(id);
    }

}
