package Exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args){

            Scanner entradaDoUsuario = new Scanner(System.in);

            System.out.println("Digite a sua primeira nota bimestral: ");
            double primeiraNota = entradaDoUsuario.nextDouble();

            System.out.println("Digite a sua segunda nota bimestral: ");
            double segundaNota = entradaDoUsuario.nextDouble();

            System.out.println("Digite a sua terceira nota bimestral: ");
            double terceiraNota = entradaDoUsuario.nextDouble();

            System.out.println("Digite a sua quarta nota bimestral: ");
            double quartaNota = entradaDoUsuario.nextDouble();

            double mediaGeral = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

            System.out.println("A média geral é " + mediaGeral);
        }
    }



