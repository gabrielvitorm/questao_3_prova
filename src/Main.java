import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Estoque estoque = new Estoque();

        System.out.println("Digite o nome do produto:");
        estoque.setNomeProduto(leitor.next());

        System.out.println("Digite o preço do produto:");
        estoque.setPrecoProduto(leitor.nextDouble());

        System.out.println("Digite o estoque inicial do produto:");
        estoque.setEstoqueInicialProduto(leitor.nextInt());

        System.out.println("Digite a quantidade vendida do produto:");
        estoque.setQtqVendidaProduto(leitor.nextInt());

        estoque.reduzirEstoque();

        System.out.println(String.format("Produto: %s\nPreço: %.2f\nEstoque antes da venda: %d unidades\nVenda realizada: %d unidades\nEstoque atualizado: %d", estoque.getNomeProduto(), estoque.getPrecoProduto(), estoque.getEstoqueInicialProduto(), estoque.getQtqVendidaProduto(), estoque.getEstoquePosVendaProduto()));
    }
}