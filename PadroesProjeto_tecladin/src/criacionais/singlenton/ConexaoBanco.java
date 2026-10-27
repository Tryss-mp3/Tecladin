package criacionais.singlenton;

public class ConexaoBanco {//criacionais.singlenton.LogService
    private static ConexaoBanco INSTANCE;
    private ConexaoBanco() {
        System.out.println("Abrindo conexão com o banco...");
    }
    public static ConexaoBanco getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ConexaoBanco();
        }
        return INSTANCE;
    }
    //registrarLog(String log)
}
