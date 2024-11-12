package com.Shermawn.GameTomato.services;

import com.Shermawn.GameTomato.dto.GameAllDTO;
import com.Shermawn.GameTomato.dto.GameDTO;
import com.Shermawn.GameTomato.models.Game;
import com.Shermawn.GameTomato.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameDTO(x)).toList();
    }

    public GameAllDTO findById(@PathVariable Long id){
        Game result = gameRepository.findById(id).get();
        return new GameAllDTO(result);
    }
}
