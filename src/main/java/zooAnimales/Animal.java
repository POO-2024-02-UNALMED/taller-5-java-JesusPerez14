package zooAnimales;

import gestion.Zona;

public class Animal {
    private static int totalAnimales = 0;
    private String nombre;
    private int edad;

    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(String nombre,int edad,String habitat,String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;

        Animal.totalAnimales += 1;
    }
    public Animal(String nombre,int edad,String genero){
        this(nombre,edad,"",genero);
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
    }

    public Animal(){
        this("",1,"","");
    }

    public String movimiento(){
        return "desplazarse";
    }
    public static String totalPorTipo(){
        return "Mamiferos: "+ Mamifero.getListado() +"\n" +
                "Aves: "+ Ave.getListado() +"\n" +
                "Reptiles: "+ Reptil.getListado() +"\n" +
                "Peces: "+ Pez.getListado() +"\n" +
                "Anfibios: "+ Anfibio.getListado();
    }
    public String toString(){
        return "Mi nombre es " + this.nombre +", tengo una edad de "+ this.edad + ", habito en "+ this.habitat + " y mi genero es "+ this.genero +".";
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getHabitat() {
        return habitat;
    }
    public String getGenero() {
        return genero;
    }

}
