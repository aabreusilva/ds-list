package com.mygamelist.dslist.services;

import com.mygamelist.dslist.dto.GameDTO;
import com.mygamelist.dslist.dto.GameListDTO;
import com.mygamelist.dslist.dto.GameMinDTO;
import com.mygamelist.dslist.entities.Game;
import com.mygamelist.dslist.entities.GameList;
import com.mygamelist.dslist.repositories.GameListRepository;
import com.mygamelist.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    //Operação para chamar o repository que busca no banco de dados.
    //O service devolve uma lista desses objetos.
    //findAll() buscara todos os games.

    //Injetando um game repository.
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
