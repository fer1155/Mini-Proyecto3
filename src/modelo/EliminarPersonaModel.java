/*
Miniproyecto No. 3

Fernando Cardona - 2241381
Oscar Mario Muñoz - 2242481
Santiago Alzate   - 2242274

Grupo de FPOE: 80
*/
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
