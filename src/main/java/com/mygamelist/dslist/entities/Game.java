package com.mygamelist.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

/*Essa annotation configura a minha classe java para que ela seja
* equivalente a uma tabela do banco relacional ORM.*/
@Entity

//Nome da tabela.
@Table(name = "tb_game")
public class Game {

    //Configurando o id como sendo a chave primária do banco.
    @Id

    //Para que esse id seja incrementado pelo banco de dados.
    //Indicando pro banco gerar o id.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    //Corrigindo um bug onde a palavra year faz parte de sintaxe do banco de dados.
    //Customizando o nome da coluna year.
    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    //Instrução para aumentar o tamanho dos caracteres maximo da descrição do jogo.
    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    //Instrução para JPA para gerar uma string maior que 255 caracteres.
    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Game() {
    }

    public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl,
                String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;

    }

    //Encapsulamento.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    //Encapsulamento.


    //Metodo utilizado para comparar se são iguais ou não.
    //Ex: Jogos que estão dentro de uma lista.
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Game other = (Game) obj;
        return Objects.equals(id, other.id);
    }
}
