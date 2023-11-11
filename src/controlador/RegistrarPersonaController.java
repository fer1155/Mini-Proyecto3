package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Estudiante;
import vista.RegistrarPersonaView;
import modelo.RegistrarPersonaModel;

public class RegistrarPersonaController {
    
    private RegistrarPersonaView vista;
    private RegistrarPersonaModel modelo;

    public RegistrarPersonaController(RegistrarPersonaView vista, RegistrarPersonaModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
        this.vista.addBtonRegistrarListener(new registrar());
    }

    class registrar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Estudiante estudiante = new Estudiante(vista.getCajaDeTextoNombre(), "", "", "", "", "");
            modelo.registrar(estudiante);
        }
    }
}
