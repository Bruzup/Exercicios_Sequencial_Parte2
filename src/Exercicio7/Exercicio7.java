package Exercicio7;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Digite o valor da hora trabalhada no mês: ");
        double valorHora = entradaDoUsuario.nextDouble();

        System.out.println("Digite o número de horas trabalhadas no mês: ");
        double horaTrabalhada = entradaDoUsuario.nextDouble();

        double salarioMensal = valorHora * horaTrabalhada;

        System.out.println("Seu salário mensal é de: R$" + salarioMensal);

        double descontoIr = salarioMensal * 0.11;
        double descontoInss = salarioMensal * 0.08;
        double descontoSind = salarioMensal * 0.05;
        double totalComDesconto = salarioMensal - (descontoIr + descontoInss + descontoSind);

        System.out.println(" O desconto do imposto de renda é de R$ " + descontoIr);
        System.out.println(" O desconto do INSS é de R$ " + descontoInss);
        System.out.println(" O desconto do sindicato é de R$ " + descontoSind);
        System.out.println(" O total recebido no mês com os descontos é de R$ " + totalComDesconto);

        entradaDoUsuario.close();
    }
}
