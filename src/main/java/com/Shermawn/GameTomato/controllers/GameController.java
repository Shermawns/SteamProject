package com.Shermawn.GameTomato.controllers;

import com.Shermawn.GameTomato.dto.GameDTO;
import com.Shermawn.GameTomato.models.Game;
import com.Shermawn.GameTomato.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameDTO> findAll(){
        List<GameDTO> result = gameService.findAll();
        return result;
    }
}
