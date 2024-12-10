package gestion;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;

    public Zoologico(String nombre,String ubicacion,ArrayList<Zona> zonas){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = zonas;
    }
    public Zoologico(String nombre,String ubicacion){
        this(nombre,ubicacion,new ArrayList<Zona>());
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    public Zoologico(){
        this("","",new ArrayList<Zona>());
    };

    public void agregarZonas(Zona zona){
        this.zonas.add(zona);
    }
    public int cantidadTotalAnimales(){
        int cantidad = 0;
        for (Zona zona:zonas) {
            cantidad += zona.cantidadAnimales();
        }
        return cantidad;
    }

    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Zona> getZona(){return this.zonas;}
    public String getUbicacion(){return this.ubicacion;}
}
