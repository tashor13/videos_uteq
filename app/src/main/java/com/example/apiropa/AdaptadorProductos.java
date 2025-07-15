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

public class AdaptadorProductos extends ArrayAdapter<Producto> {
    public AdaptadorProductos(Context context, ArrayList<Producto> datos)  {
        super(context, R.layout.item, datos);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item, null);

        TextView lblNombre = (TextView)item.findViewById(R.id.lblNombre);
        lblNombre.setText(getItem(position).getNombre());

        TextView txtDescripcion = (TextView)item.findViewById(R.id.txtDescripcion);
        txtDescripcion.setText(getItem(position).getDescripcion());

        TextView txtCategoria = (TextView)item.findViewById(R.id.txtCategoria);
        txtCategoria.setText(getItem(position).getCategoria());

        TextView txtPrecio = (TextView)item.findViewById(R.id.txtPrecio);
        txtPrecio.setText(Double.toString(getItem(position).getPrecio()));

        ImageView imageView = (ImageView)item.findViewById(R.id.imgUsr);
        Glide.with(this.getContext())
                .load(getItem(position).getImagen())
                .into(imageView);

        return(item);
    }
}
