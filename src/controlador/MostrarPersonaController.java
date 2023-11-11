package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Estudiante;
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
        
        ArrayList<Persona> estudiantes = modelo.mostrarListadoPersonas("Estudiante");
        String listadoEstudiantes = "Listado de estudiantes".toUpperCase() + "\n" ;
        for(Persona estudiante : estudiantes) {
            listadoEstudiantes += estudiante + "\n";                
        }
        this.vista.setCajaDeTextoPrueba(listadoEstudiantes);
    }    
}
