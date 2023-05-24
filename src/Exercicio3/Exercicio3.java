package Exercicio3;

import java.util.Scanner;
public class Exercicio3 {

    public static void main(String[] args){
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("Digite sua medida (em metros!): ");
        double medida = entradaDoUsuario.nextDouble();
        double medidaConvertida = medida * 100;

        System.out.println(medida + " metros equivalem a " + medidaConvertida + " centímetros.");

        entradaDoUsuario.close();
    }

}
