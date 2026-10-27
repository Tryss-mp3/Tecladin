package criacionais.prototype;

public class Categoria {
    private String nome;
    private String nivel;

    public Categoria(String nome, String nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public Categoria() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
