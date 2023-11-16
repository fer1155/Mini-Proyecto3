package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.EliminarPersonaModel;
import vista.EliminarPersonaView;

public class EliminarPersonaController {
    private EliminarPersonaView vista;
    private EliminarPersonaModel modelo;

    public EliminarPersonaController(EliminarPersonaView vista, EliminarPersonaModel modelo) {
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
