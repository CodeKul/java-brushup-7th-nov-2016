package com.codekul.javabrushup.oops;

import com.codekul.javabrushup.oops.Car;

/**
 * Created by aniruddha on 8/11/16.
 */
public class Bmw /*is a car*/ extends Car {

    public Bmw(){
        name = "X2";
    }

    @Override//annotation
    public void changeSpeed(int sps) {
        super.changeSpeed(sps);

        int totalSpeed = cruizeControl() + sps;
    }

    public int cruizeControl(){
        return 90;
    }
}
