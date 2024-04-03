package padroesestruturais.proxy.Exemplo2;

public class ProxyDocumento implements DocumentoInterface{
    private DocumentoReal documentoReal;
    private String nomeDoDocumento;
    private boolean acessoPermitido;

    public ProxyDocumento(String nomeDoDocumento, boolean acessoPermitido) {
        this.nomeDoDocumento = nomeDoDocumento;
        this.acessoPermitido = acessoPermitido;
    }

    @Override
    public void exibirDocumento() {
        if (acessoPermitido) {
            if (documentoReal == null) {
                documentoReal = new DocumentoReal(nomeDoDocumento);
            }
            documentoReal.exibirDocumento();
        } else {
            System.out.println("Acesso negado ao documento " + nomeDoDocumento);
        }
    }
}
