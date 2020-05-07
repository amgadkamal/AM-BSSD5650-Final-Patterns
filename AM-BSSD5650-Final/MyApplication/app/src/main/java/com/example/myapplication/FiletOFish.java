package com.example.myapplication;

public class FiletOFish extends Sandwitch{
    //extend the abstract  to inhert
    @Override
    String Burgertype() {
        return "add piece of fish fillet +";
    }

    @Override
    boolean orderKatchup() {return true;}
    @Override
    boolean orderPickles() {return true;}
    @Override
    boolean orderTomato() {return true;}
    @Override
    boolean orderLettuce() {return true;}


}
