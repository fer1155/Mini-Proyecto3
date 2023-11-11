package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.MostrarPersonaModel;
import modelo.PrincipalModel;
import modelo.RegistrarPersonaModel;
import vista.MostrarPersonaView;
import vista.PrincipalView;
import vista.RegistrarPersonaView;

public class PrincipalController {

    private PrincipalView vista;
    private PrincipalModel modelo;
    private RegistrarPersonaView vistaRegistrarPersona;
    private RegistrarPersonaModel modeloRegistrarPersona;
    private RegistrarPersonaController controladorRegistrarPersona;
    private MostrarPersonaView vistaMostrarPersona;
    private MostrarPersonaController controladorMostrarPersona;
    private MostrarPersonaModel modeloMostrarPersona;
    
    public PrincipalController(PrincipalView vista, PrincipalModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        vista.setVisible(true);
        this.vista.addBtonRegistrarPersonaListener(new abrirVentana());
        this.vista.addBtonMostrarPersonaListener(new abrirVentana());
    }
    
    class abrirVentana implements ActionListener{ 

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("Registrar Persona")){
                vistaRegistrarPersona = new RegistrarPersonaView();
                modeloRegistrarPersona = new RegistrarPersonaModel(modelo);
                controladorRegistrarPersona = new RegistrarPersonaController(vistaRegistrarPersona, modeloRegistrarPersona);
            }
 
            if(e.getActionCommand().equalsIgnoreCase("Mostrar Personas")){
                vistaMostrarPersona = new MostrarPersonaView();
                modeloMostrarPersona = new MostrarPersonaModel(modelo);
                controladorMostrarPersona = new MostrarPersonaController(vistaMostrarPersona, modeloMostrarPersona);
            }
        }   
    }
}
