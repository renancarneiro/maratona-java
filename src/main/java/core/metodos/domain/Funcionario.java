package core.metodos.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public void imprimirDados() {
        if (salario == null) return;
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for (int i = 0; i < salario.length; i++) {
            System.out.println("Salário " + (i + 1) + ": " + salario[i]);

        }
    }

    public void imprimirMediaSalario() {
        double media = 0;
        if (this.salario == null) return;

        for (double salarios : this.salario) {
            media += salarios;
        }
        media /= salario.length;
        String formatSalario = String.format("%.2f", media);
        System.out.println("Média do salário é: " + formatSalario);
    }
}
