package modelo;

public class Profesor extends Persona {
    
    public Profesor(String NombreCompleto, String numId, String fechaDeNacimiento, String direccion, String telefono, String tipoTelefono) {
        super(NombreCompleto, numId, fechaDeNacimiento, direccion, telefono, tipoTelefono, "Profesor");
    }
    
}
