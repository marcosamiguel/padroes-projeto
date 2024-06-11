package padroescomportamentais.templatemethod.exemplo2;

public class Cafe implements BebidaQuente{
    @Override
    public void adicionarIngredientePrincipal() {
        System.out.println("Adicionando o pó de café...");
    }

    @Override
    public void adicionarCondimentos() {
        System.out.println("Adicionando açúcar e leite...");
    }
}
