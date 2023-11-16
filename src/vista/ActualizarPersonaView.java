package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ActualizarPersonaView extends JFrame{
    private JLayeredPane layeredPane;
    private JPanel panel;
    private ImageIcon imagenFondo;
    private JLabel texto;
    private JButton botonCerrar;
    private JButton botonBuscar;
    private JTextField cajaTextoIdV1;
    
    //Constructor de la ventana Actualizar Persona
    public ActualizarPersonaView(){
        this.setTitle("Directorio");
        this.setBounds(200, 50, 900, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        establecerLayeredPanel();
        establecerPanel();
        establecerFondo();
        establecerTextoV1();
        establecerCajaDeTextoIdV1();
        establecerBtonBuscarV1();
        establecerBtonCerrarV1();
    }
    
    private void establecerLayeredPanel() {
        layeredPane = new JLayeredPane();
        this.add(layeredPane);
    }
    
    private void establecerPanel() {
        panel = new JPanel();
        panel.setBounds(0, 0, this.getWidth(), this.getHeight());
        panel.setLayout(null);
        layeredPane.add(panel, JLayeredPane.DEFAULT_LAYER);
    }
    
    public JPanel obtenerPanel() {
        return panel;
    }

    private void establecerFondo() {
        imagenFondo = new ImageIcon("");
        JLabel etiquetaFondo = new JLabel();
        etiquetaFondo.setBounds(0, 0, this.getWidth(), this.getHeight());
        //etiquetaFondo.setIcon(new ImageIcon(imagenFondo.getImage().getScaledInstance(etiquetaFondo.getWidth(), etiquetaFondo.getHeight(), Image.SCALE_SMOOTH)));
        layeredPane.add(etiquetaFondo, JLayeredPane.PALETTE_LAYER);
    }
        
    private void establecerTextoV1() {
        texto = new JLabel("Directorio");
        texto.setBounds(265, 20, 530, 120);
        Color colorLetra = new Color(78, 39, 0);
        texto.setForeground(colorLetra);
        texto.setFont(new Font("Bernard MT Condensed", 1, 85));
        layeredPane.add(texto, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerCajaDeTextoIdV1() {
        cajaTextoIdV1 = new JTextField();
        cajaTextoIdV1.setBounds(100, 190, 140, 30);
        cajaTextoIdV1.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoIdV1.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoIdV1, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoIdV1(){
        return cajaTextoIdV1.getText();
    }
    
    private void establecerBtonBuscarV1() {
        botonBuscar = new JButton("Buscar");
        botonBuscar.setFocusPainted(false);
        botonBuscar.setBounds(400, 450, 230, 60);  
        botonBuscar.setForeground(Color.WHITE);
        botonBuscar.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(78, 39, 0);
        botonBuscar.setBackground(colorFondoBtn);
        Color colorBorde = new Color(94, 94, 94);
        botonBuscar.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonBuscar, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonBuscarListenerV1(ActionListener listenControl){
        botonBuscar.addActionListener(listenControl);
    }
    
    private void establecerBtonCerrarV1() {
        botonCerrar = new JButton("Cerrar");
        botonCerrar.setFocusPainted(false);
        botonCerrar.setBounds(200, 450, 230, 60);  
        botonCerrar.setForeground(Color.WHITE);
        botonCerrar.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(78, 39, 0);
        botonCerrar.setBackground(colorFondoBtn);
        Color colorBorde = new Color(94, 94, 94);
        botonCerrar.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonCerrar, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonCerrarListenerV1(ActionListener listenControl){
        botonCerrar.addActionListener(listenControl);
    }
}
