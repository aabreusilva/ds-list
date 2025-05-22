package com.mygamelist.dslist.controllers;

import com.mygamelist.dslist.dto.GameListDTO;
import com.mygamelist.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Essa classe é a porta de entrada do sistema (API)
//Quem implementa a API é o controlador.

@RestController //
@RequestMapping(value = "/lists")//Mapeando o recurso GET https://example.com/produtos POST https://example.com/produto {"nome": "Computador" "preco": 3000.0}
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
