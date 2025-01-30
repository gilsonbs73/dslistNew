package com.devsuperior.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projection.GameMinProjection;

/*public interface GameRepository, 
 como vamos usar o spring JpaRepository para fazer as operações com o banco como Consultar, Inserir, deletar, Atualizar, etc. 
 devemos fazer a extensão desse componente pelo extends
 JpaRepository <Game, Long> Game é minha classe de Game e Long é o tipo do meu atributo Id que é do tipo Long */
public interface GameRepository extends JpaRepository <Game, Long> {

	/*Essa anotação e necessário quando se tem uma consulta SQL dessa forma, sql nativo */
	@Query(nativeQuery = true, value = """ 
			SELECT tb_game.id, tb_game.title, tb_game.game_year AS "year", tb_game.img_url AS imgUrl,
			tb_game.short_description AS shortDescription, tb_belonging.position
			FROM tb_game
			INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position
				""")
	List<GameMinProjection> searchByList(Long listId);
}
