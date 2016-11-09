package com.codekul.javabrushup.innerclasses;

import com.codekul.javabrushup.oops.TypeListener;

/**
 * Created by aniruddha on 9/11/16.
 */
public class Outer {

    private int outerInt = 10;

    public class SimpleInner {

        private int innerInt = 20;

        public void accessOuter(){
            outerInt = 10;
        }
    }

    public static class StaticInner {

    }

    public void accessInner() {

        //innerInt = 50;

        final class LocalInner {

        }

        LocalInner localInner = new LocalInner();
    }

    public class InnerMobile implements TypeListener {

        @Override
        public void checkType() {

        }
    }

    public void anyType(){

    }
}
