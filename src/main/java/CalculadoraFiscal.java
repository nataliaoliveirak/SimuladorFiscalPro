public class CalculadoraFiscal {

    public double calcularST(double valor, double mvaOriginal, double aliqInter, double aliqInt) {
        // A FÓRMULA QUE VOCÊ PASSOU:
        // [(1 + MVA original) * (1 - Alíquota Interestadual) / (1 - Alíquota Interna) - 1]
        double parte1 = (1 + (mvaOriginal / 100));
        double parte2 = (1 - (aliqInter / 100));
        double parte3 = (1 - (aliqInt / 100));

        double mvaAjustado = (parte1 * parte2 / parte3) - 1;

        // CÁLCULO FINAL DA ST
        double baseST = valor * (1 + mvaAjustado);
        double debitoST = baseST * (aliqInt / 100);
        double icmsProprio = valor * (aliqInter / 100);

        return debitoST - icmsProprio;
    }

    public double calcularDifal(double valor, double aliqInt, double aliqInter) {
        return (valor * (aliqInt / 100)) - (valor * (aliqInter / 100));
    }
}