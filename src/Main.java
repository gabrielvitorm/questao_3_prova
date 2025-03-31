import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String nome;
        Double preco;
        Double precoTotal;
        int estoqueInicial;
        int estoquePosVenda;
        int qtqVendida;

        System.out.println("Digite o nome do produto:");
        nome = leitor.next();

        System.out.println("Digite o preço do produto:");
        preco = leitor.nextDouble();

        System.out.println("Digite o estoque inicial do produto:");
        estoqueInicial = leitor.nextInt();

        System.out.println("Digite a quantidade vendida do produto:");
        qtqVendida = leitor.nextInt();

        precoTotal = preco * qtqVendida;

        estoquePosVenda = estoqueInicial - qtqVendida;

        System.out.println(String.format("Produto: %s\nPreço: %.2f\nEstoque antes da venda: %d unidades\nVenda realizada: %d unidades\nEstoque atualizado: %d", nome, preco, estoqueInicial, qtqVendida, estoquePosVenda));
    }
}