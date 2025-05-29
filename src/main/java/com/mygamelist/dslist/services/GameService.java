package com.mygamelist.dslist.services;

import com.mygamelist.dslist.dto.GameDTO;
import com.mygamelist.dslist.dto.GameMinDTO;
import com.mygamelist.dslist.entities.Game;
import com.mygamelist.dslist.projection.GameMinProjection;
import com.mygamelist.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    //Operação para chamar o repository que busca no banco de dados.
    //O service devolve uma lista desses objetos.
    //findAll() buscara todos os games.

    //Injetando um game repository.
    @Autowired
    private GameRepository gameRepository;

    //Não fazer nenhuma operação de escrita.
    @Transactional(readOnly = true)
    //Criando um méthod para buscar por id.
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
