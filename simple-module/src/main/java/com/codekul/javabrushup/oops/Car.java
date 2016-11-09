package com.codekul.javabrushup.oops;

/**
 * Created by aniruddha on 8/11/16.
 */
public class Car {

    private int speed; // state -> properties -> fields
    private float color;
    protected  String name;

    public Car(){
    }

    public Car(int sp , float clr){
    }

    public Car(Car car){
    }

    public void changeSpeed(int sps){
        speed = sps;
    }
    public void increaseSpeed() { // behaviour -> functions -> methods
        speed++;
    }

    public void changeColor(float clr){
        color = clr;
    }

    public void changeColor(){
        color = 255;
    }
}
