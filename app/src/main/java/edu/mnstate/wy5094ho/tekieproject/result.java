package edu.mnstate.wy5094ho.tekieproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.json.JSONException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class result extends parent {
    private TextView tvFullName;
    private TextView tvtotal;
    private TextView phone;
    Spinner spinRate;
    ArrayAdapter<CharSequence> myApater;
    RecyclerView rvStudents;
    private menuAdapter adapter;
    private LinearLayoutManager myLinearLayoutManager;
    BigDecimal x= new BigDecimal (0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent2 = getIntent();
        Bundle b = intent2.getExtras();
        String name = b.getString("Name");
        String total = b.getString("Total");
        String phone1=b.getString("Phone");
        if (name.equals("")){
            name="name not provided";
        }
        tvFullName =(TextView)findViewById(R.id.tvTest);
        tvtotal=(TextView)findViewById(R.id.tvTest2);
        phone = (TextView)findViewById(R.id.phone);
        tvFullName.setText(name);
        spinRate = (Spinner) findViewById(R.id.spincountry);
        myApater = ArrayAdapter.createFromResource(this,R.array.experience,
                android.R.layout.simple_spinner_item);
        spinRate.setAdapter(myApater);

        phone.setText(phone1);
        x = new BigDecimal(total);
        tvtotal.setText(total);
       tvtotal.setText("$"+x.setScale(2, RoundingMode.CEILING).toString());


        container.clear();

        rvStudents= (RecyclerView)findViewById(R.id.rvStudents);
        myLinearLayoutManager = new LinearLayoutManager(this);
        rvStudents.setLayoutManager(myLinearLayoutManager);





        try{
            List<menu> questList =
                    menu.createmenudata("menudata.json",this);
            adapter = new menuAdapter(questList);
            rvStudents.setAdapter(adapter);
        }catch (JSONException e){
            e.printStackTrace();
        }

    }
}
