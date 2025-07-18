package com.example.apiropa;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class video {
    private String titulo;

    private String fecha;
    private String portada;
    private String url;

    public video(JSONObject a) throws JSONException {
        titulo =  a.getString("titulo").toString();
        fecha =  a.getString("fechapub").toString() ;
        portada ="https://uteq.edu.ec/assets/images/videos/res-sem/"+ a.getString("portadaVideo").toString() ;
        url = a.getString("urlvideo1").toString() ;
    }
    public static ArrayList<video> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<video> videos = new ArrayList<>();

        for (int i = 0; i < datos.length() && i<20; i++) {
            videos.add(new video(datos.getJSONObject(i)));
        }
        return videos;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String nombre) {
        this.titulo = titulo;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
