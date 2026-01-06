package poo.heranca.application;


import poo.heranca.entities.Cachorro;
import poo.heranca.entities.Galinha;

public class Program {
    public static void main(String[] args) {

        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.comer("Ração");

        Galinha gertrudez = new Galinha();
        gertrudez.ciscar();
        gertrudez.comer("milho");
    }
}
