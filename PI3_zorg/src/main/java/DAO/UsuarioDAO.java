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

public class UsuarioDAO {
    
    private Connection con;
    
    public UsuarioDAO(Connection con) {
        this.con = con;
    }
    
    public List<Usuario> listarUsuarios() {
        String sql = "SELECT * FROM usuario";
        List<Usuario> usuario = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível retornar uma lista contendo os usuarios");
        }
        return usuario;
    }
}