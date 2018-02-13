
/*

      Description:This application shows a list of cities in ethiopia each showing their history and unique culture
      Author:Melat Tekie
      Due Date: 10/18/2017
      source:https://appsandbiscuits.com/listview-tutorial-android-12-ccef4ead27cc
      source for all my photos was google
      */




package edu.mnstate.wy5094ho.tekieproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView mylistView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter whatever = new adapter(this, nameArray,imageArray) ;
        mylistView= (ListView) findViewById(R.id.listv);
        mylistView.setAdapter(whatever);


       // String [] breakArray ={" scrambled eggs", "waffle","French Toast","oats","Pancakes","greek yogurt","Sausage"};


        mylistView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);


                if (nameArray[position]=="BreakFast"){
                    intent = new Intent(MainActivity.this,break1.class);
                    String message = nameArray[position];
                }
                else if(nameArray[position]=="Dessert"){
                    intent = new Intent(MainActivity.this, Main2Activity.class);
                    String message = nameArray[position];
                }
                else if(nameArray[position]=="SeaFood"){
                    intent = new Intent(MainActivity.this, seafood.class);
                    String message = nameArray[position];
                }
                else if(nameArray[position]=="Juice"){
                    intent = new Intent(MainActivity.this, juice.class);
                    String message = nameArray[position];
                }
                else if(nameArray[position]=="Pasta"){
                    intent = new Intent(MainActivity.this, pasta.class);
                    String message =nameArray[position];
                }
                else if(nameArray[position]=="Salad"){
                    intent = new Intent(MainActivity.this, salad.class);
                    String message = nameArray[position];
                }
                startActivity(intent);

            }
        });

    }
    String[] nameArray = {"BreakFast","Dessert","SeaFood","Juice","Pasta","Salad","Sandwitch"};


    Integer[] imageArray = {R.drawable.breakfast, R.drawable.dessert, R.drawable.fish, R.drawable.juicies, R.drawable.pasta, R.drawable.salad, R.drawable.sand};
}
