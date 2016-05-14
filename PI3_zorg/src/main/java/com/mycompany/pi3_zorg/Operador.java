package com.mycompany.pi3_zorg;

public class Operador extends Funcionario{
    
    private int codOperador;
    
    public Operador(String nome, String sobrenome, String telefone, String matricula, int codOperador) {
        super(nome, sobrenome, telefone, matricula);
        this.codOperador = codOperador;
    }
}
