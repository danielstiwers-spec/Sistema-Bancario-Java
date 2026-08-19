import java.util.Scanner;

public class bancario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Cria um Scanner para ler a resp
        
        int d = 0;
        int somaD = 0;
        int s = 0;
        int resp = 0;

        do {
            System.out.println("================================");
            System.out.println("===     Sistema Bancario     ===");
            System.out.println("================================");
            System.out.println("---------------------");
            System.out.println("=== [1] Depositar ===");
            System.out.println("=== [2] Sacar     ===");
            System.out.println("=== [3] Extrato   ===");
            System.out.println("=== [4] Sair      ===");
            System.out.println("---------------------");
            System.out.print("Qual operacao deseja realizar? ");
            resp = teclado.nextInt(); // resp recebe o Scanner (inteiro) para ler a entrada

            switch (resp) {
                case 1:
                    System.out.print("Quanto deseja depositar? ");
                    d = teclado.nextInt();
                    if (d > 0) {
                        somaD = somaD + d;
                    } else {
                        System.out.println("Valor invalido \n");
                    }
                    break;

                case 2:
                    System.out.print("Quanto deseja sacar? ");
                    s = teclado.nextInt();
                    if (s > 0 && somaD >= s) { // "&&" significa "e"
                        somaD = somaD - s;
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;

                case 3:
                    System.out.println("================================");
                    System.out.println("===      Saldo Bancário      ===");
                    System.out.println("================================");
                    System.out.println("--------------------------------");
                    System.out.printf("===        R$ %,d,00      ===\n", somaD); 
                    System.out.println("--------------------------------");
                    break;
                default:
                    System.out.println("Volte Sempre!\n");
                    break; // break encerra o switch, retornando ao começo.
            }

            if (resp != 4) {
                System.out.print("\n\n\n\n\n"); // "\n" significa "break line". Neste caso, apenas 4 linhas.
            }

        } while (resp != 4); 

        System.out.println("=================================================");
        System.out.println("===     S I S T E M A  E N C E R R A D O      ===");
        System.out.println("=================================================");
        
        teclado.close();
    }
}
