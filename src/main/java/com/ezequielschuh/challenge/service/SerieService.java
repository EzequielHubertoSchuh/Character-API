package com.ezequielschuh.challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezequielschuh.challenge.domain.Serie;
import com.ezequielschuh.challenge.repository.SerieRepository;

@Service
public class SerieService {

    @Autowired
    private SerieRepository serieRepository;

    public List<Serie> listAllByCharacterId(Integer id) {
	List<Serie> series = serieRepository.findAllByCharacterId(id);

	return series;
    }

}
