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
public class Ceo extends Funcionario{
    
    private int codCeo;
    
    public Ceo(String nome, String sobrenome, String telefone, String matricula, int codCeo) {
        super(nome, sobrenome, telefone, matricula);
        this.codCeo = codCeo;
    }
}