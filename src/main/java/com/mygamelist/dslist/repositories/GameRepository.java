package com.mygamelist.dslist.repositories;

import com.mygamelist.dslist.entities.Game;
import com.mygamelist.dslist.projection.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//criando um gamerepository para consultar, salvar, deletar, etc... usando spring dentro do banco de dados.
public interface GameRepository extends JpaRepository<Game, Long> {


    //Criando um service: Componente responsável por criar uma lógica de negócio (alguma regra que precisa acontecer)

    /*Um exemplo é um sistema de comércio onde preciso registrar um pedido, quando a pessoa preenche um carrinho de compras, registra
    * um pedido o que precisa acontecer? 1- Verificar o estoque, 2- Dar baixa no estoque, 3- registrar o pedido, 4- Enviar um e-mail
    * avisando, 5- Processar a compra no cartão de crédito, ou seja, tenho uma regra de negócio complexa quando registra o pedido.
    */

    @Query(nativeQuery = true, value = """
		SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
		tb_game.short_description AS shortDescription, tb_belonging.position
		FROM tb_game
		INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
	List<GameMinProjection> searchByList(Long listId);
}
