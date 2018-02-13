package edu.mnstate.wy5094ho.tekieproject;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by wy5094ho on 10/18/2017.
 */

public class menuAdapter extends RecyclerView.Adapter<menuAdapter.menuViewholder >{

    private List<menu> coupon;

    public menuAdapter(List<menu>coupon){
        this.coupon = coupon;
    }
    @Override
    public menuViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedVw = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_row,parent,false);
        return new menuViewholder(inflatedVw);
    }

    @Override
    public void onBindViewHolder(menuViewholder holder, int position) {
        menu menu1 = coupon.get(position);
        String id = menu1.getId();
        String tmpid= String.valueOf(id);
        holder.tvID.setText(tmpid);


    }

    @Override
    public int getItemCount() {
        return coupon.size();
    }

    public class menuViewholder extends RecyclerView.ViewHolder {
        TextView tvID;
        public menuViewholder(View itemView) {
            super(itemView);
            tvID = (TextView) itemView.findViewById(R.id.labeler);


        }

    }

}
