package edu.mnstate.wy5094ho.tekieproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class seafood extends parent {
    private Button sea1;
    private Button sea2;
    private Button sea3;
    private Button sea4;
    private Button sea5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seafood);
       sea1 = (Button)findViewById(R.id. s1);
       sea2 = (Button)findViewById(R.id. s2);
       sea3 = (Button)findViewById(R.id. s3);
       sea4 = (Button)findViewById(R.id. s4);
       sea5 = (Button)findViewById(R.id. s5);

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
        Intent intent = new Intent(seafood.this, checkout.class);
        startActivity(intent);

    }
}
