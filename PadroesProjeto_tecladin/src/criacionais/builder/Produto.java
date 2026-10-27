package criacionais.builder;

import java.security.InvalidParameterException;

public class Produto {

    private String nome;
    private String codigo;
    private String descricao;
    private double preco;
    private double custo;
    private int estoque;
    private String unidade;
    private boolean ativo;
    private String ncm;

    public Produto(Builder builder) {
        this.nome = builder.nome;
        this.descricao = builder.descricao;
        this.codigo = builder.codigo;
        this.preco = builder.preco;
        this.custo = builder.custo;
        this.estoque = builder.estoque;
        this.unidade = builder.unidade;
        this.ativo = builder.ativo;
        this.ncm = builder.ncm;
    }

    public static class Builder {

        private String nome;
        private String codigo;
        private String descricao;
        private double preco;
        private double custo;
        private int estoque;
        private String unidade;
        private boolean ativo;
        private String ncm;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder codigo(String codigo) {
            this.codigo = codigo;
            return this;
        }

        public Builder descricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Builder preco(double preco) {
            this.preco = preco;
            return this;
        }

        public Builder custo(double custo) {
            this.custo = custo;
            return this;
        }

        public Builder estoque(int estoque) {
            if(estoque < 0) {
                throw new InvalidParameterException("O valor do estoque deve ser maior ou igual a 0");
            }
            this.estoque = estoque;
            return this;
        }

        public Builder unidade(String unidade) {
            this.unidade = unidade;
            return this;
        }

        public Builder ativo(boolean ativo) {
            this.ativo = ativo;
            return this;
        }

        public Builder ncm(String ncm) {
            this.ncm = ncm;
            return this;
        }

        public Produto build() {
            if(codigo == null || codigo.isEmpty()) {
                throw new InvalidParameterException("O código é obrigatorio");
            }

            return new Produto(this);
        }
    }

}
