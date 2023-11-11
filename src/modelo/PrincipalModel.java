package modelo;

import DAO.IPersonaDaoImplementation;
import DAO.IPersonaDao;
import java.util.ArrayList;
import java.util.List;

public class PrincipalModel {
    private IPersonaDao personaDao;

    public PrincipalModel() {
        this.personaDao = new IPersonaDaoImplementation();
    }
    
    public boolean agregarPersona(Persona persona){
        return this.personaDao.addPersona(persona);
    }
    
    public ArrayList<Persona> getListadoPersonas(String tipo){
        return this.personaDao.getPersonasPorTipo(tipo);
    }
}

