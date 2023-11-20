package DAO;

import java.util.ArrayList;
import modelo.Persona;

public interface IPersonaDao {
    public boolean addPersona(Persona persona);
    public ArrayList<Persona> getPersonasPorTipo(String tipo);
    public Persona getPersona(String personaId);
    public boolean updatePersona(Persona personaConDatosActualizados, String tipoViejo, String IdPersonaVieja);
    public boolean deletePersona(String idPersonaAEliminar);
}
