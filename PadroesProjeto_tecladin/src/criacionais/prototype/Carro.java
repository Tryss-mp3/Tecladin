package criacionais.prototype;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    //modelo, cor, motor, acessórios
    private String modelo;
    private String cor;
    private String motor;
    private List<String> acessorios;
    private boolean automatico;
    private Categoria categoria;

    public Carro copiar() {
        Carro carro = new Carro();
        carro.modelo = this.modelo;
        carro.cor = this.cor;
        carro.motor = this.motor;
        carro.acessorios = new ArrayList<>();
        carro.automatico = this.automatico;
        Categoria categoria1 = new Categoria();
        categoria1.setNome(this.categoria.getNome());
        categoria1.setNivel(this.categoria.getNivel());

        carro.categoria = categoria1;

        return carro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public List<String> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(List<String> acessorios) {
        this.acessorios = acessorios;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", motor='" + motor + '\'' +
                ", acessorios=" + acessorios +
                ", automatico=" + automatico +
                ", categoria=" + categoria.getNome() +
                '}';
    }
}
