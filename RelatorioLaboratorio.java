import java.util.Locale; // Importa a classe Locale para configurar padrões regionais (ex.: separador decimal com ponto)
import java.util.Scanner; // Importa a classe Scanner para ler dados digitados no console (teclado)

public class RelatorioLaboratorio {

    public static void main(String[] args) {

        // Define o padrão regional do programa.
        // Locale.US usa ponto como separador decimal (ex.: 3.50).
        Locale.setDefault(Locale.US);

        // Cria um Scanner para ler dados digitados no teclado (console).
        Scanner entrada = new Scanner(System.in);

        // Título do programa (saída informativa).
        System.out.println("Relatorio Diario Do Laboratorio");

        // Solicita a quantidade de amostras (inteiro).
        System.out.print("Informe A Quantidade De Amostras Processadas: ");
        int amostras = entrada.nextInt();

        // Solicita o tempo total gasto (pode ter casas decimais).
        System.out.print("Informe O Tempo Total Gasto (Em Minutos): ");
        double tempoTotalMin = entrada.nextDouble();

        // Solicita o número de resultados válidos (inteiro).
        System.out.print("Informe O Numero De Resultados Validos: ");
        int validos = entrada.nextInt();

        // Calcula o tempo médio por amostra.
        // Como tempoTotalMin é double, o resultado será decimal (se necessário).
        double tempoMedio = tempoTotalMin / amostras;

        // Calcula o percentual de válidos.
        // (double) amostras força divisão decimal, evitando truncamento da divisão inteira.
        double percentualValidos = (validos / (double) amostras) * 100.0;

        // Mostra os resultados com formatação e rótulos claros.
        System.out.println("\nResultados");
        System.out.println("Tempo Medio Por Amostra (min): " + String.format("%.2f", tempoMedio));
        System.out.println("Percentual De Resultados Validos (%): " + String.format("%.2f", percentualValidos));

        // Fecha o Scanner (boa prática de uso de recursos).
        entrada.close();
    }
}
