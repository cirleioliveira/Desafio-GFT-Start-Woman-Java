package one.digitalinnovation.basecamp;

public class Emprestimos {
    public static int getduasparcelas() {
        return 2;
    }

    public static int gettresparcelas(){
        return 3;
    }

    public static double gettaxaduasparcelas(){
        return 0.3;
    }

    public static double gettaxatresparcelas(){
        return 0.45;
    }

    public static void calcular(double valor, int parcelas){
        if (parcelas == 2){
            double valorFinal = valor + (valor * gettaxaduasparcelas());
            System.out.println("Valor total do emprestimo com 2 parcelas: " + valorFinal);

        } else if (parcelas == 3){
            double valorFinal = valor + (valor * gettaxatresparcelas());
            System.out.println("Valor total do empestimo com 3 parcelas: " + valorFinal);
        }
        else {
            System.out.println("Quantidades de parcelas nao aceita!");
        }
    }

}
