package estruturais.adapter;

public class PagamentoAdapter implements Pagamento{
    private PagamentoExterno pagamentoExterno;

    public PagamentoAdapter(PagamentoExterno pagamentoExterno) {
        this.pagamentoExterno = pagamentoExterno;
    }

    @Override
    public void pagar(double valor) {

        long valorCentavo = Math.round(valor * 100);
        pagamentoExterno.executarTransacaoPix(valorCentavo);

    }
}
