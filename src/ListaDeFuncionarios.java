import java.util.ArrayList;

public class ListaDeFuncionarios {

    private static ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<>();

    public static ArrayList<Funcionario> getListarFuncionarios() {
        return listaDeFuncionarios;
    }

    public static void adicionarFuncionario(Funcionario funcionario) {
        listaDeFuncionarios.add(funcionario);
    }

    public static void removerFuncionario(Funcionario funcionario) {
        listaDeFuncionarios.remove(funcionario);
    }

    public static ArrayList<Funcionario> buscarFuncionarioPorNome(String nome) {
        ArrayList<Funcionario> funcionariosEncontrados = new ArrayList<>();
        for (Funcionario funcionario : listaDeFuncionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                funcionariosEncontrados.add(funcionario);
            }
        }
        return funcionariosEncontrados;
    }

    public static Funcionario buscarFuncionarioPorMatricula(String matricula) {
        for (Funcionario funcionario : listaDeFuncionarios) {
            if (funcionario.getMatricula().equals(matricula)) {
                return funcionario;
            }
        }
        return null;
    }
}