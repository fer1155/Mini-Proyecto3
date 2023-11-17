package modelo;

import java.util.ArrayList;

public class ActualizarPersonaModel {
    
    private PrincipalModel modeloGeneral;
    
    public ActualizarPersonaModel(PrincipalModel modelo) {
        this.modeloGeneral = modelo;
    }

    public Persona getPersona(String id){
        return modeloGeneral.getPersona(id);
    }
    
    public ArrayList<Persona> mostrarListadoPersonas(String tipo){
        return modeloGeneral.getListadoPersonas(tipo);
    }
    
    public boolean actualizarPersona(Persona personaActualizar, String tipo, String IdPersonaVieja){
        return modeloGeneral.actualizarPersona(personaActualizar, tipo, IdPersonaVieja);
    }
}
