
/**
 * Programa que utiliza Scanner para construir um menu de opções.
 */
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        double base = 0;
        double altura = 0;
        double area = 0;

        //Variável do scanner para entrada dos dados
        Scanner sc = new Scanner(System.in);

        //Armazena opção lida
        int opcao = -1;
        while (opcao != 99) {
            System.out.print("\n\t### Menu de Opções ###\n"                    
                    + " 1- Leitura dos dados\n"
                    + " 2- Impressão dos dados\n"
                    //Outras opções vão aqui
                    + " 3- Calcular área\n"
                    + "99- Sair\n"
                    + "Digite a opção desejada:");
            //Realiza a leitura da opção
            opcao = sc.nextInt();

            //Verifica a opção
            switch (opcao) {
                case 1: {
                    System.out.print("\nDigite a base do triângulo:");
                    base = sc.nextDouble();
                    System.out.print("Digite a altura do triângulo:");
                    altura = sc.nextDouble();
                    break;
                }
                case 2: {
                    System.out.println("\nO triângulo tem base: " + base + " e altura:" + altura);
                    break;
                }
                case 3: {
                    area = (base * altura) / 2.0;
                    System.out.println("\nA área do triângulo: " + area);
                    break;
                }
                //Outras opções vão aqui

                //Opção de saída do programa
                case 99: {
                    System.out.println("\nSaindo do programa!");
                    break;
                }
                //Opção inválida do menu
                default: {
                    System.out.println("\nOpção inválida!");
                    break;
                }
            }
        }
    }
}
