package estruturais.adapter_teclado;

public class Main {
    public static void main(String[] args) {
        TecladoC teclado = new TecladoC();
        TecladoAdap adapter = new TecladoAdap(teclado);
        Gabinete gabinete = new Gabinete();

        gabinete.conectarDispositivo(adapter);
    }
}
