import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static double converter(double valor, double taxa) {
        return valor * taxa;
    }
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCambio consultaCambio = new ConsultaCambio();

        int opcao = 0;
        while (opcao != 7) {
            System.out.println("""
                    Seja bem-vindo/a ao Conversor de moeda
                    
                    1) Dólar =>> Peso argentino
                    2) Peso argentino =>> Dólar
                    3) Dólar =>> Real brasileiro
                    4) Real brasileiro =>> Dólar
                    5) Dólar =>> Peso colombiano
                    6) Peso colombiano =>> Dólar
                    7) Sair
                    
                    Escolha uma opção válida:
                    """);

            opcao = leitura.nextInt();

            if (opcao < 1 || opcao > 7){
                System.out.println("Opção inválida. Escolha entre 1 e 7.");
                continue;
            }

            if (opcao == 7) {
                System.out.println("Programa finalizado.");
                break;
            }
            System.out.println("Digite o valor que deseja converter:");
            double valor = leitura.nextDouble();
            Map<String, Double> moedas;

            switch (opcao) {
                case 1:
                    moedas = consultaCambio.buscarCambio("USD");
                    System.out.printf("Valor convertido: %.2f ARS%n",
                            converter(valor, moedas.get("ARS")));
                    break;
                case 2:
                    moedas = consultaCambio.buscarCambio("ARS");
                    System.out.printf("Valor convertido: %.2f USD%n",
                            converter(valor, moedas.get("USD")));
                    break;
                case 3:
                    moedas = consultaCambio.buscarCambio("USD");
                    System.out.printf("Valor convertido: %.2f BRL%n ",
                            converter(valor, moedas.get("BRL")));
                    break;
                case 4:
                    moedas = consultaCambio.buscarCambio("BRL");
                    System.out.printf("Valor convertido: %.2f USD%n",
                            converter(valor, moedas.get("USD")));
                    break;
                case 5:
                    moedas = consultaCambio.buscarCambio("USD");
                    System.out.printf("Valor convertido: %.2f COP%n",
                            converter(valor, moedas.get("COP")));
                    break;

                case 6:
                    moedas = consultaCambio.buscarCambio("COP");
                    System.out.printf("Valor convertido: %.2f USD%n",
                            converter(valor, moedas.get("USD")));
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        }
    }
}

