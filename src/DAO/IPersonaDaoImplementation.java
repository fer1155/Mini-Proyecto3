package DAO;

import java.util.ArrayList;
import java.util.List;
import modelo.Estudiante;
import modelo.Persona;


public class IPersonaDaoImplementation implements IPersonaDao {
    ArrayList<Persona> estudiantes;
    
    public IPersonaDaoImplementation() {
        this.estudiantes = new ArrayList<>();
    }
    
    @Override
    public ArrayList<Persona> getPersonasPorTipo(String tipo) {
        if("Estudiante".equals(tipo)){
            return estudiantes;
        }
        return null;
    }

    @Override
    public Estudiante getPersona(int personaId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean addPersona(Persona persona) {
        if("Estudiante".equals(persona.getTipo())){
            estudiantes.add((Estudiante) persona);
        }
        return true;
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
