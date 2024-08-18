package exemples;

import java.util.HashSet;
import java.util.Set;

public class Mensagens {
    
    private Set<Mensagem> setMensagens;
    
    public Mensagens(){
        this.setMensagens = new HashSet<>();
    }

    public void listarMensagem(){
        System.err.println("\n\nTodas as mensagens \n");
        if(!setMensagens.isEmpty()){
            for(Mensagem mensagemData : setMensagens){
                System.err.println("\n - "+mensagemData.mensagem);
            }
        }
    }
    
    public void adicionarMensagem(String mensagem, String hora, String idUsuario){
        setMensagens.add(new Mensagem( mensagem , hora, idUsuario));
    }
    
    class Mensagem{
        private String mensagem;
        private String hora;
        private String idUsuario;
        
        public Mensagem(String mensagem, String hora, String idUsuario){
            this.idUsuario = idUsuario;
            this.mensagem = mensagem;
            this.hora = hora;
            
        }
        
        public String getHora() {
            return hora;
        }
            
        public String getIdUsuario() {
            return idUsuario;
        }
            
        public String getMensagem() {
            return mensagem;
        }
    }
}
