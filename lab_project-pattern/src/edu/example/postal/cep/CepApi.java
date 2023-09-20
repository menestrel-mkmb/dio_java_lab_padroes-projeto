package edu.example.postal.cep;

public class CepApi {
    private static CepApi instancia;

    private CepApi(){
        super();
    }

    public static CepApi getInstance() {
        if( instancia == null ) instancia = new CepApi();
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "cidade";
    }

    public String recuperarEstado(String cep) {
        return "estado";
    }
}
