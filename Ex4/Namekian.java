public class Namekian extends PersonagemDragonBall {
    int quantidadeEsferas;
    boolean podeCurar;

    public Namekian(String nome, int idade, String sexo, int ki, String poderEspecial, int quantidadeEsferas, boolean podeCurar) {
        super(nome, idade, sexo, ki, poderEspecial);
        this.quantidadeEsferas = quantidadeEsferas;
        this.podeCurar = podeCurar;
    }

    public String transformarPedido(String pedido) {
        String[] palavras = pedido.split(" ");

        StringBuilder pedidoTransformado = new StringBuilder();

        for (String palavra : palavras) {
            pedidoTransformado.append("Name").append(palavra).append(" ");
        }

        return "Desejo: " + pedidoTransformado.toString().trim();
    }
}
