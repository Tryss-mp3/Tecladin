package estruturais.adapter;

public class Main {
    public static void main(String[] args) {

        VendaService service = new VendaService();
        PagamentoExterno externo = new PagamentoExterno();

        PagamentoAdapter adapter = new PagamentoAdapter(externo);
        service.realizarVenda(adapter, 10);

        PagamentoAvista pagamentoAvista = new PagamentoAvista();
        service.realizarVenda(pagamentoAvista, 10);

    }
}
