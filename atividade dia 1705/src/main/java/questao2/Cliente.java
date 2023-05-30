package questao2;



enum Prioridade {
    NORMAL,
    ALTA
}

class Cliente {
    private String nome;
    private Prioridade prioridade;

    public Cliente(String nome, Prioridade prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }
}