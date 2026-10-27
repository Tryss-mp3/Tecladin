package estruturais.adapter_teclado;

public class TecladoAdap implements DispositivoUSB {
    private TecladoC tecladoC;

    public TecladoAdap(TecladoC tecladoC) {
        this.tecladoC = tecladoC;
    }

    @Override
    public void conectarUSB() {
        System.out.println("Erm... adaptando a conexão C para USB...");
        tecladoC.conectarEntradaC();
        System.out.println("O teclado foi conectado ao gabinete pela entrada USB!!! hehehe... legal.");
    }
}
