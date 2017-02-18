package com.ztoh.gamer;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fatihdurdu on 17/02/2017.
 */
@Service
public class GamerService {

    @Autowired
    private GamerRepository gamerRepository;

    public List<Gamer> findAll() {

        List<Gamer> myList = Lists.newArrayList(gamerRepository.findAll());
        return myList;
    }

    public boolean save(Gamer gamer) {
        gamer = gamerRepository.save(gamer);
        return gamerRepository.exists(gamer.getId());
    }
}
