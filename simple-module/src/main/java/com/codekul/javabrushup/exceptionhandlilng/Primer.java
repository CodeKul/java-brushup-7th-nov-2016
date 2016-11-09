package com.codekul.javabrushup.exceptionhandlilng;


/**
 * Created by aniruddha on 9/11/16.
 */
public class Primer {

    public void tryCatch() {
        try {
            int num = 10/0;
            // run time exception, throw new ArithmeticException();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (RuntimeException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Executed ... ");
    }

    public void throwsAndThrowKeyword() {

        try {
            calculate(10,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void calculate(int num1, int num2) throws /*ArithmeticException,RuntimeException,*/Exception {
        if(num1 < 0) throw new MyException();
        int num = num1/num2;
    }
}
