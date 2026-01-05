package poo.encapsulamento.application;

import poo.encapsulamento.entities.ContaBancaria;

public class Program {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("Vitor", 100);

        contaBancaria.setTitular("Vitor Martiniano");
        contaBancaria.setSaldo(contaBancaria.getSaldo() + 500);

        String titularConta = contaBancaria.getTitular();;
        double saldoFinal = contaBancaria.getSaldo();

        System.out.println("O titular da conta é : " + titularConta + " e o saldo final é " + saldoFinal);

    }
}
