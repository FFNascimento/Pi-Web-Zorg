/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pi3_zorg;

/**
 *
 * @author gabriel.gfamaral
 */
public class Gerente extends Funcionario{
    
    private int codGerente;
    
    public Gerente(String nome, String sobrenome, String telefone, String matricula, int codGerente) {
        super(nome, sobrenome, telefone, matricula);
        this.codGerente = codGerente;
    }
}
