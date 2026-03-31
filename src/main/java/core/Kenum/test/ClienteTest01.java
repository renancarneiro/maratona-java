package core.Kenum.test;

import core.Kenum.domain.Cliente;
import core.Kenum.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente 1", Cliente.TipoPagamento.CREDITO, TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Cliente 2", Cliente.TipoPagamento.DEBITO, TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Cliente 3", Cliente.TipoPagamento.CREDITO, TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("Cliente 4", Cliente.TipoPagamento.DEBITO, TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
