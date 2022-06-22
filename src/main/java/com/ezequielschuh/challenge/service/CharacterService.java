package com.ezequielschuh.challenge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezequielschuh.challenge.domain.Character;
import com.ezequielschuh.challenge.exception.ApiError;
import com.ezequielschuh.challenge.exception.RecordNotFoundException;
import com.ezequielschuh.challenge.repository.CharacterRepository;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    public List<Character> listAll() {

	return characterRepository.findAll();
    }

    public Character getById(Integer id) {
	Optional<Character> result = characterRepository.findById(id);

	return result.orElseThrow(() -> new RecordNotFoundException(ApiError.CHARACTER_NOT_FOUND));
    }

}
