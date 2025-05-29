package com.mygamelist.dslist.dto;

import com.mygamelist.dslist.entities.Game;
import com.mygamelist.dslist.projection.GameMinProjection;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    //Fazer uma consulta no banco de dados -> Buscar os games do banco -> Devolver em uma API.
    //Camada de acesso a dados.

    //Criando um construtor que recebe a entidade, ou seja, vou gerar um GameMinDTO copiando os dados da entidade.
    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    //Não precisa dos setters.
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
