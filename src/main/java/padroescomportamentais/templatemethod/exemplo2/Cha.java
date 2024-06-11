package padroescomportamentais.templatemethod.exemplo2;

public class Cha implements BebidaQuente {
    @Override
    public void adicionarIngredientePrincipal() {
        System.out.println("Adicionando o saquinho de chá...");
    }

    @Override
    public void adicionarCondimentos() {
        System.out.println("Adicionando limão...");
    }
}
