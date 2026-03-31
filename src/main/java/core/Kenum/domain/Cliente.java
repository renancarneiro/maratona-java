package core.Kenum.domain;

public class Cliente {
    public enum TipoPagamento{
        CREDITO,
        DEBITO
    }

    private String nome;
    private TipoPagamento tipoPagamento;
    private TipoCliente tipoCliente;

    public Cliente(String nome, TipoPagamento tipoPagamento, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoPagamento = tipoPagamento;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoDocumento=" + tipoCliente.TIPO_DOCUMENTO +
                ", tipoInt=" + tipoCliente.VALOR +
                '}';
    }

}
