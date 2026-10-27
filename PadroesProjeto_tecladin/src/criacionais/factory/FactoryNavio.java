package criacionais.factory;

public class FactoryNavio implements FactoryTransporte{
    public String imprimirRelatorioVistoria() {
        return "vistoria completa";
    }

    @Override
    public Transporte create() {
        imprimirRelatorioVistoria();
        return new Navio();
    }

    @Override
    public Transporte clone() {
        return null;
    }
}
