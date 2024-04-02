package padroesestruturais.facade;

public class Secretaria extends Setor {

    private static Secretaria secretaria;

    private Secretaria() {
    }

    ;

    public static Secretaria getInstancia() {
        if (secretaria == null){
            secretaria = new Secretaria();
        }
        return secretaria;
    }

}
