package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado;
    static public int halcones = 0;
    public static int numAnimales = 0;
    static public int aguilas = 0;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        super(nombre,edad,habitat,genero);
        this.colorPlumas = colorPlumas;
        Ave.numAnimales++;
    }
    public Ave(){
        Ave.numAnimales++;
    }

    public static int cantidadAves(){
        return Ave.getListado();
    }
    public String movimiento(){
        return "volar";
    }
    public static Ave crearHalcon(String nombre,int edad,String genero){
        Ave halcon = new Ave(nombre,edad,"montañas",genero,"cafe glorioso");
        Ave.listado.add(halcon);
        Ave.halcones += 1;
        return halcon;
    }
    public static Ave crearAguila(String nombre,int edad,String genero){
        Ave aguila = new Ave(nombre,edad,"montañas",genero,"blanco y amarillo");
        Ave.listado.add(aguila);
        return aguila;
    }
    public static int getListado(){return Ave.listado.size();}
    public String getColorPlumas(){return this.colorPlumas;}
}
