package padroesestruturais.proxy;

import org.junit.jupiter.api.Test;
import padroesestruturais.proxy.Exemplo2.DocumentoInterface;
import padroesestruturais.proxy.Exemplo2.ProxyDocumento;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DocumentoTest {


    @Test
    public void testarDocumento(){

        DocumentoInterface documento = new ProxyDocumento("RelatorioAnual.pdf", false);
        documento.exibirDocumento(); // Acesso negado

        DocumentoInterface documentoPermitido = new ProxyDocumento("RelatorioAnual.pdf", true);
        documentoPermitido.exibirDocumento(); // Carrega e exibe o documento

        assertNotNull(documentoPermitido);
    }

}
