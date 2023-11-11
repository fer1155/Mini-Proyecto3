package modelo;

public class Estudiante extends Persona {
    
    public Estudiante(String NombreCompleto, String numId, String fechaDeNacimiento, String direccion, String telefono, String tipoTelefono) {
        super(NombreCompleto, numId, fechaDeNacimiento, direccion, telefono, tipoTelefono, "Estudiante");
    }
    
}
