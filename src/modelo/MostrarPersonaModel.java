/*
Miniproyecto No. 3

Fernando Cardona - 2241381
Oscar Mario Muñoz - 2242481
Santiago Alzate   - 2242274

Grupo de FPOE: 80
*/
package modelo;

import java.util.ArrayList;

public class MostrarPersonaModel {
    
    private final PrincipalModel modeloGeneral;
    
    public MostrarPersonaModel(PrincipalModel modelo) {
        this.modeloGeneral = modelo;
    }

    public ArrayList<Persona> mostrarListadoPersonas(String tipo){
        return modeloGeneral.getListadoPersonas(tipo);
    }
    
}
