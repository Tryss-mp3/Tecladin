package criacionais;

import criacionais.prototype.Carro;
import criacionais.prototype.Categoria;

import java.util.Arrays;

public class MainPrototype {
    public static void main(String[] args) {
        Categoria categoria = new Categoria();
        categoria.setNome("Esportivo");
        categoria.setNivel("3");

        Carro carro = new Carro();
        carro.setAcessorios(Arrays.asList("banco de couro", "painel touch"));
        carro.setAutomatico(true);
        carro.setCor("Prata");
        carro.setModelo("Fiat");
        carro.setMotor("2.0");
        carro.setCategoria(categoria);

        Categoria novaCategoria = new Categoria();
        novaCategoria.setNome("Comum");
        novaCategoria.setNivel("1");

        Carro clonado = carro.copiar();
        clonado.setMotor("1.2");
        clonado.getCategoria().setNome("Modificado");

        System.out.println(carro);
        System.out.println(clonado);


    }
}
