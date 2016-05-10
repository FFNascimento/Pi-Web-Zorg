package com.mycompany.pi3_zorg;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dateTime;
import java.util.GregorianCalendar;

public class Viagem {
    
    private int codViagem;
    private Endereco enderecoPartida;
    private Endereco enderecoDestino;
    private String nomeCliente;
    private String status;
    private GregorianCalendar inicioViagem;
    private GregorianCalendar fimViagem;
    
    public Viagem(int codViagem, String status, GregorianCalendar inicioViagem, GregorianCalendar fimViagem) {
        this.codViagem = codViagem;
        this.status = status;
        this.inicioViagem = inicioViagem;
        this.fimViagem = fimViagem;
    }
    
    public void agendarViagem(Endereco enderecoPartida, Endereco enderecoDestino, String nomeCliente) {
        this.enderecoPartida = enderecoPartida;
        this.enderecoDestino = enderecoDestino;
        this.nomeCliente = nomeCliente;
    }
    
    public void cancelarViagem(int codTaxista, int codViagem) {
        
    }

    public void finalizarViagem(int codTaxista, int codViagem) {
        
    }
    
    public Endereco getEndereco(){
        
    }
    
    public void setEndereco(String cep, String logadouro, int numero){
        
    }
}
