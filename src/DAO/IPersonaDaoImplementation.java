package DAO;

import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;
import modelo.Estudiante;
import modelo.Persona;
import modelo.Profesor;


public class IPersonaDaoImplementation implements IPersonaDao {
    ArrayList<Persona> estudiantes;
    ArrayList<Persona> profesores;
    ArrayList<Persona> empleados;
    
    public IPersonaDaoImplementation() {
        this.estudiantes = new ArrayList<>();
        this.profesores = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }
    
    @Override
    public boolean addPersona(Persona persona) {
        if("Estudiante".equals(persona.getTipo())){
            estudiantes.add((Estudiante) persona);
            for(Persona elemento:estudiantes){
                System.out.println(elemento);
            }
            return true;
        }else if("Profesor".equals(persona.getTipo())){
            profesores.add((Profesor) persona);
            for(Persona elemento:profesores){
                System.out.println(elemento);
            }
            return true;
        }else if("Empleado".equals(persona.getTipo())){
            empleados.add((Empleado) persona);
            for(Persona elemento:empleados){
                System.out.println(elemento);
            }
            return true;
        }
        return false;
    }
    
    @Override
    public ArrayList<Persona> getPersonasPorTipo(String tipo) {
        if("Estudiante".equals(tipo)){
            return estudiantes;
        }else if("Profesor".equals(tipo)){
            return profesores;
        }if("Empleado".equals(tipo)){
            return empleados;
        }
        return null;
    }

    @Override
    public Persona getPersona(String personaId) {
        
        for(Persona estudiante : estudiantes) {
            if(personaId.equals(estudiante.getNumId())){
                return estudiante;
            }                            
        }
        
        for(Persona profesor : profesores) {
            if(personaId.equals(profesor.getNumId())){
                return profesor;
            }
        }
        
        for(Persona empleado : empleados) {
            if(personaId.equals(empleado.getNumId())){
                return empleado;
            }
        }
        
        return null;
    }

    @Override
    public boolean updatePersona(Persona personaConDatosActualizados, String IdPersonaVieja) {
        for(int i = 0; i<estudiantes.size(); i++) {
            if(IdPersonaVieja.equals(estudiantes.get(i).getNumId())){
                estudiantes.set(i, personaConDatosActualizados);
                return true;
            }                            
        }
        
        for(int i = 0; i < profesores.size(); i++) {
            if(IdPersonaVieja.equals(profesores.get(i).getNumId())){
                profesores.set(i, personaConDatosActualizados);
                return true;
            }                            
        }
        
        for(int i = 0; i < empleados.size(); i++) {
            if(IdPersonaVieja.equals(empleados.get(i).getNumId())){
                empleados.set(i, personaConDatosActualizados);
                return true;
            }                            
        }
        
        return false;
    }

    @Override
    public boolean deletePersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
