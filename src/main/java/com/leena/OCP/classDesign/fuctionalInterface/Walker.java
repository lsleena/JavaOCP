package com.leena.OCP.classDesign.fuctionalInterface;

import com.leena.OCP.designPatterns.interfaceDesign.Lion;


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