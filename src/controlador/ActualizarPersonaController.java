package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ActualizarPersonaModel;
import vista.ActualizarPersonaView;

public class ActualizarPersonaController {
    private ActualizarPersonaView vista;
    private ActualizarPersonaModel modelo;

    public ActualizarPersonaController(ActualizarPersonaView vista, ActualizarPersonaModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
        this.vista.addBtonCerrarListener(new acciones());
    }

    class acciones implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("Cerrar")){
                vista.dispose();
            }
        }
    }
}
