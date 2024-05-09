public class Estagiario extends Funcionario {

    private int horasTrabalhadas;
    private String supervisor;

    public Estagiario() {
    }

    public Estagiario(String nome, String matricula, int horasTrabalhadas, String supervisor) {
        super(nome, matricula);
        this.horasTrabalhadas = horasTrabalhadas;
        this.supervisor = supervisor;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getSupervisor() {
        return supervisor;
    }

    public void setSupervisor() {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHoras Trabalhadas: " + horasTrabalhadas + "\nSupervisor: " + supervisor;
    }

    @Override
    public float calcularSalario() {
        return horasTrabalhadas * 15;
    }

    @Override
    public String trabalhar() {
        return "O(a) Estagiário(a) " + getNome() + " está trabalhando!";
    }

    @Override
    public String relatarProgresso() {
        return "O(a) Estagiário(a) " + getNome() + " evoluiu em muitas coisas hoje!";
    }
}