package com.example.myapplication;

public class ChickenBurger extends Sandwitch {
    //extend the abstract  to inhert
    String Burgertype() {
        return "add piece of chicken panne +";}

    boolean orderKatchup(){return true;}
    boolean orderPickles(){return true;}
    boolean orderTomato(){return false;}

}
