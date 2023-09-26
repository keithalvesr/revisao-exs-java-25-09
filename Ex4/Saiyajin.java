public class Saiyajin extends PersonagemDragonBall {
    boolean temRabo;

    public Saiyajin(String nome, int idade, String sexo, int ki, String poderEspecial, boolean temRabo) {
        super(nome, idade, sexo, ki, poderEspecial);
        this.temRabo = temRabo;
    }

    public String transformar(int nivel) {
        if (nivel >= 1 && nivel <= 3) {
            return nome + " transformou para super saiyajin nível " + nivel;
        } 
        
        if ((nivel == 4 || nivel == 5) && (nome.equals("Goku") || nome.equals("Vegeta"))) {
            return nome + " transformou para super saiyajin nível " + nivel;
        } 

        return "Não foi possível transformar esse saiyajin";
    }
}