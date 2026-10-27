package criacionais.abstractfactory.bradesco;

import criacionais.abstractfactory.Autentication;
import criacionais.abstractfactory.PixFactory;
import criacionais.abstractfactory.QRCodeGeneretor;
import criacionais.abstractfactory.Validator;

public class PixFactoryBradesco implements PixFactory {
    private Autentication autentication;
    private Validator validator;
    private QRCodeGeneretor qrCodeGeneretor;

    public PixFactoryBradesco() {
        this.autentication = new AutenticationBradesco();
        this.validator = new ValidatorBradesco();
        this.qrCodeGeneretor = new QRCodeGeneratorBradesco();
    }


    @Override
    public boolean execute() {
        if(!autentication.autenticated()) {
            System.out.println("Autenticação falhou");
            return false;
        }

        if(!validator.validate()) {
            System.out.println("Validação falhou");
            return false;
        }

        String qrCode = qrCodeGeneretor.execute();
        if(qrCode == null || qrCode.isEmpty()) {
            System.out.println("QRCode inválido");
            return false;
        }

        //code de geração de imagem do qrcode...
        return true;
    }
}
