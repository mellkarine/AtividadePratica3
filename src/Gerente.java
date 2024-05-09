package abstrata;

public class Gerente extends Funcionario {
    
    private float bonusAnual;
    private String equipe;
    
    public Gerente() {
    }
    
    public Gerente(String nome, String matricula, float bonusAnual, String equipe) {
        super(nome, matricula);
        this.bonusAnual = bonusAnual;
        this.equipe = equipe;
    }

    public float getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual() {
        this.bonusAnual = bonusAnual;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe() {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEquipe sob Gerência: " + equipe "\nBônus Anual: " + bonusAnual;
    }

    @Override
    public float calcularSalario() {
        return 9000 + bonusAnual;
    }

    @Override
    public String trabalhar() {
        return "O(a) Gerente " + getNome() + " está trabalhando!";
    }

    @Override
    public String relatarProgresso() {
        return "O(a) Gerente " + getNome() + " gerenciou muitos afazeres hoje!";
    }
}