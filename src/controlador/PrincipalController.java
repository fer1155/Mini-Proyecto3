package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.PrincipalModel;
import modelo.RegistrarPersonaModel;
import vista.PrincipalView;
import vista.RegistrarPersonaView;

public class PrincipalController {

    private PrincipalView vista;
    private PrincipalModel modelo;
    private RegistrarPersonaView vistaRegistrarPersona;
    private RegistrarPersonaModel modeloRegistrarPersona;
    private RegistrarPersonaController controladorRegistrarPersona;
    
    public PrincipalController(PrincipalView vista, PrincipalModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        vista.setVisible(true);
        this.vista.addBtonRegistrarPersonaListener(new abrirVentana());
    }
    
    class abrirVentana implements ActionListener{ 

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("Registrar Persona")){
                vistaRegistrarPersona = new RegistrarPersonaView();
                modeloRegistrarPersona = new RegistrarPersonaModel(modelo);
                controladorRegistrarPersona = new RegistrarPersonaController(vistaRegistrarPersona, modeloRegistrarPersona);
                vista.dispose();
            }
 
            /*if(e.getActionCommand().equalsIgnoreCase("Jugar")){
                vistaJuego = new JuegoView();
                modeloJuego = new JuegoModel();
                controladorJuego = new JuegoController(vistaJuego, modeloJuego);
                vista.dispose();
            }*/
        }   
    }
}
