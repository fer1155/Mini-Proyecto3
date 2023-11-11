package DAO;

import java.util.ArrayList;
import modelo.Persona;

public interface IPersonaDao {
    public ArrayList<Persona> getPersonasPorTipo();
    public Persona getPersona(int personaId);
    public boolean addPersona(Persona persona);
    public boolean updatePersona(Persona persona);
    public boolean deletePersona(Persona persona);
}
