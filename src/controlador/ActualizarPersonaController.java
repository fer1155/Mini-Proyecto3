package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.ActualizarPersonaModel;
import modelo.Persona;
import vista.ActualizarPersonaView;

public class ActualizarPersonaController {
    private ActualizarPersonaView vista;
    private ActualizarPersonaModel modelo;
    private Persona personaBuscada;

    public ActualizarPersonaController(ActualizarPersonaView vista, ActualizarPersonaModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
        vista.mostrarComponentesV2(false);
        this.vista.addBtonCerrarListenerV1(new acciones());
        this.vista.addBtonBuscarListenerV1(new acciones());
        this.vista.addBtonAtrasListener(new acciones());
        this.vista.addBtonActualizarListener(new acciones());
    }

    class acciones implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("Cerrar")){
                vista.dispose();
            }
            if(e.getActionCommand().equalsIgnoreCase("Buscar")){
                personaBuscada = modelo.getPersona(vista.getCajaDeTextoIdV1());
                
                if(personaBuscada != null){
                    vista.limpiarComponentes();
                    vista.mostrarComponentesV1(false);
                    vista.mostrarComponentesV2(true);
                
                }else{
                    vista.limpiarComponentes();
                    JOptionPane.showMessageDialog(vista.obtenerPanel(), "No se encuentra la persona con el Id " + vista.getCajaDeTextoIdV1(), "Alerta", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(e.getActionCommand().equalsIgnoreCase("Atras")){
                int opcion = JOptionPane.showConfirmDialog(vista.obtenerPanel(), "¿Desea terminar de actualizar?", "Pregunta", JOptionPane.YES_NO_OPTION);

                if (opcion == JOptionPane.YES_OPTION) {
                    vista.mostrarComponentesV1(true);
                    vista.mostrarComponentesV2(false);
                }
            }
            if(e.getActionCommand().equalsIgnoreCase("Actualizar")){
                if(verificarCamposVacios()){
                    JOptionPane.showMessageDialog(vista.obtenerPanel(), "No ha llenado algun campo aun", "Alerta", JOptionPane.ERROR_MESSAGE);
                }else{
                    int opcion = JOptionPane.showConfirmDialog(vista.obtenerPanel(), "¿Esta seguro de los datos?", "Pregunta", JOptionPane.YES_NO_OPTION);

                    if (opcion == JOptionPane.YES_OPTION) {
                        if(modelo.actualizarPersona(cambiarDatos(), personaBuscada.getNumId())){
                            JOptionPane.showMessageDialog(vista.obtenerPanel(), "Actualizacion exitosa", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                            vista.limpiarComponentes();
                            vista.mostrarComponentesV1(true);
                            vista.mostrarComponentesV2(false);
                        }
                    }
                }
            }
        }
    }
    
    public Persona cambiarDatos(){
        if(!"".equals(vista.getCajaDeTextoNombreV2())){
            personaBuscada.setNombreCompleto(vista.getCajaDeTextoNombreV2());
        }
        
        if(!"".equals(vista.getCajaDeTextoIdV2())){
            personaBuscada.setNumId(vista.getCajaDeTextoIdV2());
        }
        
        if(!"".equals(vista.getCajaDeTextoFechaDeNacimientoV2())){
            personaBuscada.setFechaDeNacimiento(vista.getCajaDeTextoFechaDeNacimientoV2());
        }
        
        if(!"".equals(vista.getCajaDeTextoDireccionV2())){
            personaBuscada.setDireccion(vista.getCajaDeTextoDireccionV2());
        }
        
        if(!"".equals(vista.getCajaDeTextoDireccion2V2())){
            personaBuscada.setDireccion2(vista.getCajaDeTextoDireccion2V2());
        }
        
        if(!"".equals(vista.getCajaDeTextoTelefonoV2())){
            personaBuscada.setTelefono(vista.getCajaDeTextoTelefonoV2());
        }
        
        if(!"".equals(vista.getCajaDeTextoTelefono2V2())){
            personaBuscada.setTelefono2(vista.getCajaDeTextoTelefono2V2());
        }
        
        if(!"".equals(vista.getCajaDeTextoTelefono3V2())){
            personaBuscada.setTelefono3(vista.getCajaDeTextoTelefono3V2());
        }
        
        if(!"".equals(vista.getComboBoxTipoDeTelefonoV2())){
            personaBuscada.setTipoTelefono(vista.getComboBoxTipoDeTelefonoV2());
        }
        
        if(!"".equals(vista.getComboBoxTipoDeTelefono2V2())){
            personaBuscada.setTipoTelefono2(vista.getComboBoxTipoDeTelefono2V2());
        }
        
        if(!"".equals(vista.getComboBoxTipoDeTelefono3V2())){
            personaBuscada.setTipoTelefono3(vista.getComboBoxTipoDeTelefono3V2());
        }
        
        if(!"".equals(vista.getComboBoxTipoDePersonaV2())){
            personaBuscada.setTipo(vista.getComboBoxTipoDePersonaV2());
        }
       
        return personaBuscada;
    }
    
    public boolean verificarCamposVacios(){
        if(!"".equals(vista.getCajaDeTextoNombreV2()) || !"".equals(vista.getCajaDeTextoIdV2()) || !"".equals(vista.getCajaDeTextoFechaDeNacimientoV2()) || !"".equals(vista.getCajaDeTextoDireccionV2())|| !"".equals(vista.getCajaDeTextoDireccion2V2())|| !"".equals(vista.getCajaDeTextoTelefonoV2())|| !"".equals(vista.getCajaDeTextoTelefono2V2())|| !"".equals(vista.getCajaDeTextoTelefono3V2())|| !"".equals(vista.getComboBoxTipoDeTelefonoV2())|| !"".equals(vista.getComboBoxTipoDeTelefono2V2())|| !"".equals(vista.getComboBoxTipoDeTelefono3V2())|| !"".equals(vista.getComboBoxTipoDePersonaV2())){
            return false;
        }
        
        return true;
    }
}
