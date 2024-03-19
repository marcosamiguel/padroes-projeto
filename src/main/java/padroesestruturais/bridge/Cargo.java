package padroesestruturais.bridge;

public abstract class Cargo {

    protected IEscolaridade escolaridade;

    protected float salarioBase;

    public Cargo(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setEscolaridade(IEscolaridade IEscolaridade) {
        this.escolaridade = IEscolaridade;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}
