public class Funcionario {
  private int id;
  private String nome;
  private int idade;
  private double salario;

  public Funcionario(int id, String nome, int idade, double salario) {
    this.id = id;
    this.nome = nome;
    this.idade = idade;
    this.salario = salario;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public void promover() {
    if (idade > 18) {
        double aumento = salario * 0.25; // Aumento de 25%
        aumentarSalario(aumento);
    } else {
        System.out.println("O funcionário não pode ser promovido");
    }
  }

  public void aumentarSalario(double percentual) {
    this.salario += (this.salario * percentual)/100;
  }

  public void fazerAniversario() {
    this.idade += 1;
  }

  public void mostrarDetalhes() {
      System.out.println("ID: " + id);
      System.out.println("Nome: " + nome);
      System.out.println("Idade: " + idade);
      System.out.println("Salário: R$" + salario);
  }
}