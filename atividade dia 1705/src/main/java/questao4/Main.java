package questao4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PontoOnibus pontoOnibus = new PontoOnibus();

        Onibus onibus = new Onibus(pontoOnibus);

        Passageiro passageiro1 = new Passageiro("João");
        Passageiro passageiro2 = new Passageiro("Maria");
        Passageiro passageiro3 = new Passageiro("Pedro");

        pontoOnibus.entrarNaFila(passageiro1);
        pontoOnibus.entrarNaFila(passageiro2);
        pontoOnibus.entrarNaFila(passageiro3);

        onibus.iniciarViagem(2000); // Ônibus parte a cada 2 segundos

        // Simulação de tempo de espera
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pontoOnibus.entrarNaFila(new Passageiro("Ana"));

        // Simulação de tempo de espera
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        onibus.pararViagem();
    }
}
