package modelo;

public class Persona {
    private String NombreCompleto;
    private String numId;
    private String fechaDeNacimiento;
    private String direccion;
    private String telefono;
    private String tipoTelefono;
    private String tipo;

    public Persona(String NombreCompleto, String numId, String fechaDeNacimiento, String direccion, String telefono, String tipoTelefono, String tipo) {
        this.NombreCompleto = NombreCompleto;
        this.numId = numId;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipoTelefono = tipoTelefono;
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

    public String getTelefono() {
        return telefono;
    }

    public String getTipoTelefono() {
        return tipoTelefono;
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

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTipoTelefono(String tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "{" + "NombreCompleto=" + NombreCompleto + ", numId=" + numId + ", fechaDeNacimiento=" + fechaDeNacimiento + ", direccion=" + direccion + ", telefono=" + telefono + ", tipoTelefono=" + tipoTelefono + ", tipo=" + tipo + '}';
    }
}
