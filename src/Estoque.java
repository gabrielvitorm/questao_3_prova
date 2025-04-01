public class Estoque {

    private String nomeProduto;
    private Double precoProduto;
    private int estoqueInicialProduto;
    private int estoquePosVendaProduto;
    private int qtqVendidaProduto;

    public void reduzirEstoque(){
        estoquePosVendaProduto = estoqueInicialProduto - qtqVendidaProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getEstoqueInicialProduto() {
        return estoqueInicialProduto;
    }

    public void setEstoqueInicialProduto(int estoqueInicialProduto) {
        this.estoqueInicialProduto = estoqueInicialProduto;
    }

    public int getEstoquePosVendaProduto() {
        return estoquePosVendaProduto;
    }

    public void setEstoquePosVendaProduto(int estoquePosVendaProduto) {
        this.estoquePosVendaProduto = estoquePosVendaProduto;
    }

    public int getQtqVendidaProduto() {
        return qtqVendidaProduto;
    }

    public void setQtqVendidaProduto(int qtqVendidaProduto) {
        this.qtqVendidaProduto = qtqVendidaProduto;
    }
}
