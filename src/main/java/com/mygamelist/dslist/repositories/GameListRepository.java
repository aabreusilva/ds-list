package com.mygamelist.dslist.repositories;

import com.mygamelist.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

//criando um gamerepository para consultar, salvar, deletar, etc... usando spring dentro do banco de dados.
public interface GameListRepository extends JpaRepository<GameList, Long> {


    //Criando um service: Componente responsável por criar uma lógica de negócio (alguma regra que precisa acontecer)

    /*Um exemplo é um sistema de comércio onde preciso registrar um pedido, quando a pessoa preenche um carrinho de compras, registra
    * um pedido o que precisa acontecer? 1- Verificar o estoque, 2- Dar baixa no estoque, 3- registrar o pedido, 4- Enviar um e-mail
    * avisando, 5- Processar a compra no cartão de crédito, ou seja, tenho uma regra de negócio complexa quando registra o pedido.
    */


}
