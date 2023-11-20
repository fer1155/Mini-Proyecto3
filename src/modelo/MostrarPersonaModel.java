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
