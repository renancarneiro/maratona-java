package exercicios.poo.exercicio01.domain;

import org.example.exercicios.poo.exercicio01.domain.Professor;

public class Seminario {
    private String titulo;
    private int capacidade;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario(String titulo, int capacidade) {
        this.titulo = titulo;
        this.capacidade = capacidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void imprimeAlunos(){
       for(Aluno aluno: this.alunos){
           System.out.println("Nome: "+aluno.getNome());
           System.out.println("Idade: "+aluno.getIdade());
       }
    }

}
