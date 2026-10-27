package criacionais.abstractfactory.bradesco;

import criacionais.abstractfactory.QRCodeGeneretor;

public class QRCodeGeneratorBradesco implements QRCodeGeneretor {
    @Override
    public String execute() {
        System.out.println("Gerando qrcode");
        return "29840293kgçslkdgogjw-23eofjsdçlj30pdjsçdlf";
    }
}
