/*
Miniproyecto No. 3

Fernando Cardona - 2241381
Oscar Mario Muñoz - 2242481
Santiago Alzate   - 2242274

Grupo de FPOE: 80
*/
package modelo;

public class RegistrarPersonaModel {

    private PrincipalModel modeloGeneral;
    
    public RegistrarPersonaModel(PrincipalModel modelo) {
        this.modeloGeneral = modelo;
    }

    public Persona getPersona(String id){
        return modeloGeneral.getPersona(id);
    }
    
    public void registrar(Persona personaARegistrar){
        modeloGeneral.agregarPersona(personaARegistrar);
    }
}
