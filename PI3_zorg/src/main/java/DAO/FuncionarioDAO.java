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
        String sql = "SELECT * FROM funcionario";
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
}