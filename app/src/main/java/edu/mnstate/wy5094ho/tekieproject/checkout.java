package edu.mnstate.wy5094ho.tekieproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class checkout extends parent {
    private TextView totalval;
    private SeekBar lblseekBar;
    private TextView seekans;
    private  EditText etFName;
    private TextView phn;

    private TextView hold1;
    private TextView hold2;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        etFName = (EditText) findViewById(R.id.nameEv);

        hold1=(TextView)findViewById(R.id.proxy);
        hold2=(TextView)findViewById(R.id.proxy2);
       totalval = (TextView) findViewById(R.id.totval);
        lblseekBar = (SeekBar) findViewById(R.id.lblseekBar);
        seekans = (TextView)findViewById(R.id.seekans);
        phn = (TextView)findViewById(R.id.phoneEv) ;
        hold2.setText("0");



        if (container.size()!=0) {
            BigDecimal sum1 = new BigDecimal(0);
            BigDecimal avg = new BigDecimal(0);
            for (int i = 0; i < container.size(); i++) {
                BigDecimal val1 = new BigDecimal(container.get(i));
                sum1 = sum1.add(val1);
                hold1.setText(sum1.toString());
            }

            totalval.setText("$"+sum1.setScale(2, RoundingMode.CEILING).toString());

        } else {
            Toast.makeText(this, "please provide input", Toast.LENGTH_SHORT).show();
        }


        lblseekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {



            ///this senses my seekbar changes and calculates my values accordingly
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                try {
                    BigDecimal progress = new BigDecimal(lblseekBar.getProgress());
                    //lblseekval.setText(progress.divide(new BigDecimal(100)).toString());

                        BigDecimal sum1 = new BigDecimal(0);
                        for (int j = 0; j < container.size(); j++) {
                            BigDecimal val1 = new BigDecimal(container.get(j));
                            sum1 = sum1.add(val1);
                        }



                    BigDecimal tmpee = new BigDecimal(sum1.toString());
                    BigDecimal resultu = tmpee.multiply(progress);
                    hold2.setText(resultu.toString());
                    seekans.setText("$"+resultu.setScale(2, RoundingMode.CEILING).toString());
                }
                catch (NumberFormatException e){

                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                try {
                    BigDecimal progress = new BigDecimal(lblseekBar.getProgress());
                    //lblseekval.setText(progress.divide(new BigDecimal(100)).toString());

                    BigDecimal sum1 = new BigDecimal(0);
                    for (int j = 0; j < container.size(); j++) {
                        BigDecimal val1 = new BigDecimal(container.get(j));
                        sum1 = sum1.add(val1);
                    }



                    BigDecimal tmpee = new BigDecimal(sum1.toString());
                    BigDecimal resultu = tmpee.multiply(progress);
                    hold2.setText(resultu.toString());
                    seekans.setText("$"+resultu.setScale(2, RoundingMode.CEILING).toString());
                }
                catch (NumberFormatException e){

                }
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                try {
                    BigDecimal progress = new BigDecimal(lblseekBar.getProgress());
                    //lblseekval.setText(progress.divide(new BigDecimal(100)).toString());

                    BigDecimal sum1 = new BigDecimal(0);
                    for (int j = 0; j < container.size(); j++) {
                        BigDecimal val1 = new BigDecimal(container.get(j));
                        sum1 = sum1.add(val1);
                    }



                    BigDecimal tmpee = new BigDecimal(sum1.toString());
                    BigDecimal resultu = tmpee.multiply(progress);
                    hold2.setText(resultu.toString());
                    seekans.setText("$"+resultu.setScale(2, RoundingMode.CEILING).toString());
                }
                catch(NumberFormatException e) {
                }

            }
        });


        AlertDialog alert = new AlertDialog.Builder(checkout.this).create();
        alert.setTitle("Reminder");
        alert.setMessage("Please make sure your information is correct before you hit Done");
        alert.setButton(AlertDialog.BUTTON_NEUTRAL, "okay",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alert.show();


    }

    public void butt2(View v){

        String tmpFName="";






        try {
            tmpFName = etFName.getText().toString();
            BigDecimal add1 = new BigDecimal(hold1.getText().toString());
            BigDecimal add2 = new BigDecimal(hold2.getText().toString());

            add1 = add1.add(add2);

            String cart = add1.toString();

            String ph=phn.getText().toString();


            Bundle b = new Bundle();

            b.putString("Name", tmpFName);
            b.putString("Total", cart);
           b.putString("Phone",ph);

            Intent intent2 = new Intent(checkout.this, result.class);
            intent2.putExtras(b);

            etFName.setText("");
            totalval.setText("");
            phn.setText("");

            startActivity(intent2);
        }
        catch (NumberFormatException e){
            Toast.makeText(this, "please provide input", Toast.LENGTH_SHORT).show();

        }



    }







}
