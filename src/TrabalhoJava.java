import java.time.LocalDate;
import java.util.*;

public class TrabalhoJava {

    public static void main(String[] args) {
        System.out.println("Exercício 2 - Listas dinâmicas:" + "\n");
        Aluno jonas = new Aluno("Jonas", LocalDate.of(2002, 2, 13));
        jonas.setMatricula(100);

        Aluno ana = new Aluno("Ana clara", LocalDate.of(2003, 3, 15));
        ana.setMatricula(101);

        Aluno alisson = new Aluno("Alisson", LocalDate.of(2004, 6, 15));
        alisson.setMatricula(102);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(jonas);
        alunos.add(ana);
        alunos.add(alisson);

        System.out.println("Tamanho da Lista: " + alunos.size() + "\n");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("Exercício 3 - Listas dinâmicas:");
        alunos.remove(jonas);
        alunos.remove(ana);

        System.out.println("Tamanho da Lista: " + alunos.size() + "\n");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("Exercício 5 - Conjuntos (Set):");
        Set<Aluno> setAlunos = new HashSet<>();

        Aluno irinieu = new Aluno("Irineu", LocalDate.now());
        irinieu.setMatricula(102);

        setAlunos.add(jonas);
        setAlunos.add(ana);
        setAlunos.add(alisson);
        setAlunos.add(irinieu);

        System.out.println("Tamanho do Set: " + setAlunos.size() + "\n");
        for (Aluno aluno : setAlunos) {
            System.out.println(aluno);
        }

        System.out.println("Exercício 6 - Conjuntos (Set)" + "\n");
        Set<Aluno> setAlunos1 = new HashSet<>();
        Set<Aluno> setAlunos2 = new HashSet<>();
        Aluno alberto = new Aluno("Alberto", LocalDate.of(1992, 12, 25));
        alberto.setMatricula(103);

        setAlunos1.add(jonas);
        setAlunos1.add(ana);
        setAlunos2.add(alberto);
        setAlunos2.add(ana);

        setAlunos1.addAll(setAlunos2);

        System.out.println("Tamanho do Set 1: " + setAlunos1.size() + "\n");
        for (Aluno aluno : setAlunos1) {
            System.out.println(aluno);
        }

        System.out.println("Exercício 7 - Filas (LinkedList):\n");
        Queue<Aluno> filaAlunos = new LinkedList<>();

        filaAlunos.offer(alisson);
        filaAlunos.offer(jonas);
        filaAlunos.offer(ana);

        Aluno primeiroAluno = filaAlunos.poll();
        System.out.println("Primeiro aluno da fila: \n" + primeiroAluno + "\n");

        System.out.println("Exercício 8 - Filas (LinkedList):\n");
        Queue<Aluno> novaFila = new LinkedList<>();

        novaFila.offer(alisson);
        novaFila.offer(alberto);
        novaFila.offer(ana);

        while(!novaFila.isEmpty()) {
            Aluno ultimoAluno = novaFila.poll();
            if(novaFila.isEmpty()) {
                System.out.println("Ultimo aluno da fila: \n" + ultimoAluno + "\n");
            }
        }

        System.out.println("Exercício 9 - Pilhas (Stack):\n");
        Stack<Aluno> pilhaAlunos = new Stack<>();

        Aluno juscilino = new Aluno("Juscilino", LocalDate.of(1889, 11, 13));
        juscilino.setMatricula(105);

        pilhaAlunos.push(juscilino);
        pilhaAlunos.push(alisson);
        pilhaAlunos.push(ana);

        Aluno primeiroAlunoPilha = pilhaAlunos.pop();
        System.out.println("Primeiro aluno da pilha: \n" + primeiroAlunoPilha + "\n");

        System.out.println("Exercício 10 - Pilhas (Stack):\n");
        Stack<Aluno> novaPilha = new Stack<>();

        novaPilha.push(alisson);
        novaPilha.push(ana);
        novaPilha.push(juscilino);

        while(!novaPilha.isEmpty()) {
            Aluno ultimoAlunoPilha = novaPilha.pop();
            if(novaPilha.isEmpty()) {
                System.out.println("Ultimo aluno da pilha: \n" + ultimoAlunoPilha + "\n");
            }
        }

    }

}
