package edu.mnstate.wy5094ho.tekieproject;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by wy5094ho on 10/15/2017.
 */

public class adapter extends ArrayAdapter {
    //to reference the Activity
    private final Activity context;

    //to store the animal images
    private final Integer[] imageIDarray;

    //to store the list of countries
    private final String[] nameArray;

    public class ViewHolder {
        TextView namelabel  ;
        ImageView imagelabel;

    }




    public adapter(Activity context, String[] nameArrayParam,  Integer[] imageIDArrayParam) {

        super(context, R.layout.listview_row, nameArrayParam);
        this.context=context;
        this.imageIDarray = imageIDArrayParam;
        this.nameArray = nameArrayParam;


    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View row=inflater.inflate(R.layout.listview_row, null,true);

        ViewHolder holder = new ViewHolder();
        holder.namelabel = (TextView) row.findViewById(R.id.labeler);
        holder.imagelabel = (ImageView) row.findViewById(R.id.imageVID);
        holder.namelabel.setText(nameArray[position]);
        holder.imagelabel.setImageResource(imageIDarray[position]);





        return row;

    };
}
