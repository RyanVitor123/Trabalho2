import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private static List<Aluno> listaAluno = new ArrayList<>();

    public static void cadastrar(Aluno aluno) {
        listaAluno.add(aluno);
    }

    public static List<Aluno> getListaAluno() {
        return listaAluno;
    }

    public static Aluno buscar(int matricula) {

        // percorrer a lista de funcionarios
        for (Aluno temp : listaAluno) {

            // verificar se a matricula recebida como paramento é igual
            // a matricula do funcionario atual (temp)
            if (temp.getMatricula() == matricula) {

                // se for verdade, retornamos o funcionario atual (temp)
                return temp;
            }

        }
        // se sair do laço, significa que não há funcionário com a matricula
        // igual ao valor do paramentro "matricula" recebido no método
        return null; // entao retornamos "nulo"

    }

}
