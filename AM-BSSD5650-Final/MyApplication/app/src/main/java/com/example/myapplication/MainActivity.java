package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
//project works with two patterns (template,Iterator), I am using template to make each sandwitch and Iterator to make total order
    //template, used with alugrithm and avoid duplication in code with steps to make template
    //it is usefel also to avoid alot of condition in same class and future condition that may be added by making model to inhert to all subclasses

//Iterator; it is usefl to add new functions suitable for the existing data, and decoule  algurithms.plus it allow to change implementation
    //without changing how to acess data.


    //varibles
    Button ChickenButton,CheeseButton,FishButton,TotalButton,resetall;
    TextView ChickenText,CheeseText,FishText,Total;


    FiletOFish fishSandwitch = new FiletOFish();
    CheeseBurger cheeseBurger = new CheeseBurger();
    ChickenBurger chickenBurger = new ChickenBurger();


    String menuItem;
    String menu;
    int fish,chicken,cheese;
    int fishCounter,chickenCounter,cheeseCounter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChickenButton = findViewById(R.id.chickenB);
        CheeseButton = findViewById(R.id.cheeseB);
        FishButton = findViewById(R.id.feloF);
        ChickenText = findViewById(R.id.chickenBT);
        CheeseText = findViewById(R.id.cheeseBT);
        FishText=findViewById(R.id.feloFT);
        resetall=findViewById(R.id.reset);

      //make Iterator
        Totalorder totalorder = new Totalorder();
        Iterator totalOrderIterator = totalorder.createIterator();
        printMenu(totalOrderIterator);}

    public void printMenu(final Iterator iterator) {

        Total = findViewById(R.id.totalBT);
        TotalButton = findViewById(R.id.totalB);
        while (iterator.hasNext()) {
            menuItem = (String) iterator.next();
            menu += menuItem;
        }


       //get each sandwitch using template
        FishButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fishCounter+=1;
                FishText.setText ((fishSandwitch.OrderSandwitch()) +"X " +fishCounter);
                fish=1;
                ;
            }});


        CheeseButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cheeseCounter+=1;
                CheeseText.setText ((cheeseBurger.OrderSandwitch())+ "X " + cheeseCounter);
                cheese=1
                ;


            }


        });

        ChickenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chickenCounter +=1;
                ChickenText.setText ((chickenBurger.OrderSandwitch())+"X "+ chickenCounter);
                chicken=1;

            }

        });


        //link between twp patterns, with each sandwitch type using template, onclick to show response to it using iterator
        TotalButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(fish==1){
                    Total.append(menu.substring(16,27)+"  "+ "X " + fishCounter +"\n"); }

                if(chicken==1){
                    Total.append(menu.substring(4,16)+"  "+"X " + chickenCounter + "\n"); }

                if(cheese==1){
                    Total.append(menu.substring(28,40)+" "+"X " + cheeseCounter + "\n"); }

                fish=0;chicken=0;cheese=0;
            }

        });

        //reset and delete all texts
        resetall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FishText.setText(" ");
            CheeseText.setText(" ");
            ChickenText.setText(" ");
            Total.setText(" ");}

        });






    }


    }





