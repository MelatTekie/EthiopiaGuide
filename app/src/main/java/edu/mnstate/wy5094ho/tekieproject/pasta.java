package edu.mnstate.wy5094ho.tekieproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pasta extends parent {
    private Button pasta1;
    private Button pasta2;
    private Button pasta3;
    private Button pasta4;
    private Button pasta5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta);
        pasta1 = (Button)findViewById(R.id. p1);
       pasta2 = (Button)findViewById(R.id. p2);
       pasta3 = (Button)findViewById(R.id. p3);
      pasta4 = (Button)findViewById(R.id. p4);
      pasta5 = (Button)findViewById(R.id. p5);
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
        Intent intent = new Intent(pasta.this, checkout.class);
        startActivity(intent);

    }

}
