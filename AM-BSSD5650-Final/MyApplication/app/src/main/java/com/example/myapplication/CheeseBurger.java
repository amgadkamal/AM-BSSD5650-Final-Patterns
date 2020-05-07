package com.example.myapplication;

public class CheeseBurger extends Sandwitch {
    //extend the abstract  to inhert
    String Burgertype(){

        return "add piece of burger +";
    }

    boolean ordercheese(){return true;}
    boolean orderKatchup(){return true;}
    boolean orderPickles(){return true;}
    boolean orderLettuce(){return false;}
}
