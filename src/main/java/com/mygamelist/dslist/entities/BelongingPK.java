package com.mygamelist.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.ManyToAny;

import java.util.Objects;

//Annotation que marca uma classe para ser usada como um componente incorporável dentro de outra entidade.
@Embeddable
public class BelongingPK {

    //Muitos para um.
    @ManyToOne
    @JoinColumn (name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn (name = "list_id")
    private GameList list;

    public BelongingPK () {

    }

    public BelongingPK(GameList list, Game game) {
        this.list = list;
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
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
        BelongingPK other = (BelongingPK) obj;
        return Objects.equals(game, other.game) && Objects.equals(list, other.list);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(list);
    }
}
