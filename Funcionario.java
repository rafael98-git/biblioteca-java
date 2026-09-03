public class Funcionario extends Usuario {

    public String cargo;

    public Funcionario(String nome, String CPF, String email, String cargo) {
        super(nome, CPF, email);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}
