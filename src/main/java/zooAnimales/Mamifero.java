package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado;
    static public int caballos = 0;
    static public int leones = 0;
    private Boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero,Boolean pelaje,int patas){
        super(nombre,edad,habitat,genero);
        this.pelaje = pelaje;
        this.patas = patas;
    }
    public Mamifero(){}
    public static int cantidadMamiferos(){
        return Mamifero.getListado();
    }
    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        Mamifero caballo = new Mamifero(nombre,edad,"pradera",genero,true,4);
        Mamifero.listado.add(new Mamifero(nombre,edad,"pradera",genero,true,4));
        Mamifero.caballos += 1;

        return caballo;
    }
    public static Mamifero crearLeon(String nombre,int edad,String genero){
        Mamifero leon = new Mamifero(nombre,edad,"selva",genero,true,4);
        Mamifero.listado.add(leon);
        Mamifero.leones += 1;

        return leon;
    }
    public static int getListado(){return Mamifero.listado.size();}
    public Boolean isPelaje(){return this.pelaje;}
    public int getPatas(){return this.patas;}
}
