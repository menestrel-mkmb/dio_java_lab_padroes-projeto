package edu.example.facade;

import edu.example.postal.cep.CepApi;
import edu.example.postal.crm.CrmService;

public class Facade {
    private CepApi cepInst = CepApi.getInstance();
    public void migrarCliente(String nome, String cep) {
        CrmService.gravarCliente(nome, cep, cepInst.recuperarCidade(cep), cepInst.recuperarEstado(cep));
    }
}
