package edu.mnstate.wy5094ho.tekieproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class salad extends parent {
    private Button salad1;
    private Button salad2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad);
        salad1 = (Button)findViewById(R.id. w1);
        salad2 = (Button)findViewById(R.id. w2);
    }
    public void addTolist(View v) {

        container.add(5);
    }
    public void addTolist1(View v) {
        container.add(4);
    }
    public void butt(View v){
        Intent intent = new Intent(salad.this, checkout.class);
        startActivity(intent);

    }
}
