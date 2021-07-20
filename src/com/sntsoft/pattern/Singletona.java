package com.sntsoft.pattern;

/**
 * @author lc
 * @date 2021/7/14 17:34
 */
public class Singletona {


    private static class B{
        public static final B b=new B();
    }

    public static B getInstance(){
        return B.b;
    }

}
