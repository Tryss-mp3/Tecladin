package criacionais.singlenton;

public class Cliente {

    void initConexaoBanco() {
        ConexaoBanco instance = ConexaoBanco.getInstance();

    }
}
