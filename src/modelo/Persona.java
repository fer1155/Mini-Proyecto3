/*
Miniproyecto No. 3

Fernando Cardona - 2241381
Oscar Mario Muñoz - 2242481
Santiago Alzate   - 2242274

Grupo de FPOE: 80
*/
package modelo;

public class Persona {
    private String NombreCompleto;
    private String numId;
    private String fechaDeNacimiento;
    private String direccion;
    private String direccion2;
    private String telefono;
    private String tipoTelefono;
    private String telefono2;
    private String tipoTelefono2;
    private String telefono3;
    private String tipoTelefono3;
    private String tipo;
    
    public Persona(String NombreCompleto, String numId, String fechaDeNacimiento, String direccion, String direccion2, String telefono, String tipoTelefono, String telefono2, String tipoTelefono2, String telefono3, String tipoTelefono3, String tipo) {
        this.NombreCompleto = NombreCompleto;
        this.numId = numId;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.direccion = direccion;
        this.direccion2 = direccion2;
        this.telefono = telefono;
        this.tipoTelefono = tipoTelefono;
        this.telefono2 = telefono2;
        this.tipoTelefono2 = tipoTelefono2;
        this.telefono3 = telefono3;
        this.tipoTelefono3 = tipoTelefono3;
        this.tipo = tipo;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public String getNumId() {
        return numId;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public String getDireccion2() {
        return direccion2;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getTipoTelefono() {
        return tipoTelefono;
    }
    
    public String getTelefono2() {
        return telefono2;
    }

    public String getTipoTelefono2() {
        return tipoTelefono2;
    }
    
    public String getTelefono3() {
        return telefono3;
    }

    public String getTipoTelefono3() {
        return tipoTelefono3;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public void setNumId(String numId) {
        this.numId = numId;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTipoTelefono(String tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }
    
    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public void setTipoTelefono2(String tipoTelefono2) {
        this.tipoTelefono2 = tipoTelefono2;
    }
    
    public void setTelefono3(String telefono3) {
        this.telefono3 = telefono3;
    }

    public void setTipoTelefono3(String tipoTelefono3) {
        this.tipoTelefono3 = tipoTelefono3;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "-------------------------------------------------" + "\n" + "Nombre Completo: " + NombreCompleto + "\n" + "Número de identificación: " + numId + "\n" + "Fecha de Nacimiento: " + fechaDeNacimiento + "\n" + "Direcciones: " + direccion + " / " + direccion2 + "\n" + "Teléfonos: " + telefono + " - "  + telefono2 + " - "+ telefono3 + "\n" + "Tipos de Teléfonos: " + tipoTelefono + " - " + tipoTelefono2 + " - " + tipoTelefono3 + "\n" + "-------------------------------------------------" ;
    }
}
