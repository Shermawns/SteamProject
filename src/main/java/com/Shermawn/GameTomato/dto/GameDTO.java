package com.Shermawn.GameTomato.dto;

import com.Shermawn.GameTomato.models.Game;
import com.Shermawn.GameTomato.projetctions.GameProjection;

public class GameDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }
    public GameDTO(GameProjection games) {
        id = games.getId();
        title = games.getTitle();
        year = games.getYear();
        imgUrl = games.getImgUrl();
        shortDescription = games.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
