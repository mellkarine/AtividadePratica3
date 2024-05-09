public class Sistema {

    private static void menu() {

        System.out.println("\nFUNCIONARIO SYSTEM");
        System.out.println("1) Adicionar Funcionário");
        System.out.println("2) Remover Funcionário Existente");
        System.out.println("3) Listar Funcionários");
        System.out.println("4) Sair");
        System.out.print("Informe uma opção: ");
    }

    private static void addFuncionario() {

        System.out.println("\nCargos Disponíveis: ");
        System.out.println("1) Estagiário");
        System.out.println("2) Desenvolvedor");
        System.out.println("3) Gerente");
        System.out.println("Cargo Selecionado: ")
        int cargo = Console.lerInt();

        switch (cargo) {
            
            case 1:
                System.out.println("Informe o Nome do Funcionário: ");
                String nome = Console.lerString();

                System.out.println("\nInforme a Matrícula do Funcionário: ");
                String matricula = Console.lerString();

                System.out.println("\nInforme as Horas Trabalhadas do Funcionário: ");
                int horasTrabalhadas = Console.lerInt();

                System.out.println("\nInforme qual o Supervisor do Funcionário: ");
                String supervisor = Console.lerString();

                Funcionario estagiario = new Estagiario(nome, matricula, horasTrabalhadas, supervisor);
                listaDeFuncionarios.addFuncionario(estagiario);

                System.out.println("Estagiário Cadastrado com Sucesso!");
            break;

            case 2:
                System.out.println("Informe o Nome do Funcionário: ");
                String nome = Console.lerString();

                System.out.println("\nInforme a Matrícula do Funcionário: ");
                String matricula = Console.lerString();

                System.out.println("\nInforme as Tecnologias que o Funcionário Domina: ");
                String tecnologias = Console.lerString();

                Funcionario desenvolvedor = new Desenvolvedor(nome, matricula, tecnologias);
                listaDeFuncionarios.addFuncionario(desenvolvedor);

                System.out.println("Desenvolvedor Cadastrado com Sucesso!");
            break;

            case 3:
                System.out.println("Informe o Nome do Funcionário: ");
                String nome = Console.lerString();

                System.out.println("\nInforme a Matrícula do Funcionário: ");
                String matricula = Console.lerString();

                System.out.println("Informe o valor do Bônus Anual: ");
                int bonusAnual = Console.lerInt();
                
                System.out.println("Informe a Equipe Gerenciada: ");
                String equipe = Console.lerString();

                Funcionario gerente = new Gerente(nome, matricula, bonusAnual, equipe);
                listaDeFuncionarios.addFuncionario(gerente);

                System.out.println("Gerente Cadastrado com Sucesso!");
            break;
            
            default:
            break;
        }
        
    }

    private static void removeFuncionario() {
        if(ListaDeFuncionarios.getListarFuncionarios().isEmpty()) {
            System.out.println("\nNão há Funcionários Cadastrados");
            return;
        }

        System.out.println("\nRemover Funcionário por Matrícula");
        System.out.print("Informe a matrícula do funcionário: ");
        String matricula = Console.lerString();
        Funcionario funcionario = ListaDeFuncionarios.buscarFuncionarioPorMatricula(matricula);

        if(funcionario == null) {
            System.out.println("\nFuncionário não encontrado.");
            return;
        }

        ListaDeFuncionarios.removerFuncionario(funcionario);
        System.out.println("\nFuncionário removido.");

    }

    private static void listarOsFuncionarios() {

        System.out.println("\nTodos os funcionários Cadastrados:");

        if (ListaDeFuncionarios.getListarFuncionarios().size() == 0) {

            System.out.println("\nNão há fucionários cadastrados...");
            return;

        }

        for (Funcionario temp : ListaDeFuncionarios.getListarFuncionarios()) {

            System.out.println(temp.toString());
    }

    private static void verOpcao(int op) {

        switch (op) {

            case 1:
                addFuncionario();
            break;

            case 2:
                removeFuncionario();
            break;

            case 3:
                listarOsFuncionarios();
            break;

            case 4:
                System.out.println("\nO programa foi encerrado!");
            break;

            default:
                System.out.println("\nOpção inválida!");
            break;
        }
    }

    public static void executar() {

        int op;
        do {

            menu();
            op = Console.lerInt();
            verOpcao(op);

        } while (op != 0);

    }
}