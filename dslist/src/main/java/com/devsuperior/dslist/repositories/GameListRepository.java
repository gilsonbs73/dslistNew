package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.GameList;

/*public interface GameRepository, 
 como vamos usar o spring JpaRepository para fazer as operações com o banco como Consultar, Inserir, deletar, Atualizar, etc. 
 devemos fazer a extensão desse componente pelo extends
 JpaRepository <GameList, Long> Game é minha classe de Game e Long é o tipo do meu atributo Id que é do tipo Long */
public interface GameListRepository extends JpaRepository <GameList, Long> {

}
