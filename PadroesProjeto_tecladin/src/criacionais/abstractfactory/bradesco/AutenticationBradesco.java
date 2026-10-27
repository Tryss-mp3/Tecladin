package criacionais.abstractfactory.bradesco;

import criacionais.abstractfactory.Autentication;

public class AutenticationBradesco implements Autentication {
    @Override
    public boolean autenticated() {
        System.out.println("Usuário bradesco autenticado");
        return true;
    }
}
