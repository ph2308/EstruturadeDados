package questao2;


import java.util.*;

class CentralAtendimento {
    private List<Atendente> atendentes;
    private List<Cliente> filaClientes;

    public CentralAtendimento() {
        atendentes = new ArrayList<Atendente>();
        filaClientes = new ArrayList<Cliente>();
    }

    public void adicionarAtendente(Atendente atendente) {
        atendentes.add(atendente);
    }

    public void adicionarCliente(Cliente cliente) {
        filaClientes.add(cliente);
        System.out.println("Cliente " + cliente.getNome() + " entrou na fila.");
    }

    public void atenderChamada() {
        if (!filaClientes.isEmpty()) {
            Cliente cliente = obterClientePrioritario();
            if (cliente == null) {
                cliente = filaClientes.get(0);
            }
            Atendente atendente = obterAtendenteDisponivel();
            if (atendente != null) {
                atendente.atenderChamada(cliente);
                filaClientes.remove(cliente);
            } else {
                System.out.println("Não há atendentes disponíveis no momento. Cliente " + cliente.getNome() + " aguardará.");
            }
        } else {
            System.out.println("Não há clientes na fila.");
        }
    }

    private Cliente obterClientePrioritario() {
        for (Cliente cliente : filaClientes) {
            if (cliente.getPrioridade() == Prioridade.ALTA) {
                return cliente;
            }
        }
        return null;
    }

    private Atendente obterAtendenteDisponivel() {
        for (Atendente atendente : atendentes) {
            if (atendente.getChamadasAtendidas() < 5) { 
                return atendente;
            }
        }
        return null;
    }
}