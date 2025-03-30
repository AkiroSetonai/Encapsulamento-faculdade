public class EstoqueProduto {
    private String descricao;
    private int quantidade;
    private double valor;

    public void cadastrar(String descricao, int quantidade, double valor) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public void removerQuantidade(int quantidade) {
        if (quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Erro: Quantidade indisponível.");
        }
    }

    public void exibirEstoque() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor unitário: R$" + valor);
    }
}