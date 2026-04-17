import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos dados do produto
        String nome = sc.nextLine();
        double preco = sc.nextDouble();
        int quantidadeEstoque = sc.nextInt();
        int quantidadeVendida = sc.nextInt();

        sc.close();

        // Exibir informações antes da venda
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Estoque antes da venda: " + quantidadeEstoque + " unidades");

        // Processar a venda
        if (quantidadeVendida > quantidadeEstoque) {
            System.out.println("Estoque insuficiente para realizar a venda.");
        } else {
            quantidadeEstoque -= quantidadeVendida;
            System.out.println("Venda realizada: " + quantidadeVendida + " unidades");
            System.out.println("Estoque atualizado: " + quantidadeEstoque + " unidades");
        }
    }
}
