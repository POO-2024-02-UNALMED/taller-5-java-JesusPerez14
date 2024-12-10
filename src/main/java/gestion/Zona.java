package gestion;

import zooAnimales.Animal;

import java.util.ArrayList;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales;

    public Zona(String nombre,Zoologico zoo,ArrayList<Animal> animales){
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = animales;
    }
    public Zona(String nombre,Zoologico zoo){
        this(nombre,zoo,new ArrayList<Animal>());
        this.zoo = zoo;
        this.nombre = nombre;
    }
    public Zona(){
        this("",new Zoologico(),new ArrayList<Animal>());
    }
    public void agregarAnimales(Animal animal){
        this.animales.add(animal);
    }
    public int cantidadAnimales(){
        return animales.size();
    }

    public String getNombre(){
        return this.nombre;
    }
    public Zoologico getZoo(){return this.zoo;}
    public ArrayList<Animal> getAnimal(){return this.animales;}
}
