public class Telefone {
    public String ddd;
    public String numero;
    public String tipo;

    public Telefone(){
        this("","","");
    }
    public Telefone(String ddd, String numero, String tipo){
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
    }
    public Telefone(Telefone telefone){
        this(telefone.ddd, telefone.numero, telefone.tipo);
    }
}
