package core.Kenum.domain;

public enum TipoCliente {


    PESSOA_FISICA(1, "CPF"){
        @Override
        public void imprimir(){
            System.out.println("Pessoa FISICA");
        }
    },
    PESSOA_JURIDICA(2, "CNPJ"){
        @Override
        public void imprimir(){
            System.out.println("Pessoa JURÍDICA");
        }
    };

    public final int VALOR;
    public final String TIPO_DOCUMENTO;

    public void imprimir(){
        System.out.println("Dentro do imprimir");
    }

    TipoCliente(int valor, String tipoDocumento) {
        this.VALOR = valor;
        this.TIPO_DOCUMENTO = tipoDocumento;
    }
}
