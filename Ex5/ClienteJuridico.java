package Ex5;

public class ClienteJuridico extends Cliente {
    private String cnpj;
    private String nomeFantasia;

    public ClienteJuridico(int codigo, String nome, String telefone, String email, String cnpj, String nomeFantasia) {
        super(codigo, nome, telefone, email);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
}
