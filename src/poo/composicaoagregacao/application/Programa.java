package poo.composicaoagregacao.application;

import poo.composicaoagregacao.entities.Carro;
import poo.composicaoagregacao.entities.Motor;

public class Programa {
    public static void main(String[] args) {
        Carro fusca = new Carro(new Motor(30));
        fusca.mostrarCilindradas();
    }
}
