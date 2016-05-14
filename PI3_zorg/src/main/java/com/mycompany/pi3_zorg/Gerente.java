package com.mycompany.pi3_zorg;

public class Gerente extends Funcionario{
    
    private int codGerente;
    
    public Gerente(String nome, String sobrenome, String telefone, String matricula, int codGerente) {
        super(nome, sobrenome, telefone, matricula);
        this.codGerente = codGerente;
    }
}
