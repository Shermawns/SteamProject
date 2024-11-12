package com.Shermawn.GameTomato.services;

import com.Shermawn.GameTomato.dto.GameListDTO;
import com.Shermawn.GameTomato.models.GameList;
import com.Shermawn.GameTomato.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

    public GameListDTO findById(@PathVariable Long id){
        GameList result = gameListRepository.findById(id).get();
        return new GameListDTO(result);
    }
}
