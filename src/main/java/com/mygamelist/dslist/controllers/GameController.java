package com.mygamelist.dslist.controllers;

import com.mygamelist.dslist.dto.GameMinDTO;
import com.mygamelist.dslist.entities.Game;
import com.mygamelist.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Essa classe é a porta de entrada do sistema (API)
//Quem implementa a API é o controlador.

@RestController //
@RequestMapping(value = "/games")//Mapeando o recurso GET https://example.com/produtos POST https://example.com/produto {"nome": "Computador" "preco": 3000.0}
public class GameController {

    //Controller injeta um service

    @Autowired
    private GameService gameService;


    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
