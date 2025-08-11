package main.mapInterface.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();


        agendaContatos.adicionarContato("Camila", 002365);
        agendaContatos.adicionarContato("Camila", 4004859);
        agendaContatos.adicionarContato("Luiz", 152364);
        agendaContatos.adicionarContato("Carlos", 235014);
        agendaContatos.adicionarContato("Maria", 7856000);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Luiz");
        agendaContatos.exibirContatos();


        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Maria"));


    }
}
