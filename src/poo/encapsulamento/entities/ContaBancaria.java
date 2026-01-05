package poo.encapsulamento.entities;

public class ContaBancaria {
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria() {

    }

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Getter e Setter - Métodos Padrões para acessar e modificar os atributos
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
