package questao4;

import java.util.*;

class PontoOnibus {
    private Queue<Passageiro> filaPassageiros;

    public PontoOnibus() {
        filaPassageiros = new LinkedList<>();
    }

    public void entrarNaFila(Passageiro passageiro) {
        filaPassageiros.add(passageiro);
        System.out.println("Passageiro " + passageiro.getNome() + " entrou na fila do ponto de ônibus.");
    }

    public void embarcar() {
        if (!filaPassageiros.isEmpty()) {
            Passageiro passageiro = filaPassageiros.poll();
            System.out.println("Passageiro " + passageiro.getNome() + " embarcou no ônibus.");
        } else {
            System.out.println("Não há passageiros na fila do ponto de ônibus.");
        }
    }
}
