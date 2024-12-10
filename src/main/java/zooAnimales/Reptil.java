package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Reptil extends Animal{
    private static ArrayList<Reptil> listado;
    public static int iguanas = 0;
    public static int serpientes = 0;
    public static int numAnimales = 0;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero,String colorEscamas,int largoCola){
        super(nombre,edad,habitat,genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;

        Reptil.numAnimales++;
    }
    public Reptil(){
        Reptil.numAnimales++;
    }
    public static int cantidadReptiles(){
        return listado.size();
    }
    public String movimiento(){
        return "reptar";
    }
    public static Reptil crearIguana(String nombre,int edad,String genero){
        Reptil iguana = new Reptil(nombre,edad,"humedal",genero,"verde",3);
        Reptil.listado.add(iguana);
        return iguana;
    }
    public static Reptil crearSerpiente(String nombre,int edad,String genero){
        Reptil serpiente = new Reptil(nombre,edad,"jungla",genero,"blanco",1);
        Reptil.listado.add(serpiente);
        return serpiente;
    }

    public static int getListado(){return Reptil.listado.size();}
    public String getColorEscamas(){return this.colorEscamas;}
    public int getLargoCola(){return this.largoCola;}
}
