/*
Miniproyecto No. 3

Fernando Cardona - 2241381
Oscar Mario Muñoz - 2242481
Santiago Alzate   - 2242274

Grupo de FPOE: 80
*/
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
            estudiantes.add(persona);
            return true;
        }else if("Profesor".equals(persona.getTipo())){
            profesores.add(persona);
            return true;
        }else if("Empleado".equals(persona.getTipo())){
            empleados.add(persona);
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
    public boolean updatePersona(Persona personaConDatosActualizados, String tipoViejo, String IdPersonaVieja) {
        for(int i = 0; i < estudiantes.size(); i++) {
            if(IdPersonaVieja.equals(estudiantes.get(i).getNumId())){
                if(estudiantes.get(i).getTipo().equals(tipoViejo)){
                    estudiantes.set(i, personaConDatosActualizados);
                    return true;
                }else{
                    estudiantes.remove(estudiantes.get(i));
                    addPersona(personaConDatosActualizados);
                    return true;
                }
            }                            
        }
        
        for(int i = 0; i < profesores.size(); i++) {
            if(IdPersonaVieja.equals(profesores.get(i).getNumId())){
                if(profesores.get(i).getTipo().equals(tipoViejo)){
                    profesores.set(i, personaConDatosActualizados);
                    return true;
                }else{
                    profesores.remove(profesores.get(i));
                    addPersona(personaConDatosActualizados);
                    return true;
                }
            }                            
        }
        
        for(int i = 0; i < empleados.size(); i++) {
            if(IdPersonaVieja.equals(empleados.get(i).getNumId())){
                if(empleados.get(i).getTipo().equals(tipoViejo)){
                    empleados.set(i, personaConDatosActualizados);
                    return true;
                }else{
                    empleados.remove(empleados.get(i));
                    addPersona(personaConDatosActualizados);
                    return true;
                }
            }                            
        }
        
        return false;
    }

    @Override
    public boolean deletePersona(String idPersonaAEliminar) {
        
        for(Persona estudiante : estudiantes) {
            if(idPersonaAEliminar.equals(estudiante.getNumId())){
                estudiantes.remove(estudiante);
                return true;
            }                            
        }
        
        for(Persona profesor : profesores) {
            if(idPersonaAEliminar.equals(profesor.getNumId())){
                profesores.remove(profesor);
                return true;
            }                            
        }
        
        for(Persona empleado : empleados) {
            if(idPersonaAEliminar.equals(empleado.getNumId())){
                empleados.remove(empleado);
                return true;
            }                            
        }
        
        return false;
    }   
}
