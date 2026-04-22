import java.util.Scanner;


public class calculoIMC {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double peso;

        System.out.println("Digite 0 para encerrar");

        while (true) {
            System.out.printf("Digite o seu peso (kg): ");
            peso = entrada.nextDouble();

            if (peso == 0) {
                break;
            }
            System.out.printf("Digite a atura (m): ");
            double altura = entrada.nextDouble();

            double imc = calcularIMC(peso, altura);

            System.out.println("IMC: " + imc);
            System.out.println("-----------------");

        }
        entrada.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

}