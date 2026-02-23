package introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 15000000000000000F;
        long bigNumber = 10000000;
        double salaryDouble = 1500;
        float salaryFloat = 2500;
        byte ageByte = -128;
        char caractere = '\u0041'; //ASCII
        short ageShort = 10;
        boolean isAdmin = true;
        String descricao = "aqui tem um texto grande";

/*
    Prática
    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
    Eu <nome>, morando no endereço <endereco>,
    confirmo que recebi o salário de <salário>, na data <data>
 */

        String nome = "Renan";
        String endereco = "Travessa nome da rua";
        double salario = 1500.00;
        String dtRecebidoEm = "10/03/2025";

        System.out.println("Eu: " + nome + ", morando no endereço "
                + endereco + " confirmo que recebi o salário de "
                + salario + " na data "+dtRecebidoEm);
    }
}
