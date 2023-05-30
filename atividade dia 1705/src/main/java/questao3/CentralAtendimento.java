package questao3;

import java.util.*;

class CentralAtendimento {
    private List<Chamado> filaChamados;
    private List<Especialista> especialistas;

    public CentralAtendimento() {
        filaChamados = new ArrayList<>();
        especialistas = new ArrayList<>();
    }

    public void adicionarChamado(Chamado chamado) {
        filaChamados.add(chamado);
        System.out.println("Chamado " + chamado.getNumeroChamado() + " adicionado à fila.");
    }

    public void adicionarEspecialista(Especialista especialista) {
        especialistas.add(especialista);
    }

    public void atenderChamado() {
        if (!filaChamados.isEmpty()) {
            Chamado chamado = obterChamadoPrioritario();
            if (chamado == null) {
                chamado = filaChamados.get(0);
            }
            Especialista especialista = obterEspecialistaDisponivel(chamado.getAreaEspecialidade());
            if (especialista != null) {
                especialista.atenderChamado(chamado);
                filaChamados.remove(chamado);
            } else {
                System.out.println("Não há especialistas disponíveis no momento para atender o chamado " + chamado.getNumeroChamado());
            }
        } else {
            System.out.println("Não há chamados na fila.");
        }
    }

    private Chamado obterChamadoPrioritario() {
        for (Chamado chamado : filaChamados) {
            if (chamado.getPrioridade() == Prioridade.ALTA) {
                return chamado;
            }
        }
        return null;
    }

    private Especialista obterEspecialistaDisponivel(String areaEspecialidade) {
        for (Especialista especialista : especialistas) {
            if (especialista.getAreaEspecialidade().equals(areaEspecialidade)) {
                return especialista;
            }
        }
        return null;
    }
}
