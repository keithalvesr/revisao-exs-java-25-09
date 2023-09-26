package Ex5;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Venda> vendasDia;

    public Loja() {
        vendasDia = new ArrayList<>();
    }

    public void realizarVenda(Venda venda) {
        vendasDia.add(venda);
    }

    public double calcularFaturamento() {
        double faturamento = 0;

        for (Venda venda : vendasDia) {
            faturamento += venda.calcularValorTotal();
        }
        
        return faturamento;
    }

    public void simularFuncionamento() {
        Produto brinco = new Produto(1, "Brinco em prata - SKU 81471", 249.90, 20);
        Produto pulseira = new Produto(2, "Pulseira em ouro - SKU 19371", 1299.90, 8);
        Produto brinco2 = new Produto(2, "Brinco em ouro - SKU 81491", 899.90, 10);

        Endereco enderecoCliente = new Endereco(3970, "Avenida Rebouças", "Pinheiros", "05402-600", "São Paulo", "SP");
        ClienteFisico clienteFisico = new ClienteFisico(1, "Kevin", "123456789", "kevin@gmail.com", "123.456.789-01");
        ClienteJuridico clienteJuridico = new ClienteJuridico(2, "Empresa G&K", "987654321", "empresagek@gmail.com", "12.345.678/0001-90", "Empresa G&K acessórios Ltda.");

        Venda venda1 = new Venda(1, clienteFisico);
        venda1.adicionarProduto(brinco, 4);

        Venda venda2 = new Venda(2, clienteJuridico);
        venda2.adicionarProduto(pulseira, 1);
        venda2.adicionarProduto(brinco2, 2);

        realizarVenda(venda1);
        realizarVenda(venda2);

        System.out.println("Vendas realizadas hoje:");
        for (Venda venda : vendasDia) {
            System.out.println("Código: " + venda.getCodigo());
            System.out.println("Cliente: " + venda.getCliente().getNome());
            System.out.println("Valor total: R$" + venda.calcularValorTotal());
            
            venda.mostrarProdutosComprados();
            System.out.println();
        }

        double faturamento = calcularFaturamento();
        System.out.println("Faturamento da loja hoje: R$" + faturamento);
    }
}
