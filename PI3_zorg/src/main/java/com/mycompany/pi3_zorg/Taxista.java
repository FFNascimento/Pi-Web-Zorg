package com.mycompany.pi3_zorg;

public class Taxista extends Funcionario{
    
    private int codTaxista;
    
    public Taxista(String nome, String sobrenome, String telefone, String matricula, int codTaxista) {
        super(nome, sobrenome, telefone, matricula);
        this.codTaxista = codTaxista;
    }
}
