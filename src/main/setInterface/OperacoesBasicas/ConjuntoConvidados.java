package main.setInterface.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidade(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite)  {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidade("Convidado 1", 4562);
        conjuntoConvidados.adicionarConvidade("Convidado 2", 7425);
        conjuntoConvidados.adicionarConvidade("Convidado 3", 9658);
        conjuntoConvidados.adicionarConvidade("Convidado 4", 0650);
        conjuntoConvidados.adicionarConvidade("Convidado 5", 0000);
        conjuntoConvidados.adicionarConvidade("Convidado 6", 2079);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");


       conjuntoConvidados.removerConvidadoPorCodigoConvite(7425);
       System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

      conjuntoConvidados.exibirConvidados();
    }
}
