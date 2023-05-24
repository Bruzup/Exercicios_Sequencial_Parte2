package Exercicio1;

import java.util.Scanner;
public class Alo {
    public static void main(String[] args){
        System.out.println("Alô Mundo!");

        Scanner s = new Scanner(System.in);

        System.out.println("Deseja mais uma frase empolgante? (s/n) ");
         String resposta = s.nextLine();
         if (resposta.equals("s")) {
             System.out.println("Vamos pra cima que o tempo não espera! ");
         }
         else if(resposta.equals("n")) {
             System.out.println(" ");
         }
         else {
             System.out.println("Opção inválida");
         }
    }
}