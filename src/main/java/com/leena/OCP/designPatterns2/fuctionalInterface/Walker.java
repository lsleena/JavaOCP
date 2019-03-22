package com.leena.OCP.designPatterns2.fuctionalInterface;

import com.leena.OCP.designPatterns2.interfaceDesign.Lion;


//not @FunctionalInterface - no abstract method
public interface Walker {}


//not @FunctionalInterface- no abstract method
interface Dance extends Sprint {

    public void dance (Lion lion);
}


//@FunctionalInterface - no abstract method
interface Crawl {

    public void crawl();
    public int getCount();
}