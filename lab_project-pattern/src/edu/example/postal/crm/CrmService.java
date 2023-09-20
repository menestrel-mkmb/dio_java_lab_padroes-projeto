package edu.example.postal.crm;

public class CrmService {

    private static CrmService instance;
    private CrmService() {
        super();
    }

    public CrmService getInstance() {
        if( instance == null ) instance = new CrmService();
        return instance;
    }
    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente " + nome + " salvo no sistema de CRM com endereço " + cep + " em " + cidade + " " + estado);
    }
}
