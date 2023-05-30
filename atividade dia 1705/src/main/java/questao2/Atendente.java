package questao2;


import java.util.*;

class Atendente {
    private String nome;
    private int chamadasAtendidas;

    public Atendente(String nome) {
        this.nome = nome;
        this.chamadasAtendidas = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getChamadasAtendidas() {
        return chamadasAtendidas;
    }

    public void atenderChamada(Cliente cliente) {
        System.out.println("Atendente " + nome + " está atendendo o cliente " + cliente.getNome());
        chamadasAtendidas++;
    }
}
