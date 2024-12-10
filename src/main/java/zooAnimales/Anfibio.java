package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado;
    public static int ranas = 0;
    public static int numAnimales = 0;
    public static int salamandras = 0;
    private String colorPiel;
    private Boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero,String colorPiel,Boolean venenoso){
        super(nombre,edad,habitat,genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        Anfibio.numAnimales++;
    }
    public Anfibio(){
        Anfibio.numAnimales++;
    }

    public static int cantidadAnfibios(){
        return Anfibio.getListado();
    }
    public String movimiento(){
        return "saltar";
    }
    public static Anfibio crearRana(String nombre,int edad,String genero){
        Anfibio rana = new Anfibio(nombre,edad,"selva",genero,"rojo",true);
        Anfibio.listado.add(rana);
        Anfibio.ranas += 1;
        return rana;
    }
    public static Anfibio crearSalamandra(String nombre,int edad,String genero){
        Anfibio salamandra = new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
        Anfibio.listado.add(salamandra);
        Anfibio.salamandras += 1;
        return salamandra;
    }
    public static int getListado(){return Anfibio.listado.size();}
    public String getColorPiel(){return this.colorPiel;}
    public Boolean isVenenoso(){return this.venenoso;}
}
