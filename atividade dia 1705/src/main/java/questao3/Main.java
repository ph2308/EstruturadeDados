package questao3;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        CentralAtendimento central = new CentralAtendimento();

        Especialista especialista1 = new Especialista("João", "Redes");
        Especialista especialista2 = new Especialista("Maria", "Software");
        central.adicionarEspecialista(especialista1);
        central.adicionarEspecialista(especialista2);

        Chamado chamado1 = new Chamado(1, "Problema na conexão de internet", Prioridade.ALTA);
        Chamado chamado2 = new Chamado(2, "Erro no software X", Prioridade.BAIXA);

        central.adicionarChamado(chamado1);
        central.adicionarChamado(chamado2);

        central.atenderChamado();
        central.atenderChamado();
        central.atenderChamado();
    }
}
