package com.ztoh.game;

import com.ztoh.gamer.Gamer;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fatihdurdu on 17/02/2017.
 */
@Service
public class GameService {

    @Autowired
    private GameCustomRepository gameRepository;

    public List<Game> gameList() {
        List<Game> myList = Lists.newArrayList(gameRepository.findAll());
        return myList;
    }

    public boolean save(Game game){
        gameRepository.save(game);
        return gameRepository.exists(game.getId());
    }
}
