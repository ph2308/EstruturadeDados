package questao3;

import java.util.*;

class Especialista {
    private String nome;
    private String areaEspecialidade;

    public Especialista(String nome, String areaEspecialidade) {
        this.nome = nome;
        this.areaEspecialidade = areaEspecialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getAreaEspecialidade() {
        return areaEspecialidade;
    }

    public void atenderChamado(Chamado chamado) {
        System.out.println("Especialista " + nome + " está atendendo o chamado " + chamado.getNumeroChamado() + " - " + chamado.getDescricao());
    }
}
