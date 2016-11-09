package com.codekul.javabrushup;

import com.codekul.javabrushup.exceptionhandlilng.Primer;
import com.codekul.javabrushup.innerclasses.Outer;
import com.codekul.javabrushup.oops.*;

/**
 * Created by aniruddha on 8/11/16.
 */
public class Main {

    public static void main(String[] args) {

        exceptionHandling();
    }

    public static void inheritance(){
        Car car = new Car(); // object creation
        car.changeColor();
        car.changeColor(10);
        car.changeSpeed(10);

        Bmw bmw = new Bmw();
        bmw.changeSpeed(10);
    }

    public static void abstractClass() {

        Tiger tiger = new Tiger();
        tiger.walk();

        Animal animal = new Tiger();
        animal.walk();

       // Animal animalOne = new Animal(); // error
        //Tiger tigerOne = new Animal(); // error
    }

    public static void interfaces() {
        Mobile mobile = new Mobile();
        mobile.dial("9762548833");
        mobile.checkType();

        TypeListener listener = new Mobile();
        listener.checkType();
    }

    public static void exceptionHandling(){

        Primer primer = new Primer();
        primer.tryCatch();
        primer.throwsAndThrowKeyword();
    }

    public static void innerClasses(){

        Outer outerObj = new Outer();
        outerObj.accessInner();

        Outer.SimpleInner simpleInner = outerObj.new SimpleInner();
        simpleInner.accessOuter();

        Outer.StaticInner staticInner = new Outer.StaticInner();

        TypeListener listener = new Mobile();

        listener = new TypeListener() {
            @Override
            public void checkType() {
                System.out.println("Anonymus inner type");
            }
        };

        listener.checkType();

        listener = () -> {
            System.out.println("Hello lambda");
        }; // lambda expressions
        listener = Main::methodRef; // method reference 1. interface should have only method 2. method should match signature
        listener = outerObj::anyType;
    }

    public static void methodRef(){

    }
}
