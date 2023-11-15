package modelo;

public class Empleado extends Persona {
    
    public Empleado(String NombreCompleto, String numId, String fechaDeNacimiento, String direccion, String telefono, String tipoTelefono) {
        super(NombreCompleto, numId, fechaDeNacimiento, direccion, telefono, tipoTelefono, "Empleado");
    }
    
}
