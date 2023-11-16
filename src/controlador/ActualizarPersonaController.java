package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.ActualizarPersonaModel;
import modelo.Persona;
import vista.ActualizarPersonaView;

public class ActualizarPersonaController {
    private ActualizarPersonaView vista;
    private ActualizarPersonaModel modelo;

    public ActualizarPersonaController(ActualizarPersonaView vista, ActualizarPersonaModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
        this.vista.addBtonCerrarListenerV1(new acciones());
        this.vista.addBtonBuscarListenerV1(new acciones());
    }

    class acciones implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("Cerrar")){
                vista.dispose();
            }
            if(e.getActionCommand().equalsIgnoreCase("Buscar")){
                Persona personaBuscada = modelo.getPersona(vista.getCajaDeTextoIdV1());
                
                if(personaBuscada != null){
                    System.out.println("Holaa");
                
                }else{
                    JOptionPane.showMessageDialog(vista.obtenerPanel(), "No se encuentra la persona con el Id " + vista.getCajaDeTextoIdV1(), "Alerta", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }
}
