package criacionais.factory;

public class Caminhao implements Transporte {
    @Override
    public void executar() {
        System.out.println("Executando transporte caminhão...");
    }
}
