package com.sntsoft.pattern;

/**
 * @author lc
 * @date 2021/7/14 17:12
 */
public class Singleton {

}

class A {
    private A(){

    }
    private static volatile A a;

    public static A getInstance(){
        if (a==null){
            synchronized (A.class){
                if (a==null){
                    a=new A();
                }
            }
        }
        return a;
    }


}