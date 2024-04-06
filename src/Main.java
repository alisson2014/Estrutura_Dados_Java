import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.of(1999, 3, 12);
        Aluno joao = new Aluno("João", dataNascimento);
        joao.setMatricula(1);
        System.out.println(joao);
    }
}