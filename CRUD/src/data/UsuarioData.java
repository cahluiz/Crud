package data;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import model.UsuarioModel;

public class UsuarioData extends Conexao implements CRUD {

    public UsuarioData() throws ClassNotFoundException, SQLException {
        super();
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean incluir(UsuarioModel obj) throws Exception {
        String sql="insert into tbUsuarios (nome,email,senha) values (?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getNome());
        ps.setString(2, obj.getEmail());
        ps.setString(3, obj.getSenha());
        if(ps.executeUpdate()>0) return true; 
        else return false;
    }

    @Override
    public boolean excluir(int id) throws Exception {
        String sql="delete from tbUsuarios where id=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,id);
        if(ps.executeUpdate()>0) return true; 
        else return false;
    }

    @Override
    public boolean editar(UsuarioModel obj) throws Exception {
        String sql="update tbUsuarios set nome=?,email=?,senha=? where id=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getNome());
        ps.setString(2, obj.getEmail());
        ps.setString(3, obj.getSenha());
        ps.setInt(4,obj.getId());
        if(ps.executeUpdate()>0) return true; 
        else return false;
    }

    @Override
    public ArrayList<UsuarioModel> pesquisar(String pesquisa) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pesquisar'");
    }

    @Override
    public UsuarioModel obter(int id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obter'");
    }
    
}
