package com.mygamelist.dslist.services;

import com.mygamelist.dslist.dto.GameMinDTO;
import com.mygamelist.dslist.entities.Game;
import com.mygamelist.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    //Operação para chamar o repository que busca no banco de dados.
    //O service devolve uma lista desses objetos.
    //findAll() buscara todos os games.

    //Injetando um game repository.
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
