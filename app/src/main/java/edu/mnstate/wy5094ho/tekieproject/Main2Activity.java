package edu.mnstate.wy5094ho.tekieproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends parent {
    private Button desrt1;
    private Button desrt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       desrt1 = (Button)findViewById(R.id. d1);
        desrt2 = (Button)findViewById(R.id. d2);
    }

    public void addTolist(View v) {
        container.add(5);
    }

    public void addTolist1(View v) {
        container.add(4);
    }
    public void butt(View v){
        Intent intent = new Intent(Main2Activity.this, checkout.class);
        startActivity(intent);

    }
}
