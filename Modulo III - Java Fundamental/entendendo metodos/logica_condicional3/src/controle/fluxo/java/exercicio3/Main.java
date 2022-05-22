package controle.fluxo.java.exercicio3;

public class Main {

    public static void main(String[] args) {

        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana ();
        switchNumero ();
        switchFerias ();
    }

    public static void ifFlecha(){

        int mes = 3;
        if (mes == 1){
            System.out.println("Janeiro");
        }else {
            if (mes == 2){
                System.out.println("Fevereiro");
            }else {
                if (mes == 3){
                    System.out.println("março");
                }else {
                    if (mes == 4){
                        System.out.println("Abril");
                    }else {
                        if (mes == 5){
                            System.out.println("Maio");
                        }else {
                            if (mes == 6){
                                System.out.println("Junho");
                            }else {
                                if (mes == 7){
                                    System.out.println("Julho");
                                }else{
                                    if (mes == 8){
                                        System.out.println("Julho");
                                    }else {
                                        if (mes == 9){
                                            System.out.println("Agosto");
                                        }else {
                                            if (mes == 10){
                                                System.out.println("Outubro");
                                            }else {
                                                if (mes == 11){
                                                    System.out.println("Novembro");
                                                }else {
                                                    if (mes == 12){
                                                        System.out.println("Dezembro");
                                                    }else
                                                        System.out.println("Mes indefinido.");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public static void ifSemFlecha(){

        int mes = 13;

        if (mes == 1){
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
            
        } else if (mes == 3){
                System.out.println("Março");
                
        } else if (mes == 4){
            System.out.println("Abril");
            
        } else if (mes == 5) {
            System.out.println("Maio");
            
        } else if (mes == 6){
            System.out.println("junho");
            
        } else if (mes == 7) {
            System.out.println("Julho");
            
        } else if (mes == 8) {
            System.out.println("Agosto");
            
        } else if (mes == 9) {
            System.out.println("Setembro");
            
        } else if (mes == 10) {
            System.out.println("Outubro");
            
        } else if (mes == 11) {
            System.out.println("Novembro");
            
        } else if (mes == 12) {
            System.out.println("Dezembro");
            
        } else {
            System.out.println("Mês Indefinido.");
        }
    }

    public static void ifFerias(){

        String mes = "dezembro";

        if (mes == "junho" || mes == "dezembro" || mes == "janeiro"){
            System.out.println("Férias");
        }
    }

    public static void switchFerias(){

        String mes = "janeiro";
        switch (mes){
            case "janeiro":
            case "junho":
            case "dezembro":
                System.out.println("Férias em " + mes);
                break;
            default:
                System.out.println("Mês indefinido!");
                break;
        }
    }

    public static void ifMenor(){
        double salarioMensal = 12000.01d;
        double mediaSalario = 10500d;

        int quantidadeDependente = 4;
        int mediaDependente = 2;

        if ((salarioMensal < mediaSalario) && (quantidadeDependente >= mediaDependente)){
            System.out.println("O Funcionario tem direito receber o auxilio");
        }

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean dependentes = quantidadeDependente >= mediaDependente;

        if ((salarioBaixo) && (dependentes)) {
            System.out.println("Funcionario tem direito de receber o auxilio");
        }

        boolean recebeauxilio = (salarioBaixo) && (dependentes);
        if (recebeauxilio){
            System.out.println("Funcionario tem direiro de receber o auxilio");
        }else {
            System.out.println("Funcionario não tem direito receber auxilio");
        }
    }

    public static void switchSemana(){
        String dia = "Quarta";
        switch (dia){
            case "Domingo":
                System.out.println(dia + " é dia da semana " + 1);
                break;
            case "Segunda":
                System.out.println(dia + " é dia da semana " + 2);
                break;
            case "Terça":
                System.out.println(dia + " é dia da semana " + 3);
                break;
            case "Quarta":
                System.out.println(dia + " é dia da semana " + 4);
                break;
            case "Quinta":
                System.out.println(dia + " é dia da semana " + 5);
                break;
            case "Sexta":
                System.out.println(dia + " é dia da semana " + 6);
                break;
            case "Sabado":
                System.out.println(dia + " é dia da semana " + 7);
                break;
            default:
                System.out.println("Dia inválido");
        }
    }

    public static void switchNumero(){

        int numero = 5;

       switch (numero){
           case 1:
           case 2:
           case 3:
               System.out.println("Certo");
               break;
           case 4:
               System.out.println("Errado");
               break;
           case 5:
               System.out.println("Talvez");
               break;
           default:
               System.out.println("Valor indefinido");
               break;
       }
    }

}
