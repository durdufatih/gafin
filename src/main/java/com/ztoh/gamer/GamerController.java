package com.ztoh.gamer;

import com.ztoh.gamer.webbean.GamerAllResponse;
import com.ztoh.gamer.webbean.GamerSaveResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fatihdurdu on 17/02/2017.
 */
@RestController
@RequestMapping(value = "/gamer")
public class GamerController {

    @Autowired
    private GamerService gamerService;

    @RequestMapping(value = "/all")
    public GamerAllResponse all() {

        GamerAllResponse gamerAllResponse = new GamerAllResponse();
        gamerAllResponse.setGamerList(gamerService.findAll());

        return gamerAllResponse;
    }

    @RequestMapping(value = "/save")
    public GamerSaveResponse save(@RequestBody Gamer gamer) {

        GamerSaveResponse gamerSaveResponse = new GamerSaveResponse();
        gamerSaveResponse.setSuccess(gamerService.save(gamer));

        return gamerSaveResponse;
    }
}
