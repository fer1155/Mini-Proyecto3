/*
Miniproyecto No. 3

Fernando Cardona - 2241381
Oscar Mario Muñoz - 2242481
Santiago Alzate   - 2242274

Grupo de FPOE: 80
*/
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.Estudiante;
import modelo.Persona;
import modelo.Profesor;
import vista.RegistrarPersonaView;
import modelo.RegistrarPersonaModel;

public class RegistrarPersonaController {
    
    private RegistrarPersonaView vista;
    private RegistrarPersonaModel modelo;

    public RegistrarPersonaController(RegistrarPersonaView vista, RegistrarPersonaModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
        vista.mostrarMasTelefonos(false);
        vista.mostrarMasDirecciones(false);
        this.vista.addBtonRegistrarListener(new acciones());
        this.vista.addBtonCerrarListener(new acciones());
        this.vista.addBtnMasTelefonosListener(new acciones2());
        this.vista.addBtnMenosTelefonosListener(new acciones3());
        this.vista.addBtnMasDireccionesListener(new acciones4());
        this.vista.addBtnMenosDireccionesListener(new acciones5());
    }

    class acciones implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("Registrar")){
                if(verificarCamposVacios() == false){
                    registrarPorTipoDePersona(vista.getComboBoxTipoDePersona());
                    vista.limpiarCampos();
                }
            }
            if(e.getActionCommand().equalsIgnoreCase("Cerrar")){
                vista.dispose();
            }
        }
    }
    
    private boolean verificarCamposVacios(){
        if("".equals(vista.getComboBoxTipoDePersona())){
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Falta ingresar el tipo de persona, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if(vista.getCajaDeTextoNombre().isEmpty()){
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Falta ingresar el nombre, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if(vista.getCajaDeTextoId().isEmpty()){
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Falta ingresar el ID, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if(vista.getCajaDeTextoDireccion().isEmpty()){
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Falta ingresar la direccion, por favor rellenela", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if(vista.getCajaDeTextoTelefono1().isEmpty()){
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Falta ingresar el telefono, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if("".equals(vista.getComboBoxTipoDeTelefono1())){
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Falta ingresar el tipo de telefono, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        
        if(!"".equals(vista.getCajaDeTextoTelefono2())){
            if("".equals(vista.getComboBoxTipoDeTelefono2())){
                JOptionPane.showMessageDialog(vista.obtenerPanel(), "Falta ingresar tipo de telefono 2, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
                return true;
            }
        }else if(!"".equals(vista.getCajaDeTextoTelefono3())){
            if("".equals(vista.getComboBoxTipoDeTelefono3())){
                JOptionPane.showMessageDialog(vista.obtenerPanel(), "Falta ingresar tipo de telefono 3, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
                return true;
            }
        }
        return false;
    }
    
    private void registrarPorTipoDePersona(String tipoDePersona){
        Persona persona = modelo.getPersona(vista.getCajaDeTextoId());
        
        if(persona == null){
            if("ESTUDIANTE".equals(tipoDePersona)){
                Estudiante estudiante = new Estudiante(vista.getCajaDeTextoNombre(), vista.getCajaDeTextoId(), vista.getCajaDeTextoFechaDeNacimiento(), vista.getCajaDeTextoDireccion(), vista.getCajaDeTextoDireccion2(), vista.getCajaDeTextoTelefono1(), vista.getComboBoxTipoDeTelefono1(), vista.getCajaDeTextoTelefono2(), vista.getComboBoxTipoDeTelefono2(), vista.getCajaDeTextoTelefono3(), vista.getComboBoxTipoDeTelefono3());
                modelo.registrar(estudiante);
                JOptionPane.showMessageDialog(vista.obtenerPanel(), "¡Se registró con éxito al estudiante!", "Validacion", JOptionPane.INFORMATION_MESSAGE);
            }else if("PROFESOR".equals(tipoDePersona)){
                Profesor profesor = new Profesor(vista.getCajaDeTextoNombre(), vista.getCajaDeTextoId(), vista.getCajaDeTextoFechaDeNacimiento(), vista.getCajaDeTextoDireccion(),vista.getCajaDeTextoDireccion2(), vista.getCajaDeTextoTelefono1(), vista.getComboBoxTipoDeTelefono1(), vista.getCajaDeTextoTelefono2(), vista.getComboBoxTipoDeTelefono2(), vista.getCajaDeTextoTelefono3(), vista.getComboBoxTipoDeTelefono3());
                modelo.registrar(profesor);
                JOptionPane.showMessageDialog(vista.obtenerPanel(), "¡Se registró con éxito al profesor!", "Validacion", JOptionPane.INFORMATION_MESSAGE);
            }else if("EMPLEADO".equals(tipoDePersona)){
                Empleado empleado = new Empleado(vista.getCajaDeTextoNombre(), vista.getCajaDeTextoId(), vista.getCajaDeTextoFechaDeNacimiento(), vista.getCajaDeTextoDireccion(),vista.getCajaDeTextoDireccion2(), vista.getCajaDeTextoTelefono1(), vista.getComboBoxTipoDeTelefono1(), vista.getCajaDeTextoTelefono2(), vista.getComboBoxTipoDeTelefono2(), vista.getCajaDeTextoTelefono3(), vista.getComboBoxTipoDeTelefono3());
                modelo.registrar(empleado);
                JOptionPane.showMessageDialog(vista.obtenerPanel(), "¡Se registró con éxito al empleado!", "Validacion", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Ya existe el ID suministrado", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    class acciones2 extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            vista.mostrarMasTelefonos(true);
            vista.bntEtiquetaMasTelefonos();
        }
    }
    
    class acciones3 extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            vista.mostrarMenosTelefonos(false);
            vista.bntEtiquetaMenosTelefonos();
        }
    }
    
    class acciones4 extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            vista.mostrarMasDirecciones(true);
            vista.bntEtiquetaMasDirecciones();
        }
    }
    
    class acciones5 extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            vista.mostrarMenosDirecciones(false);
            vista.bntEtiquetaMenosDirecciones();
        }
    }
}
