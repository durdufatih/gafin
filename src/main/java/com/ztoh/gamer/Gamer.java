package com.ztoh.gamer;

import com.ztoh.game.Game;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by fatihdurdu on 17/02/2017.
 */
@Document
public class Gamer {

     @Id
     private String id;
     private String nickName;
     private int position;
     private String description;
     private String game;


     public String getDescription() {
          return description;
     }

     public void setDescription(String description) {
          this.description = description;
     }

     public String getId() {
          return id;
     }

     public void setId(String id) {
          this.id = id;
     }

     public String getGame() {
          return game;
     }

     public void setGame(String game) {
          this.game = game;
     }

     public String getNickName() {
          return nickName;
     }

     public void setNickName(String nickName) {
          this.nickName = nickName;
     }

     public int getPosition() {
          return position;
     }

     public void setPosition(int position) {
          this.position = position;
     }
}
