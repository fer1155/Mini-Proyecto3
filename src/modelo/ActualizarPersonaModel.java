package modelo;

public class ActualizarPersonaModel {
    
    private PrincipalModel modeloGeneral;
    
    public ActualizarPersonaModel(PrincipalModel modelo) {
        this.modeloGeneral = modelo;
    }

    public Persona getPersona(String id){
        return modeloGeneral.getPersona(id);
    }
    
    public boolean actualizarPersona(Persona personaActualizar, String idPersonaVieja){
        return modeloGeneral.actualizarPersona(personaActualizar, idPersonaVieja);
    }
}
