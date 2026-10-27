package criacionais.builder;

public class ProdutoBasico {
    public Produto criar() {
        return new Produto.Builder()
                .nome("Produto basico")
                .codigo("7891123823")
                .estoque(0)
                .ativo(true)
                .build();
    }
}
