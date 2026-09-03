public class Aluno extends Usuario {
    public String turma;
    public String curso;

    public Aluno(String nome, String CPF, String email, String turma, String curso) {
        super(nome, CPF, email);
        this.turma = turma;
        this.curso = curso;
    }

    public String getCurso() {
       return curso;

    }

    public String getTurma() {
        return turma;
    }
}