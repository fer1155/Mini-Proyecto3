package miniproyecto3pkg;

import controlador.PrincipalController;
import modelo.PrincipalModel;
import vista.PrincipalView;

public class Main {
    public static void main(String[] args) {
        PrincipalView vistaPrincipal = new PrincipalView();
        PrincipalModel modeloPrincipal = new PrincipalModel();
        PrincipalController controladorPrincipal = new PrincipalController(vistaPrincipal, modeloPrincipal);
    }
}
