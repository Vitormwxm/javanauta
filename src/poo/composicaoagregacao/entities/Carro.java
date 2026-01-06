package poo.composicaoagregacao.entities;

public class Carro {

    // atributo do tipo motor
    private Motor motor;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void mostrarCilindradas() {
        System.out.println("O motor tem " + motor.getCilindradas() + " cilindradas ");
    }
}
