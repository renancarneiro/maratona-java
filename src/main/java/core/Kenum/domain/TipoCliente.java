package core.Kenum.domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "CPF"),
    PESSOA_JURIDICA(2, "CNPJ");

    public final int VALOR;
    public final String TIPO_DOCUMENTO;

    TipoCliente(int valor, String tipoDocumento) {
        this.VALOR = valor;
        this.TIPO_DOCUMENTO = tipoDocumento;
    }
}
