package padroesestruturais.adapter.novo;

public class AdaptadorMotorDeCarro implements Motor{

    private MotorDeCarro motorDeCarro;

    public AdaptadorMotorDeCarro(MotorDeCarro motorDeCarro) {
        this.motorDeCarro = motorDeCarro;
    }

    @Override
    public void ligar() {
        motorDeCarro.iniciar();
    }

    @Override
    public void desligar() {
        motorDeCarro.parar();
    }

}
