package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
        if(vista.getCajaDeTextoNombre().isEmpty()){
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Rellene el nombre porfavor", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if(vista.getCajaDeTextoId().isEmpty()){
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Rellene el id porfavor", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if(vista.getCajaDeTextoDireccion().isEmpty()){
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Rellene la direccion porfavor", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if(vista.getCajaDeTextoTelefono1().isEmpty()){
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Rellene el telefono porfavor", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if("".equals(vista.getComboBoxTipoDeTelefono1())){
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Rellene el tipo de telefono porfavor", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if("".equals(vista.getComboBoxTipoDePersona())){
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Rellene el tipo de persona porfavor", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        
        if(!"".equals(vista.getCajaDeTextoTelefono2())){
            if("".equals(vista.getComboBoxTipoDeTelefono2())){
                JOptionPane.showMessageDialog(vista.obtenerPanel(), "Rellene el tipo de telefono del telefono 2 porfavor", "Alerta", JOptionPane.WARNING_MESSAGE);
                return true;
            }
        }else if(!"".equals(vista.getCajaDeTextoTelefono3())){
            if("".equals(vista.getComboBoxTipoDeTelefono3())){
                JOptionPane.showMessageDialog(vista.obtenerPanel(), "Rellene el tipo de telefono del telefono 3 porfavor", "Alerta", JOptionPane.WARNING_MESSAGE);
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
                JOptionPane.showMessageDialog(vista.obtenerPanel(), "Se registro correctamente al estudiante", "Todo claro", JOptionPane.INFORMATION_MESSAGE);
            }else if("PROFESOR".equals(tipoDePersona)){
                Profesor profesor = new Profesor(vista.getCajaDeTextoNombre(), vista.getCajaDeTextoId(), vista.getCajaDeTextoFechaDeNacimiento(), vista.getCajaDeTextoDireccion(),vista.getCajaDeTextoDireccion2(), vista.getCajaDeTextoTelefono1(), vista.getComboBoxTipoDeTelefono1(), vista.getCajaDeTextoTelefono2(), vista.getComboBoxTipoDeTelefono2(), vista.getCajaDeTextoTelefono3(), vista.getComboBoxTipoDeTelefono3());
                modelo.registrar(profesor);
                JOptionPane.showMessageDialog(vista.obtenerPanel(), "Se registro correctamente al Profesor", "Todo claro", JOptionPane.INFORMATION_MESSAGE);
            }else if("EMPLEADO".equals(tipoDePersona)){
                Empleado empleado = new Empleado(vista.getCajaDeTextoNombre(), vista.getCajaDeTextoId(), vista.getCajaDeTextoFechaDeNacimiento(), vista.getCajaDeTextoDireccion(),vista.getCajaDeTextoDireccion2(), vista.getCajaDeTextoTelefono1(), vista.getComboBoxTipoDeTelefono1(), vista.getCajaDeTextoTelefono2(), vista.getComboBoxTipoDeTelefono2(), vista.getCajaDeTextoTelefono3(), vista.getComboBoxTipoDeTelefono3());
                modelo.registrar(empleado);
                JOptionPane.showMessageDialog(vista.obtenerPanel(), "Se registro correctamente al Empleado", "Todo claro", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Ya existe el id suministrado", "Alerta", JOptionPane.WARNING_MESSAGE);
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
