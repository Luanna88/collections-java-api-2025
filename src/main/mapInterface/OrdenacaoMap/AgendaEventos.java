package main.mapInterface.OrdenacaoMap;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate date, String nome, String descricao) {
        Evento evento = new Evento (nome, descricao);
        eventosMap.put(date, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
       LocalDate dataAtual = LocalDate.now();
       Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
       for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
           if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
               System.out.println("O próximo evemto: " + entry.getValue() + " acontecerá na data: " + entry.getKey());
               break;
           }
       }
    }

    public static void main(String[] args) {
        AgendaEventos  agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY,15), "Evento 01","Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7,9), "Evento 02","Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JANUARY,10), "Evento 03","Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.AUGUST,12), "Evento 04","Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.AUGUST,13), "Evento 05","Atração 5");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.SEPTEMBER,22), "Evento 06","Atração 6");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }
}
