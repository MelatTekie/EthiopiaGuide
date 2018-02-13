package edu.mnstate.wy5094ho.tekieproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class juice extends parent {

    private Button juc1;
    private Button juc2;
    private Button juc3;
    private Button juc4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juice);
        juc1 = (Button)findViewById(R.id. j1);
        juc2 = (Button)findViewById(R.id. j2);
        juc3 = (Button)findViewById(R.id. j3);
        juc4 = (Button)findViewById(R.id. j4);
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

    public void butt(View v){
        Intent intent = new Intent(juice.this, checkout.class);
        startActivity(intent);

    }
}
