package Exercicio6;
import java.util.Scanner;
public class Exercicio6 {
    public  static void main(String[] args){

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Digite um número inteiro qualquer: ");
        int numero  = entradaDoUsuario.nextInt();

        int antecessor = numero -1;
        int sucessor = numero + 1;

        System.out.println("O antecessor do número " + numero + " é: " + antecessor);
        System.out.println("O sucessor do número " + numero + " é: " + sucessor);

        entradaDoUsuario.close();
    }
}
