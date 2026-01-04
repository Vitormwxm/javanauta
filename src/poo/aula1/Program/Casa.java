package poo.aula1.Program;

import poo.aula1.entities.PlantaCasa;

public class Casa {
    public static void main(String[] args) {
        PlantaCasa casa = new PlantaCasa();

        // Inicializando os atributos (v)
        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Material";
        casa.cor = "Cinza";

        casa.construitr();
        casa.pintar();
    }
}
