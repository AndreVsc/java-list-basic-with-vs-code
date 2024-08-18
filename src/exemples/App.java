package exemples;

public class App {
    public static void main(String[] args) {

        Usuarios dadosUsuarios = new Usuarios();
        Mensagens dadosMensagens = new Mensagens();
        Perfils dadosPerfils = new Perfils();
        
        // Lista
        
        dadosUsuarios.adicionarUsuario("Eduarda","123544");
        dadosUsuarios.adicionarUsuario("Mario","123455");
        dadosUsuarios.adicionarUsuario("Lohan","123545");
        dadosUsuarios.adicionarUsuario("Enrick","123555");
        
        dadosUsuarios.listarUsuarios();
        // Set

        dadosMensagens.adicionarMensagem("Oi","12:23","1");
        dadosMensagens.adicionarMensagem("Tudo bem","12:32","1");
        dadosMensagens.adicionarMensagem("Como vai?","12:42","2");

        dadosMensagens.listarMensagem();
        // Map

        dadosPerfils.adicionarPerfil(1, true , 17 ,1.85);
        dadosPerfils.adicionarPerfil(2, false , 20 ,1.75);
        dadosPerfils.adicionarPerfil(3, true , 18 ,1.79);
        dadosPerfils.adicionarPerfil(1, true , 14 ,1.65); //Sombrepõe 

        dadosPerfils.excluirPerfil(3);

        dadosPerfils.listarPerfils();

        dadosPerfils.pesquisarPerfil(2);
        
    }
}