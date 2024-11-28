import java.util.ArrayList;
import java.util.Scanner;

import data.UsuarioData;
import model.UsuarioModel;

public class App {
    static ArrayList<UsuarioModel> listaUsuarios = new ArrayList<>();

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao=0;
        UsuarioModel obj = new UsuarioModel();

        
        try {
            //UsuarioData DAO = new UsuarioData();
            do {
               System.out.println("Menu:"+
               "\n1 - Cadastrar Usuário"+
               "\n2 - Excluir Usuário"+
               "\n3 - Editar Usuário"+
               "\n4 - Listar Usuários cadastrados"+
               "\n5- Login -Email - Senha"+
               "\n10 - Sair"); 
               opcao = ler.nextInt();
               switch (opcao) {
                case 1:
                    obj = new UsuarioModel();
                    obj.cadastrar();
                    listaUsuarios.add(obj);//retirar depois
                    // if(DAO.incluir(obj))
                    //     System.out.println("Salvo com sucesso.");
                    // else
                    //     System.out.println("Erro ao salvar");
                    break;
                
                case 2:
                    // Listar os usuários 
                    listarUsuarios();
                    // pedir nome ou id (de quem eu quero excluir)
                    System.out.println("Digite o nome:");
                    String nome = ler.next();
                    for (int i=0;i<listaUsuarios.size();i++){
                        UsuarioModel u = listaUsuarios.get(i);
                        //encotrar o usuário
                        if(u.getNome().equalsIgnoreCase(nome)){
                            System.out.println(u); // Mostrar o resgistro
                            u.cadastrar();
                            listaUsuarios.remove(u); // remover da lista
                            break;
                        }
                    }
                    //remover da lista
                break;

                case 4:
                    listarUsuarios();
                    break;

                default:
                    break;
                }
               
            } while (opcao!=10);
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("Erro:" + e.getMessage());
            e.printStackTrace();
        }
    
    }
    private static void listarUsuarios(){
        System.out.println("-------- Usuários cadastrados -------");
        for (UsuarioModel u: listaUsuarios){
            System.out.println(u);// usa o método toString() <- object
        }
    }
    
}
