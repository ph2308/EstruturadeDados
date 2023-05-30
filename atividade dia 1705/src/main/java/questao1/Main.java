package questao1;


public class Main {
    public static void main(String[] args) {
        Fila filaClientes = new Fila();

        filaClientes.adicionarCliente("João");
        filaClientes.adicionarCliente("Maria");
        filaClientes.adicionarCliente("Pedro");

        System.out.println("Tamanho da fila: " + filaClientes.tamanhoFila());

        filaClientes.atenderCliente();
        filaClientes.atenderCliente();
        filaClientes.atenderCliente();

        System.out.println("Tamanho da fila: " + filaClientes.tamanhoFila());
    }
}