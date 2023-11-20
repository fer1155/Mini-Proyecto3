package modelo;

public class EliminarPersonaModel {
    
    private PrincipalModel modeloGeneral;
    
    public EliminarPersonaModel(PrincipalModel modelo) {
        this.modeloGeneral = modelo;
    }

    public Persona getPersona(String id){
        return modeloGeneral.getPersona(id);
    }

    public boolean eliminarPersona(String id){
        return modeloGeneral.deletePersona(id);
    }
}
