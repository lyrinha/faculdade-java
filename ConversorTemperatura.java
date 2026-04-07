import java.util.Locale;
import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Conversor Celsius Para Fahrenheit ===");
        System.out.print("Informe A Temperatura Em Celsius: ");
        double celsius = entrada.nextDouble();

        // Complete o processamento:
        double fahrenheit = (double) celsius * 9/5 + 32;

        System.out.println("Temperatura Em Fahrenheit: " + String.format("%.2f", fahrenheit));

        entrada.close();
    }
}