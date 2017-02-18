package com.ztoh.game.webbean;

import com.ztoh.game.Game;

import java.util.List;

/**
 * Created by fatihdurdu on 17/02/2017.
 */
public class GameAllResponse {

    private List<Game> gameList;

    public List<Game> getGameList() {
        return gameList;
    }

    public void setGameList(List<Game> gameList) {
        this.gameList = gameList;
    }
}
