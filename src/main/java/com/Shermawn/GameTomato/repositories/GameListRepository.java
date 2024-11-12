package com.Shermawn.GameTomato.repositories;

import com.Shermawn.GameTomato.models.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
