package com.ztoh.game;

import com.ztoh.game.webbean.GameAllResponse;
import com.ztoh.game.webbean.GameSaveReponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fatihdurdu on 17/02/2017.
 */
@RestController
@RequestMapping(value = "/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @RequestMapping(value = "/add")
    public GameAllResponse findAll() {
        GameAllResponse gameAllResponse = new GameAllResponse();
        try {
            gameAllResponse.setGameList(gameService.gameList());
        } catch (Exception e) {

        }

        return gameAllResponse;
    }

    @RequestMapping(value = "/save")
    public GameSaveReponse save(@RequestBody Game game) {
        GameSaveReponse gameSaveReponse = new GameSaveReponse();
        gameSaveReponse.setSuccess(gameService.save(game));

        return gameSaveReponse;
    }


}
