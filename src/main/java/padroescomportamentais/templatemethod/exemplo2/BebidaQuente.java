package padroescomportamentais.templatemethod.exemplo2;

public interface BebidaQuente {
    public default void prepararReceita() {
        ferverAgua();
        adicionarIngredientePrincipal();
        adicionarCondimentos();
        servir();
    }

    public void adicionarIngredientePrincipal();

    public void adicionarCondimentos();

    private void ferverAgua() {
        System.out.println("Fervendo água...");
    }

    private void servir() {
        System.out.println("Servindo a bebida...");
    }
}