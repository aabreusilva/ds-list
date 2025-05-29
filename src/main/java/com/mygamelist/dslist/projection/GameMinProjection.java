package com.mygamelist.dslist.projection;

public interface GameMinProjection {

    //Colocar métodos GET que correspondem a minha consulta.
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();

}
