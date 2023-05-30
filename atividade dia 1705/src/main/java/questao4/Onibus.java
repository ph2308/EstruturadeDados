package questao4;

import java.util.*;

class Onibus {
    private PontoOnibus pontoOnibus;
    private Timer timer;

    public Onibus(PontoOnibus pontoOnibus) {
        this.pontoOnibus = pontoOnibus;
        timer = new Timer();
    }

    public void iniciarViagem(int intervalo) {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                pontoOnibus.embarcar();
            }
        };

        timer.scheduleAtFixedRate(task, 0, intervalo);
    }

    public void pararViagem() {
        timer.cancel();
        System.out.println("A viagem do ônibus foi encerrada.");
    }
}
