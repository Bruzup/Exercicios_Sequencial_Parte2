package Exercicio4;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args){
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Digite o valor da hora trabalhada no mês: ");
        double valorHora = entradaDoUsuario.nextDouble();

        System.out.println("Digite o número de horas trabalhadas no mês: ");
        double horaTrabalhada = entradaDoUsuario.nextDouble();

        double salarioMensal = valorHora * horaTrabalhada;

        System.out.println("Seu salário mensal é de: R$" + salarioMensal);

        entradaDoUsuario.close();
    }
}
