package com.driver;

public class Main {

    public static void main(String[] args){
        RWOnly obj = new RWOnly();
        obj.setName("RWOnly");
//      java: name has private access in com.driver.RWOnly

        System.out.println(obj.getName());
    }
}