package padroesestruturais.adapter;

public class Aluno {

    IAvaliacao avaliacao;
    AvaliacaoAdapter adaptador;

    public Aluno() {
        avaliacao = new AvaliacaoConceito();
        adaptador = new AvaliacaoAdapter(avaliacao);
    }

    public void setAvaliacao(String conceito) {
        avaliacao.setAvaliacao(conceito);
        adaptador.salvarAvaliacao();
    }

    public String getAvaliacao() {
        return adaptador.recuperarAvaliacao();
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do adaptador
    public float getNota() {
        return adaptador.getNota();
    }

}
