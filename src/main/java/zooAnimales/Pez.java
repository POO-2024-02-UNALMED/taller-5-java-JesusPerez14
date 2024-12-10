package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Pez extends Animal{
    private static ArrayList<Pez> listado;
    public static int salmones = 0;
    public static int bacalaos = 0;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero,String colorEscamas,int cantidadAletas){
        super(nombre,edad,habitat,genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }
    public Pez(){}
    public static int cantidadPeces(){return Pez.getListado();}
    public String movimiento(){
        return "nadar";
    }
    public static Pez crearSalmon(String nombre,int edad,String genero){
        Pez salmon = new Pez(nombre,edad,"oceano",genero,"rojo",6);
        Pez.listado.add(salmon);
        Pez.salmones += 1;

        return salmon;
    }
    public static Pez crearBacalao(String nombre, int edad, String genero){
        Pez bacalao = new Pez(nombre,edad,"oceano",genero,"gris",6);
        Pez.listado.add(bacalao);
        Pez.bacalaos += 1;
        return bacalao;
    }
    public static int getListado(){return Pez.listado.size();}
    public String getColorEscamas(){return this.colorEscamas;}
    public int getCantidadAletas(){return this.cantidadAletas;}
}
