public class Aluno {

    private int matricula;
    private String nome;
    private String lutaDom;

    public Aluno() {
    }

    public Aluno(int matricula, String nome, String lutaDom) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLutaDom() {
        return lutaDom;
    }

    public void setLutaDom(String lutaDom) {
        this.lutaDom = lutaDom;
    }

    @Override
    public String toString() {

        return "\nMatrícula: " + matricula +
                "\nNome: " + nome +
                "\nArtes marciais que pratica: " + lutaDom;
    }

}
