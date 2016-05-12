package DAO;

import com.mycompany.pi3_zorg.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionarioDAO {
    
    private Connection con;
    
    public FuncionarioDAO(Connection con) {
        this.con = con;
    }
    
    public List<Funcionario> listarFuncionarios() {
        String sql = "SELECT * FROM FUNCIONARIO";
        List<Funcionario> listaFuncionario = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setNome("NOME");
                funcionario.setSobrenome("SOBRENOME");
                funcionario.setTelefone("TELEFONE");
                funcioario.setMatricula("MATRICULA");
                funcionario.setUsuario("USUARIO");
                listaFuncionario.add(funcionario);
            }
            return listaFuncionario;
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Não foi possível retornar uma lista contendo os funcionários");
        }
        
    }
    
    public boolean inserirFuncionario(Funcionario funcionario){
        String sql = "INSERT INTO funcionario (NOME_FUNCIONARIO, SOBRENOME_FUNCIONARIO, TELEFONE, MATRICULA, USUARIO) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getSobrenome());
            ps.setString(3, funcionario.getTelefone());
            ps.setString(5, funcionario.getUsuario());
            
            if (ps.executeUpdate() > 0){
                System.out.println("Funcioanrio inserido com sucesso!");
                return true;
            } else {
                System.out.println("Funcionario não inserido!");
            }
            ps.close();
        }catch(SQLException ex){
            System.out.println("Erro de SQL!");
        }
        
        return false;
    }
    
    public boolean desativarFuncionario(Funcionario funcionario){
        String sql = "UPDATE funcionario SET STATUS = 'D' WHERE MATRICULA = ?;";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, funcionario.getMatricula());
            
            if(ps.executeUpdate() > 0){
                System.out.println("Usuário desativado com sucesso!");
                return true;
            } else {
                System.out.println("Usuário não desativado!");
            }
        } catch(SQLException ex){
            System.out.println("Erro de SQL!");
        }
    }
    
    
    
}