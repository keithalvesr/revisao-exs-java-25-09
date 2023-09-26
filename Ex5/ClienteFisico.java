package Ex5;

public class ClienteFisico extends Cliente {
    private String cpf;

    public ClienteFisico(int codigo, String nome, String telefone, String email, String cpf) {
        super(codigo, nome, telefone, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}