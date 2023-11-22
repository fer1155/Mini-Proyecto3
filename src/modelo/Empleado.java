/*
Miniproyecto No. 3

Fernando Cardona - 2241381
Oscar Mario Muñoz - 2242481
Santiago Alzate   - 2242274

Grupo de FPOE: 80
*/
package modelo;

public class Empleado extends Persona {
    
    public Empleado(String NombreCompleto, String numId, String fechaDeNacimiento, String direccion, String direccion2, String telefono, String tipoTelefono, String telefono2, String tipoTelefono2, String telefono3, String tipoTelefono3) {
        super(NombreCompleto, numId, fechaDeNacimiento, direccion, direccion2, telefono, tipoTelefono, telefono2, tipoTelefono2, telefono3, tipoTelefono3,"Empleado");
    }
    
}
