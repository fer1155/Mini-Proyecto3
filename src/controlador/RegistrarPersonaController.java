package controlador;

import vista.RegistrarPersonaView;
import modelo.RegistrarPersonaModel;

public class RegistrarPersonaController {
    
    private RegistrarPersonaView vista;
    private RegistrarPersonaModel modelo;

    public RegistrarPersonaController(RegistrarPersonaView vista, RegistrarPersonaModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
    }
}
