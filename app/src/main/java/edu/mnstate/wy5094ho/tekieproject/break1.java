package edu.mnstate.wy5094ho.tekieproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

public class break1 extends parent {
    private Button waffle1;
    private Button waffle2;
    private Button waffle3;
    private Button waffle4;
    private Button waffle5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break1);
        waffle1 = (Button)findViewById(R.id. w1);
        waffle2 = (Button)findViewById(R.id. w2);
        waffle3 = (Button)findViewById(R.id. w3);
        waffle4 = (Button)findViewById(R.id. w4);
        waffle5 = (Button)findViewById(R.id. w5);

    }



    public void addTolist(View v) {

        container.add(5);
    }
    public void addTolist1(View v) {
        container.add(4);
    }

    public void addTolist2(View v) {
        container.add(2);
    }
    public void addTolist3(View v) {
        container.add(6);
    }
    public void addTolist4(View v) {
        container.add(3);
    }

    public void butt(View v){
        Intent intent = new Intent(break1.this, checkout.class);
        startActivity(intent);

    }


}


