package modelo;

public class RegistrarPersonaModel {

    private PrincipalModel modeloGeneral;
    
    public RegistrarPersonaModel(PrincipalModel modelo) {
        this.modeloGeneral = modelo;
    }

    public void registrar(Persona personaARegistrar){
        modeloGeneral.agregarPersona(personaARegistrar);
    }
}
