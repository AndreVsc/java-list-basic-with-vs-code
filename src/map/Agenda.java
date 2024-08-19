package map;

import java.util.Map;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.TreeMap;

public class Agenda {

    private Map<LocalDate , Evento> mapAgendas;

    public Agenda(){
        this.mapAgendas = new HashMap<>();
    }

    void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        mapAgendas.put(data, evento);
    
    }

    void ordenarEventos(){
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(mapAgendas);
        System.out.println(eventosOrdenados);
    }
    
    void proximoEvento(){
        LocalDate dataAtual = LocalDate.now();
         for(Map.Entry<LocalDate, Evento> entry: mapAgendas.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento correra em "+ entry.getKey() +". Evento : "+ entry.getValue().getAtracao());
                break;
            }
         }
    }

    public static void main(String[] args) {
        Agenda agendaEventos = new Agenda();

        agendaEventos.adicionarEvento(LocalDate.of(2025,7,17),"Andre","Codar");
        agendaEventos.adicionarEvento(LocalDate.of(2026,9,14),"Circo","Espetaculo");
        agendaEventos.adicionarEvento(LocalDate.of(2025,12,27),"Faculdade","Formatura");

        agendaEventos.ordenarEventos();

        agendaEventos.proximoEvento();
    }
}