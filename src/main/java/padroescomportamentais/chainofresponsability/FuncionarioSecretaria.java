package padroescomportamentais.chainofresponsability;

public class FuncionarioSecretaria extends Funcionario {

    public FuncionarioSecretaria(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoHistorico.getTipoDocumentoHistorico());
        listaDocumentos.add(TipoDocumentoDiploma.getTipoDocumentoDiploma());

        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Secretaria";
    }

}
