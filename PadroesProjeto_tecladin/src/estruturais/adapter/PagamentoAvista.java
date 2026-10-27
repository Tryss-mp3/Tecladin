package estruturais.adapter;

public class PagamentoAvista implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando a vista: " + valor);
    }
}
