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
    private boolean mostrarCampos;

    public MostrarPersonaController(MostrarPersonaView vista, MostrarPersonaModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.mostrarCampos = false;
        vista.mostrarCampos(false);
        vista.setVisible(true);
         
        this.vista.addBtonCerrarListener(new acciones());
        this.vista.addBtonMostrarPersonasListener(new acciones());
        this.vista.addBtonMostrarPersonaListener(new acciones());
        this.vista.addBtonBuscarListener(new acciones());
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
            if(e.getActionCommand().equalsIgnoreCase("Buscar persona individualmente")){
                mostrarCampos();
            }
            if(e.getActionCommand().equalsIgnoreCase("Buscar")){
                String textoAMostrar = establecerInfoIndividual();
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
    
    private void mostrarCampos(){
        if(mostrarCampos == false){
            mostrarCampos = true;
            vista.mostrarCampos(mostrarCampos);
        }else if(mostrarCampos == true){
            mostrarCampos = false;
            vista.mostrarCampos(mostrarCampos);
        }
    }
    
    private String establecerInfoIndividual(){
        String textoInfoGeneral = "";
        
        textoInfoGeneral += "--- ESTUDIANTES ---\n";
        
        /*
        ArrayList<Persona> estudiantes = modelo.mostrarListadoPersonas("Estudiante");
        for(Persona estudiante : estudiantes) {
            if(!"".equals(vista.getCajaDeTextoNombre())){
                if(vista.getCajaDeTextoNombre().equals(estudiante.getNombreCompleto()) && vista.getCajaDeTextoId().equals(estudiante.getNumId()) ){
                    System.out.println("Hola1");
                    textoInfoGeneral += estudiante + "\n";
                } 
            }else if(!"".equals(vista.getCajaDeTextoId())){
                if(vista.getCajaDeTextoId().equals(estudiante.getNumId())){
                    System.out.println("Hola2");
                    textoInfoGeneral += estudiante + "\n";
                } 
            }
                            
        }*/
        
        
        return textoInfoGeneral;
    }
}
