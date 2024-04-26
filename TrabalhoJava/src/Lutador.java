public class Lutador extends Aluno {

    private String faixa;
    private int idade;

    public Lutador() {
    }

    public Lutador(int matricula, int idade, String nome, String lutaDom, String faixa) {
        super(matricula, nome, lutaDom);
        this.faixa = faixa;
    }

    public String getFaixa() {
        return faixa;
    }

    public void setFaixa(String faixa) {
        this.faixa = faixa;
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
                "\nInforme o grau da faixa: " + faixa +
                "\nInforme sua idade: " + idade;
    }

}
