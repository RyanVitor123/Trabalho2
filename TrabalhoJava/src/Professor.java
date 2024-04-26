public class Professor extends Aluno {

    private int idade;

    public Professor() {
    }

    public Professor(int matricula, String nome, String lutaDom, int idade) {
        super(matricula, nome, lutaDom);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nInforme a idade: " + idade;
    }

}
