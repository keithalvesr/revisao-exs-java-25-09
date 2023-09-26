package Ex5;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int codigo;
    private Cliente cliente;
    private List<Produto> produtos;
    private List<Integer> quantidadeProdutos;

    public Venda(int codigo, Cliente cliente) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.quantidadeProdutos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.add(produto);
        quantidadeProdutos.add(quantidade);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;

        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            int quantidade = quantidadeProdutos.get(i);

            valorTotal += produto.getValor() * quantidade;
        }

        return valorTotal;
    }

    public void mostrarProdutosComprados() {
        System.out.println("Produtos comprados:");

        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            int quantidade = quantidadeProdutos.get(i);
            
            System.out.println("Nome: " + produto.getNome() + ", Quantidade: " + quantidade);
        }
    }
}
