package questao1;

import java.util.*;

class Fila {
    private ArrayList<String> filaClientes;

    public Fila() {
        filaClientes = new ArrayList<String>();
    }

    public void adicionarCliente(String cliente) {
        filaClientes.add(cliente);
        System.out.println("Cliente " + cliente + " entrou na fila.");
    }

    public void atenderCliente() {
        if (!filaClientes.isEmpty()) {
            String clienteAtendido = filaClientes.remove(0);
            System.out.println("Atendendo cliente: " + clienteAtendido);
        } else {
            System.out.println("Não há clientes na fila.");
        }
    }

    public int tamanhoFila() {
        return filaClientes.size();
    }
}
