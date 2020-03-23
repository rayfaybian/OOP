package com.company;

import java.util.ArrayList;

public class RearMirror {

    private int size;
    private String position; //left,middle,right

    public RearMirror(int size, String position) {
        this.size = size;
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public String getPosition() {
        return position;
    }

}

