package questao2;


public class Main {
    public static void main(String[] args) {
        CentralAtendimento central = new CentralAtendimento();

        Atendente atendente1 = new Atendente("João");
        Atendente atendente2 = new Atendente("Maria");
        central.adicionarAtendente(atendente1);
        central.adicionarAtendente(atendente2);

        Cliente cliente1 = new Cliente("Ana", Prioridade.NORMAL);
        Cliente cliente2 = new Cliente("Pedro", Prioridade.ALTA);

        central.adicionarCliente(cliente1);
        central.adicionarCliente(cliente2);

        central.atenderChamada();
        central.atenderChamada();
        central.atenderChamada();
    }
}