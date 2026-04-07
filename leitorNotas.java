import java.util.Locale;
import java.util.Scanner;

public class leitorNotas {


    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double notaUm = leitor.nextDouble();

        System.out.print("Digite a nota 2: ");
        double notaDois = leitor.nextDouble();

        System.out.print("Digite a nota 3: ");
        double notaTres = leitor.nextDouble();

        Double media = (notaUm + notaDois + notaTres) / 3;

        System.out.printf("Esta é a média final: %.2f", media);

        leitor.close();
    }

}

