package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.Estudiante;
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
        this.vista.addBtonRegistrarListener(new acciones());
        this.vista.addBtonCerrarListener(new acciones());
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
        }else if(vista.getCajaDeTextoTelefono().isEmpty()){
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Rellene el telefono porfavor", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if("".equals(vista.getComboBoxTipoDeTelefono())){
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Rellene el tipo de telefono porfavor", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if("".equals(vista.getComboBoxTipoDePersona())){
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Rellene el tipo de persona porfavor", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }
    
    private void registrarPorTipoDePersona(String tipoDePersona){
        if("ESTUDIANTE".equals(tipoDePersona)){
            Estudiante estudiante = new Estudiante(vista.getCajaDeTextoNombre(), vista.getCajaDeTextoId(), vista.getCajaDeTextoFechaDeNacimiento(), vista.getCajaDeTextoDireccion(), vista.getCajaDeTextoTelefono(), vista.getComboBoxTipoDeTelefono());
            modelo.registrar(estudiante);
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Se registro correctamente al estudiante", "Todo claro", JOptionPane.INFORMATION_MESSAGE);
        }else if("PROFESOR".equals(tipoDePersona)){
            Profesor profesor = new Profesor(vista.getCajaDeTextoNombre(), vista.getCajaDeTextoId(), vista.getCajaDeTextoFechaDeNacimiento(), vista.getCajaDeTextoDireccion(), vista.getCajaDeTextoTelefono(), vista.getComboBoxTipoDeTelefono());
            modelo.registrar(profesor);
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Se registro correctamente al Profesor", "Todo claro", JOptionPane.INFORMATION_MESSAGE);
        }else if("EMPLEADO".equals(tipoDePersona)){
            Empleado empleado = new Empleado(vista.getCajaDeTextoNombre(), vista.getCajaDeTextoId(), vista.getCajaDeTextoFechaDeNacimiento(), vista.getCajaDeTextoDireccion(), vista.getCajaDeTextoTelefono(), vista.getComboBoxTipoDeTelefono());
            modelo.registrar(empleado);
            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Se registro correctamente al Empleado", "Todo claro", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
