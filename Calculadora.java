import java.util.Scanner;


public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Escolha a operacao: \n 1- Somar \n 2- Subtrair \n 3- Multiplicar");

        int escolha = scanner.nextInt();

        if (escolha == 1){

            System.out.println("digite o primeiro valor:");

            int valor1 = scanner.nextInt();

            System.out.println("digite o segundo valor:");

            int valor2 = scanner.nextInt();

            int resultado = Somar(valor1,valor2);

            System.out.println("Resultado:" + resultado);
        }

        if (escolha == 2){

            System.out.println("digite o primeiro valor:");

            int valor1 = scanner.nextInt();

            System.out.println("digite o segundo valor:");

            int valor2 = scanner.nextInt();

            int resultado = valor1 - valor2;

            System.out.println("Resultado:" + resultado);

        }

        if(escolha == 3){

            System.out.println("digite o primeiro valor:");

            int valor1 = scanner.nextInt();

            System.out.println("digite o segundo valor:");

            int valor2 = scanner.nextInt();

            int resultado = valor1 * valor2;

            System.out.println("Resultado:" + resultado);



        }




        }





    public static  int Somar(int a,int b)   { 

        int resultado = a + b;

        return resultado;

    } 

    }