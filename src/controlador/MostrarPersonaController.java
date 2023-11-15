package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import modelo.MostrarPersonaModel;
import modelo.Persona;
import vista.MostrarPersonaView;

public class MostrarPersonaController {
    
    private MostrarPersonaView vista;
    private MostrarPersonaModel modelo;

    public MostrarPersonaController(MostrarPersonaView vista, MostrarPersonaModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
         
        this.vista.addBtonCerrarListener(new acciones());
        this.vista.addBtonMostrarPersonasListener(new acciones());
    }    
    
    class acciones implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("Cerrar")){
                vista.dispose();
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Mostrar todas las persona")){
                String textoAMostrar = establecerInfoGeneral();
                //this.vista.setCajaDeTextoPrueba(listadoEstudiantes);
                JOptionPane.showMessageDialog(vista.obtenerPanel(), vista.ventanaEmergente(textoAMostrar), "Info", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
    
    private String establecerInfoGeneral(){
        String textoInfoGeneral = "";
        
        textoInfoGeneral += "--- ESTUDIANTES ---\n";
        
        ArrayList<Persona> estudiantes = modelo.mostrarListadoPersonas("Estudiante");
        for(Persona estudiante : estudiantes) {
            textoInfoGeneral += estudiante + "\n";                
        }
        
        textoInfoGeneral += "--- PROFESORES ---\n";
        
        ArrayList<Persona> profesores = modelo.mostrarListadoPersonas("Profesor");
        for(Persona profesor : profesores) {
            textoInfoGeneral += profesor + "\n";                
        }
        
        textoInfoGeneral+= "--- EMPLEADOS ---\n";
        
        ArrayList<Persona> empleados = modelo.mostrarListadoPersonas("Empleado");
        for(Persona empleado : empleados) {
            textoInfoGeneral += empleado + "\n";                
        }
        
        return textoInfoGeneral;
    }
}
