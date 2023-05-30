package questao3;

import java.util.*;

enum Prioridade {
    BAIXA,
    MÉDIA,
    ALTA
}

class Chamado {
    private int numeroChamado;
    private String descricao;
    private Prioridade prioridade;

    public Chamado(int numeroChamado, String descricao, Prioridade prioridade) {
        this.numeroChamado = numeroChamado;
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public int getNumeroChamado() {
        return numeroChamado;
    }

    public String getDescricao() {
        return descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }
}
