/*
Miniproyecto No. 3

Fernando Cardona - 2241381
Oscar Mario Muñoz - 2242481
Santiago Alzate   - 2242274

Grupo de FPOE: 80
*/
package modelo;

import DAO.IPersonaDaoImplementation;
import DAO.IPersonaDao;
import java.util.ArrayList;

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
    
    public Persona getPersona(String id){
        return this.personaDao.getPersona(id);
    }
    
    public boolean actualizarPersona(Persona persona, String tipoViejo, String IdPersonaVieja){
        return this.personaDao.updatePersona(persona, tipoViejo, IdPersonaVieja);
    }
    
    public boolean deletePersona(String id){
        return this.personaDao.deletePersona(id);
    }
}

