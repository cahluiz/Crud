package data;

import java.util.ArrayList;

import model.UsuarioModel;

public interface CRUD {
    public boolean incluir(UsuarioModel obj) throws Exception;
    public boolean excluir(int id) throws Exception;
    public boolean editar(UsuarioModel obj) throws Exception;
    public ArrayList<UsuarioModel> pesquisar(String pesquisa) throws Exception;
    public UsuarioModel obter(int id) throws Exception;
}
