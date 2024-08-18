package exemples;

import java.util.List;
import java.util.ArrayList;

public class Usuarios {
    
    
    private List<Usuario> listaUsuarios;
    
    public Usuarios() {
        this.listaUsuarios = new ArrayList<>();
    }

    class Usuario{
        private String nome;
        private String senha;

        public Usuario (String nome , String senha){
           this.nome = nome;
           this.senha = senha;
        }

        public String getNome() {
            return nome;
        }

        public String getSenha() {
            return senha;
        }
    }

    void adicionarUsuario(String nome , String senha){
        this.listaUsuarios.add(new Usuario(nome ,senha));
        System.out.println("Usuario adicionado com sucesso! ");
    }

    void listarUsuarios(){
        if(!listaUsuarios.isEmpty()){
            System.err.println("\n Lista de Usuarios cadastrados \n");
            for(Usuario u : listaUsuarios) {
                System.err.printf(" - %s \n",u.getNome());
            }
        } else {
            System.out.println("\n A lista de cadastro está vazia \n");
        }
    }

}
