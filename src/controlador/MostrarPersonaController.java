/*
Miniproyecto No. 3

Fernando Cardona - 2241381
Oscar Mario Muñoz - 2242481
Santiago Alzate   - 2242274

Grupo de FPOE: 80
*/
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
            
            if(e.getActionCommand().equalsIgnoreCase("Mostrar todas las personas")){
                String textoAMostrar = establecerInfoGeneral();
                JOptionPane.showMessageDialog(vista.obtenerPanel(), vista.ventanaEmergente(textoAMostrar), "Infomacion General", JOptionPane.PLAIN_MESSAGE);
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Mostrar persona por ID")){
                mostrarCampos();
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Buscar")){
                if("".equals(vista.getCajaDeTextoId())){
                    JOptionPane.showMessageDialog(vista.obtenerPanel(), "Porfavor rellene el ID", "Alerta", JOptionPane.WARNING_MESSAGE);
                }else{
                    String textoAMostrar = establecerInfoIndividual();
                    vista.limpiarCampos();
                    JOptionPane.showMessageDialog(vista.obtenerPanel(), vista.ventanaEmergente(textoAMostrar), "Info Individual", JOptionPane.PLAIN_MESSAGE);
                }
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
        boolean seEncontroLaPersona = false;
        
        ArrayList<Persona> estudiantes = modelo.mostrarListadoPersonas("Estudiante");
        for(Persona estudiante : estudiantes) {
            if(vista.getCajaDeTextoId().equals(estudiante.getNumId())){
                textoInfoGeneral += "\nESTUDIANTE:\n";
                textoInfoGeneral += estudiante + "\n\n";
                seEncontroLaPersona = true; 
            }                             
        }
        
        ArrayList<Persona> profesores = modelo.mostrarListadoPersonas("Profesor");
        for(Persona profesor : profesores) {
            if(vista.getCajaDeTextoId().equals(profesor.getNumId())){
                textoInfoGeneral += "\nPROFESOR:\n";
                textoInfoGeneral += profesor + "\n\n";
                seEncontroLaPersona = true; 
            }                             
        }
        
        ArrayList<Persona> empleados = modelo.mostrarListadoPersonas("Empleado");
        for(Persona empleado : empleados) {
            if(vista.getCajaDeTextoId().equals(empleado.getNumId())){
                textoInfoGeneral += "\nEMPLEADO:\n";
                textoInfoGeneral += empleado + "\n\n";
                seEncontroLaPersona = true; 
            }                             
        }
        
        if(seEncontroLaPersona == false){
            textoInfoGeneral += "No se encontro a la persona con el Id " + vista.getCajaDeTextoId();
        }
        
        return textoInfoGeneral;
    }
}
