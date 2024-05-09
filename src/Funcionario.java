public abstract class Funcionario implements Trabalhavel {

    private String nome;
    private String matricula;

    public Funcionario() {
    }

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nMatrícula: " + matricula;
    }

    public abstract float calcularSalario();
}