package Exercicio5;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args){

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Qual a temperatura? (Em Fahrenheit!) ");
        double temperaturaFahr = entradaDoUsuario.nextDouble();

        double temperaturaCel = (temperaturaFahr -32)/ 1.8;

        DecimalFormat formatador = new DecimalFormat("0.00");

        System.out.println("A temperatura em graus Celsius é de: " + formatador.format(temperaturaCel) + "ºC" );

    }
}
