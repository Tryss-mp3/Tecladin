package estruturais.adapter;

public class PagamentoExterno {
    public void executarTransacaoPix(long valor) {
        System.out.println("Executando pagamento pix em centavos... " + valor);
    }
}
