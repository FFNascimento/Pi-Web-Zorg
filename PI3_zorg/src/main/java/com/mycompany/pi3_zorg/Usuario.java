package com.mycompany.pi3_zorg;

public class Usuario {
    
    private String login;
    private String senha;
    private String acesso;
    private int codUsuario;
    
    public Usuario(){
        
    }

    public Usuario(String login, String senha, String acesso) {
        this.login = login;
        this.senha = senha;
        this.acesso = acesso;
    }
    
    public String autenticar(String login, String senha){
        return this.acesso;
    }
    
    public boolean deslogar (){
        return false;
    }
    
    public boolean verificarPermissao(int codUsuario){
        return false;
    }
    
    
}
