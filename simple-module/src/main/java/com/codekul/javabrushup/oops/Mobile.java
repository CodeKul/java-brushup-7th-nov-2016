package com.codekul.javabrushup.oops;

/**
 * Created by aniruddha on 9/11/16.
 */
public class Mobile implements TypeListener{

    @Override
    public void checkType() {
        System.out.println("Type is interface");
    }

    public void dial(String num){
        System.out.println("Dialing to "+num);
    }

    /*
      1. One class can implement one or more other interfaces
      2. one class can extend only one class at a time
      3. one interface never implement other interface
      4. one interface can extends one or more interfaces
    */
}
