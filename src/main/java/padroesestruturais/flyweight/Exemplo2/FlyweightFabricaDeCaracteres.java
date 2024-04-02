package padroesestruturais.flyweight.Exemplo2;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFabricaDeCaracteres {

    private final Map<String, CaractereFlyweight> caracteres = new HashMap<>();

    public CaractereFlyweight obterCaractere(char valor, String fonte, int tamanho, boolean negrito, boolean italico) {
        String chave = "" + valor + fonte + tamanho + negrito + italico;
        CaractereFlyweight caractere = caracteres.get(chave);
        if (caractere == null) {
            caractere = new Caractere(valor, fonte, tamanho, negrito, italico);
            caracteres.put(chave, caractere);
        }
        return caractere;
    }
}
