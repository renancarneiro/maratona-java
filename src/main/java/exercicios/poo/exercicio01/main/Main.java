package exercicios.poo.exercicio01.main;

import exercicios.poo.exercicio01.domain.Aluno;
import exercicios.poo.exercicio01.domain.Local;
import exercicios.poo.exercicio01.domain.Seminario;
import org.example.exercicios.poo.exercicio01.domain.Professor;

import java.util.Scanner;

/***
 Crie um sistema que gerencie seminários
 O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado.

 um aluno poderá estar em apenas um seminário
 um seminário poderá ter nenhum ou vários alunos
 um professor poderá ministrar vários seminários
 um seminário deve ter um local

 Campos básicos (excluindo relacionamento)
 seminário: título
 aluno: nome, idade
 professor: nome, especialidade
 local: endereço
 */
public class Main {

    public static void main(String[] args) {
        int contadorCadastro = 0;
        Seminario[] seminariosCadastrados = new Seminario[999999999];
        System.out.println("SISTEMA DE GERENCIAMENTO DE SEMINÁRIOS");
        Scanner input = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("====== MENU PRINCIPAL ======");
            System.out.println("1 - LISTAR SEMINÁRIOS");
            System.out.println("2 - CADASTRAR SEMINÁRIO");
            System.out.println("3 - EXCLUIR SEMINÁRIO");
            System.out.println("0 - SAIR DO SISTEMA");
            System.out.println("Digite o número da opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    listarSeminarios(seminariosCadastrados, contadorCadastro);
                    break;
                case 2:
                    seminariosCadastrados[contadorCadastro] = cadastrarSeminario();
                    contadorCadastro++;
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        } while (opcao != 0);
    }

    public static Seminario cadastrarSeminario() {
        //Cadastro de seminario
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o título do seminário");
        String titulo = input.nextLine();

        System.out.println("Digite o limite máximo de pessoas");
        int capacidade = input.nextInt();

        Seminario seminario = new Seminario(titulo, capacidade);

        //Cadastro de local
        System.out.println("Digite o endereço do local");
        String endereco = input.nextLine();

        seminario.setLocal(new Local(endereco));
        input.nextLine();

        //Cadastro de professor

        System.out.println("Digite o nome do professor responsável:");
        String nome = input.nextLine();

        System.out.println("Digite a especialidade do professor: ");
        String especialidade = input.nextLine();

        Professor professor = new Professor(nome, especialidade);

        seminario.setProfessor(professor);

        //Cadastro de aluno

        System.out.println("Digite a quantidade de alunos a serem cadastrados");
        int qntdAlunos = input.nextInt();

        Aluno[] alunos = new Aluno[qntdAlunos];

        for(int i=0; i<alunos.length; i++){
            System.out.println("Digite o nome do aluno:");
            String nomeAluno = input.next();

            System.out.println("Digite a idade do aluno:");
            int idadeAluno = input.nextInt();
            Aluno aluno = new Aluno(nomeAluno,idadeAluno);
            alunos[i] = aluno;
        }

        seminario.setAlunos(alunos);

        System.out.println("Cadastro finalizado com sucesso: ");

        return seminario;
    }


    public static void listarSeminarios(Seminario[] seminarios, int contadorCadastro){

        for(int i=0;i<contadorCadastro; i++){
            System.out.println("======= LISTA DE SEMINÁRIOS CADASTRADOS =======");
            System.out.println("Titulo: "+seminarios[i].getTitulo());
            System.out.println("Capacidade ocupação: "+seminarios[i].getCapacidade());
            System.out.println("Local: "+seminarios[i].getLocal().getEndereco());
            seminarios[i].imprimeAlunos();
            System.out.println("Professor: "+seminarios[i].getProfessor().getNome());
            System.out.println("Especialidade professor: "+seminarios[i].getProfessor().getEspecialidade());
        }
    }


}
