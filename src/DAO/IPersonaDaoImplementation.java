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
    public Estudiante getPersona(int personaId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updatePersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deletePersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
