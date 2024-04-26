public class Sistema {

    private static void exibirMenu(){
        System.out.println("\nESCOLHA UMA OPÇÃO:");
        System.out.println("1) Cadastrar lutador:");
        System.out.println("2) Cadastrar professor:");
        System.out.println("3) Buscar lutador:");
        System.out.println("4) Listar todos:");
        System.out.println("0) sair:");
        System.out.print("Informe a opção: ");
    }

    private static void verificarOpcao(int op){
        int matricula;
        int idade;
        String nome;
        String faixa;
        String lutaDom;
        
        
        switch (op) {
            case 1:
                System.out.println("\nCADASTRO DO ALUNO:");
               
                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                System.out.print("Idade: ");
                idade = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();
                
                System.out.print("Informe o grau da faixa: ");
                faixa = Console.lerString();

                System.out.print("Informe as artes marciais(ex: muay thai, jiu-jitsu...): ");
                lutaDom = Console.lerString();


                Lutador l = new Lutador(matricula, idade, nome, faixa, lutaDom);

                Cadastro.cadastrar(l);

                System.out.println("\nALUNO cadastrado com sucesso!");


                break;
            
            case 2: 

                System.out.println("\nCADASTRO PROFESSOR:");
                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Artes marciais que pratica: ");
                lutaDom = Console.lerString();

                Aluno p = new Aluno(matricula, nome, lutaDom);

                Cadastro.cadastrar(p);

                System.out.println("Professor cadastrado com sucesso!");
                break;
            case 3:

            System.out.println("\nBUSCAR ALUNO:");

            System.out.print("Matrícula: ");
            matricula = Console.lerInt();

            Aluno s = Cadastro.buscar(matricula);

            if (s != null) {

                System.out.println("\nAluno Encontrado:");
                System.out.println(s.toString());
                return;

            }

            System.out.println("\nAluno com matrícula " + matricula + " não foi encontrado!");

            case 4:

            System.out.println("\nTodos os alunos cadastrados:");

                
                if (Cadastro.getListaAluno().size() == 0) {

                    System.out.println("\nNão há alunos cadastrados...");
                    return;

                }

                
                for (Aluno temp : Cadastro.getListaAluno()) {

                    System.out.println(temp.toString());

                }

            case 0:
                System.out.println("O programa foi finalizado...");
                break;
        
            default:
            System.out.println("\nOpção inválida! Digite novamente.");
                break;
        }
    }
    public static void executar() {
        int op;
        
        do {
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);
        } while (op != 0);
    }

}
