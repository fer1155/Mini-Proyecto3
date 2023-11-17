package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.EliminarPersonaModel;
import modelo.Persona;
import vista.EliminarPersonaView;

public class EliminarPersonaController {
    private EliminarPersonaView vista;
    private EliminarPersonaModel modelo;
    private Persona personaBuscada;

    public EliminarPersonaController(EliminarPersonaView vista, EliminarPersonaModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
        vista.mostrarComponentesV2(false);
        this.vista.addBtonBuscarListener(new acciones());
        this.vista.addBtonCerrarListener(new acciones());
        this.vista.addBtonEliminarListener(new acciones());
        this.vista.addBtonAtrasListener(new acciones());
    }

    class acciones implements ActionListener {

        
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("Buscar")){
                personaBuscada = modelo.getPersona(vista.getCajaDeTextoId());
                String textoInfoPersona;

                if(personaBuscada != null){
                    textoInfoPersona = personaBuscada.toString();
                    vista.limpiarComponentes();
                    JOptionPane.showMessageDialog(vista.obtenerPanel(), "Se encontro la persona con id " + vista.getCajaDeTextoId(), "Info", JOptionPane.INFORMATION_MESSAGE);
                    vista.mostrarComponentesV2(true);
                    vista.mostrarComponentesV1(false);
                    vista.setTextoArea(textoInfoPersona);
                }else{
                    JOptionPane.showMessageDialog(vista.obtenerPanel(), "No se encuentra la persona con el Id " + vista.getCajaDeTextoId(), "Alerta", JOptionPane.WARNING_MESSAGE);
                    vista.limpiarComponentes();
                }
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Cerrar")){
                vista.dispose();
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Eliminar")){
                if(personaBuscada != null){
                    int opcion = JOptionPane.showConfirmDialog(vista.obtenerPanel(), "¿Desea eliminar a " + personaBuscada.getNombreCompleto() + "?", "Pregunta", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {
                        modelo.eliminarPersona(personaBuscada.getNumId());
                        JOptionPane.showMessageDialog(vista.obtenerPanel(), "Se elimino la persona correctamente", "Info", JOptionPane.INFORMATION_MESSAGE);
                        vista.mostrarComponentesV2(false);
                        vista.mostrarComponentesV1(true);
                    }
                }
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Atras")){
                int opcion = JOptionPane.showConfirmDialog(vista.obtenerPanel(), "¿Desea terminar de eliminar?", "Pregunta", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    vista.mostrarComponentesV2(false);
                    vista.mostrarComponentesV1(true);
                }
            }
        }
    } 
}
