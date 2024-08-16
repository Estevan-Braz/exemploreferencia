public class Pessoa {
    public String nome;
    public String cpf;
    public String dataNascimento;
    public String email;
    public Telefone telefone;
    public Endereco endereco;

    public Pessoa(){
        this.nome = "";
        this.cpf = "";
        this.dataNascimento = "";
        this.email = "";
        this.telefone = new Telefone();
        this.endereco = new Endereco();
    }

    public Pessoa(String nome, String cpf, String dataNascimento, String email, String ddd, String numero, String tipo){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.telefone = new Telefone(ddd, numero, tipo);

    }
}
