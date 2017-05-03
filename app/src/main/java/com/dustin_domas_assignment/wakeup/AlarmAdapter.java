package com.dustin_domas_assignment.wakeup;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;



public class AlarmAdapter extends RecyclerView.Adapter<AlarmAdapter.AlarmViewHolder> {

    List<AlarmCard> adapterAlarms;




//this will create the Card view with the alarm attributes
    public static class AlarmViewHolder extends RecyclerView.ViewHolder{

        TextView timeDisplay;
        TextView alaDays;
        //ImageView icon;

        //ToggleButton alaToggle;
        //CardView cardView;

        AlarmViewHolder(View view){
            super(view);

          //  cardView = (CardView) view.findViewById(R.id.card_view);
            //icon = (ImageView) view.findViewById(R.id.alarmImage);
            timeDisplay = (TextView) view.findViewById(R.id.timeDisplay);
            alaDays = (TextView) view.findViewById(R.id.daysTV);
            //laToggle = (ToggleButton) view.findViewById(R.id.alarmToggle);

        }


    }

    AlarmAdapter( List<AlarmCard> data) {
        this.adapterAlarms = data;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView rc){
        super.onAttachedToRecyclerView(rc);
    }

    @Override
    public AlarmViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view2 = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_alarm_item,parent,false);

        //Initialize the the view holder with the item layout
        AlarmViewHolder alarmViewHolder = new AlarmViewHolder(view2);
        return alarmViewHolder;
    }

    @Override
    public void onBindViewHolder(AlarmViewHolder holder, int position) {

        holder.timeDisplay.setText("8:00 AM");
        holder.alaDays.setText("Every Day");
    }

    @Override
    public int getItemCount() {
        return adapterAlarms.size();
    }
}