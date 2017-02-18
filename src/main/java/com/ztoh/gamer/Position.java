package com.ztoh.gamer;

/**
 * Created by fatihdurdu on 17/02/2017.
 */
public enum Position {

    TOP(1),BOTTOM(2),CARRY(3),MIDDLE(4),SUPPORT(5);

    private int value;
    private Position(int value) {
        this.value = value;
    }

}
