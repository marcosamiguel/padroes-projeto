package padroescomportamentais.observer.exemplo2;

public class DisplayTemperatura implements Observer{

    private float temperatura;

    private String nome;

    @Override
    public void atualizar(float temperatura) {
        this.temperatura = temperatura;
        exibir();
    }

    public void exibir() {
        System.out.println("Temperatura atual do Display: " + this.nome + " :" + temperatura + "°C");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
