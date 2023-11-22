/*
Miniproyecto No. 3

Fernando Cardona - 2241381
Oscar Mario Muñoz - 2242481
Santiago Alzate   - 2242274

Grupo de FPOE: 80
*/
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
