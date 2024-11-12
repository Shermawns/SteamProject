package com.Shermawn.GameTomato.controllers;

import com.Shermawn.GameTomato.dto.GameDTO;
import com.Shermawn.GameTomato.dto.GameListDTO;
import com.Shermawn.GameTomato.models.GameList;
import com.Shermawn.GameTomato.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/list")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameListDTO findById(@PathVariable Long id){
        GameListDTO result = gameListService.findById(id);
        return result;
    }
}
