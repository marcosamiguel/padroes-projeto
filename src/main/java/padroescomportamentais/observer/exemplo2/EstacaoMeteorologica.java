package padroescomportamentais.observer.exemplo2;

import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica implements Subject {
    private List<Observer> observadores;
    private float temperatura;

    public EstacaoMeteorologica() {
        observadores = new ArrayList<>();
    }

    @Override
    public void adicionarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.atualizar(temperatura);
        }
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        notificarObservadores();
    }
}
