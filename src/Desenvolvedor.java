public class Desenvolvedor extends Funcionario {
    
    private String tecnologias;

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, String matricula, String tecnologias) {
        super(nome, matricula);
        this.tecnologias = tecnologias;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTecnologias que domina: " + tecnologias;
    }

    @Override
    public float calcularSalario() {
        return "6000";
    }

    @Override
    public String trabalhar() {
        return "O(a) Desenvolvedor(a) " + getNome() + " está trabalhando!";
    }

    @Override
    public String relatarProgresso() {
        return "O(a) Desenvolvedor(a) " + getNome() + " fez muitos códigos hoje! Uff!";
    }
}