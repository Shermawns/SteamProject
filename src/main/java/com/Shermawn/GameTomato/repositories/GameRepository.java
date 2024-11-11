package com.Shermawn.GameTomato.repositories;

import com.Shermawn.GameTomato.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
