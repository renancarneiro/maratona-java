package core.metodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

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
