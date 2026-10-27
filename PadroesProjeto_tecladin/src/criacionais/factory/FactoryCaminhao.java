package criacionais.factory;

public class FactoryCaminhao implements FactoryTransporte{
    public String emitirAvisoViagem() {
        return "Iniciando viagem";
    }

    @Override
    public Transporte create() {
        emitirAvisoViagem();
        return new Caminhao();
    }

    @Override
    public Transporte clone() {
        return null;
    }
}
