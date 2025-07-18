package com.example.apiropa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adaptadorvideos extends ArrayAdapter<video> {
    public Adaptadorvideos(Context context, ArrayList<video> datos)  {
        super(context, R.layout.item, datos);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item, null);

        TextView titulo = (TextView)item.findViewById(R.id.titulo);
        titulo.setText(getItem(position).getTitulo());

        TextView fecha = (TextView)item.findViewById(R.id.fechapub);
        fecha.setText(getItem(position).getFecha());

        TextView urlvideo1 = (TextView)item.findViewById(R.id.urlvideo1);
        urlvideo1.setText(getItem(position).getUrl());



        ImageView portada = (ImageView)item.findViewById(R.id.portadavideo);
        Glide.with(this.getContext())
                .load(getItem(position).getPortada())
                .into(portada);

        return(item);
    }
}
