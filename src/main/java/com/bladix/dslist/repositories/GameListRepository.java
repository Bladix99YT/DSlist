package com.bladix.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bladix.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
