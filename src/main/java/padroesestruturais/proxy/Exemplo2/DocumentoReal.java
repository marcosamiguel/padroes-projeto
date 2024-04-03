package padroesestruturais.proxy.Exemplo2;

public class DocumentoReal implements DocumentoInterface{
    private String nomeDoDocumento;

    public DocumentoReal(String nomeDoDocumento) {
        this.nomeDoDocumento = nomeDoDocumento;
        carregarDocumentoDoDisco(nomeDoDocumento);
    }

    @Override
    public void exibirDocumento() {
        System.out.println("Exibindo " + nomeDoDocumento);
    }

    private void carregarDocumentoDoDisco(String nomeDoDocumento) {
        System.out.println("Carregando " + nomeDoDocumento);
    }
}