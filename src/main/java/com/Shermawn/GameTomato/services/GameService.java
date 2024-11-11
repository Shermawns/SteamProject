package com.Shermawn.GameTomato.services;

import com.Shermawn.GameTomato.dto.GameDTO;
import com.Shermawn.GameTomato.models.Game;
import com.Shermawn.GameTomato.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameDTO(x)).toList();
    }
}
