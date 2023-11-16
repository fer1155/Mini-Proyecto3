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
        vista.mostrarComponentesV2(false);
        this.vista.addBtonCerrarListenerV1(new acciones());
        this.vista.addBtonBuscarListenerV1(new acciones());
        this.vista.addBtonAtrasListener(new acciones());
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
                    vista.mostrarComponentesV1(false);
                    vista.mostrarComponentesV2(true);
                
                }else{
                    JOptionPane.showMessageDialog(vista.obtenerPanel(), "No se encuentra la persona con el Id " + vista.getCajaDeTextoIdV1(), "Alerta", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(e.getActionCommand().equalsIgnoreCase("Atras")){
                int opcion = JOptionPane.showConfirmDialog(vista.obtenerPanel(), "¿Desea terminar de actualizar?", "Pregunta", JOptionPane.YES_NO_OPTION);

                if (opcion == JOptionPane.YES_OPTION) {
                    vista.mostrarComponentesV1(true);
                    vista.mostrarComponentesV2(false);
                }
            }
            if(e.getActionCommand().equalsIgnoreCase("Actualizar")){
                System.out.println("Hola");
            }
        }
    }
}
