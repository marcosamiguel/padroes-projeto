package padroescomportamentais.observer.exemplo2;

public class DisplayTemperatura implements Observer{

    private float temperatura;

    @Override
    public void atualizar(float temperatura) {
        this.temperatura = temperatura;
        exibir();
    }

    public void exibir() {
        System.out.println("Temperatura atual: " + temperatura + "°C");
    }
}
