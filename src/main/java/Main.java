import java.sql.*;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale brasil = new Locale("pt", "BR");
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(brasil);
        DecimalFormat df = new DecimalFormat("#,##0.000", simbolos);

        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(brasil);

        CalculadoraFiscal calc = new CalculadoraFiscal();

        try {
            System.out.println("=== 📑 SIMULADOR FISCAL NATÁLIA ===");

            // ORDEM DOS CAMPOS QUE VOCÊ PEDIU:
            System.out.print("Digite o valor do produto: ");
            double valorProd = leitor.nextDouble();

            System.out.print("Tipo de operação: (1) DIFAL ou (2) ST? ");
            int tipo = leitor.nextInt();

            System.out.print("MVA Original do Produto (%): ");
            double mvaOriginal = leitor.nextDouble();

            System.out.print("Alíquota Interestadual: ");
            double aliqInter = leitor.nextDouble();

            System.out.print("Alíquota Interna: ");
            double aliqInt = leitor.nextDouble();

            double resultadoFinal = 0;

            if (tipo == 1) {
                resultadoFinal = calc.calcularDifal(valorProd, aliqInt, aliqInter);
            } else {
                resultadoFinal = calc.calcularST(valorProd, mvaOriginal, aliqInter, aliqInt);
            }

            System.out.println("\n----------------------------------");
            System.out.println("✅ RESULTADO DO CÁLCULO:");
            System.out.println("Imposto a Recolher: R$ " + df.format(resultadoFinal));
            System.out.println("----------------------------------");

        } catch (Exception e) {
            System.out.println("Erro na digitação: " + e.getMessage());
        }
    }
}