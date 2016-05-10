/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pi3_zorg;

import DAO.FuncionarioDAO;

/**
 *
 * @author gabriel.gfamaral
 */
public class Funcionario {
    
    private String nome;
    private String sobrenome;
    private String telefone;
    private String matricula;
    private Usuario usuario;

    public Funcionario(String nome, String sobrenome, String telefone, String matricula) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public Usuario getUsuario(){
        return usuario;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
    
}
