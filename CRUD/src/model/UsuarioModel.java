package model;

import java.util.Scanner;

public class UsuarioModel{
    private int id;
    private String nome;
    private String email;
    private String senha;
    public UsuarioModel() {
        id=0;
        nome=new String();
        email=new String();
        senha=new String();
    }
    public UsuarioModel(int id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void cadastrar(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o id");
        id = ler.nextInt();
        System.out.println("Digite o nome");
        nome = ler.next();
        System.out.println("Digite o email");
        email = ler.next();
        System.out.println("Digite a senha");
        senha = ler.next();
    }
    @Override //sobrescrita
    public String toString(){
        return (id + " - "+nome.toUpperCase()+
        " >>> " + email.toLowerCase());
    }
}