import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
//Definindo variáveis.
        double descontocarro;
        char desejacontinuar;
        int carroate2000 = 0;
        int totaldecarros = 0;
//Iniciando estrutura de repetição do-while.
        do {
//Entrada de dados
            System.out.println("Digite o ano do carro");
            int anocarro = Leitor.nextInt();

            System.out.println("Digite o valor do carro");
            double valorcarro = Leitor.nextDouble();
//Desconto aplicado e armazenado.
            if (anocarro >= 2000) {
                descontocarro = valorcarro * 0.07;
            } else {
                descontocarro = valorcarro * 0.12;
            }

            descontocarro = valorcarro - descontocarro;
//Saída para usuário.
            System.out.println("O valor do carro de ano " + anocarro + " ficou em " + descontocarro);
//Contagem de quantidades de carros abaixo dos anos 2000.
            if(anocarro <= 2000){
                carroate2000++;
            }
            totaldecarros++;
//Verificação de fim ou continuação do loop.
            System.out.println("Deseja continuar? S - sim / N - não");
            desejacontinuar = Leitor.next().charAt(0);

        } while (desejacontinuar == 'S' || desejacontinuar == 's');

        System.out.println("O total de carros até os anos 2000 é: " + carroate2000 + " e o total de carros informado foi de " + totaldecarros);
    }
}
