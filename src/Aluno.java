import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

//Exercício 1 - Classes Java:
public class Aluno {
    private String nome;
    final public LocalDate dataNascimento;
    private Integer matricula;

    public Aluno(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Integer getMatricula() {
        return this.matricula;
    }

    public void setMatricula(Integer matriculaN) {
        this.matricula = matriculaN;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDataNascimentoFormatada() {
        return this.dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public int getIdade() {
        Period periodo = Period.between(this.dataNascimento, LocalDate.now());
        return periodo.getYears();
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String toString() {
        String nome = "Nome: " + this.nome + "\n";
        String identificacao = "Matricula: " + this.matricula + "\n";
        String dataNascimento = "Data nascimento: " + this.getDataNascimentoFormatada() + "\n";
        String idade = "Idade: " + this.getIdade() + "\n";

        return nome + identificacao + dataNascimento + idade;
    }

    //Exercício 4 - Comparação de objetos:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }
}
