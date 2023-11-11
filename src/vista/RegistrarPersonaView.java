package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class RegistrarPersonaView extends JFrame {

    private JLayeredPane layeredPane;
    private JPanel panel;
    private ImageIcon imagenFondo;
    private JLabel titulo;
    private JTextField cajaTextoNombre;
    private JButton botonRegistrar;
    
    //Constructor de la ventana Registrar Personas
    public RegistrarPersonaView(){
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
        establecerTitulo();
        establecerCajaDeTextoNombre();
        establecerBtonRegistrar();
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

    private void establecerFondo() {
        imagenFondo = new ImageIcon("");
        JLabel etiquetaFondo = new JLabel();
        etiquetaFondo.setBounds(0, 0, this.getWidth(), this.getHeight());
        //etiquetaFondo.setIcon(new ImageIcon(imagenFondo.getImage().getScaledInstance(etiquetaFondo.getWidth(), etiquetaFondo.getHeight(), Image.SCALE_SMOOTH)));
        layeredPane.add(etiquetaFondo, JLayeredPane.PALETTE_LAYER);
    }
        
    private void establecerTitulo() {
        titulo = new JLabel("Directorio");
        titulo.setBounds(265, 20, 530, 120);
        Color colorLetra = new Color(78, 39, 0);
        titulo.setForeground(colorLetra);
        titulo.setFont(new Font("Bernard MT Condensed", 1, 85));
        layeredPane.add(titulo, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerCajaDeTextoNombre() {
        cajaTextoNombre = new JTextField();
        cajaTextoNombre.setBounds(265, 150, 400, 50);
        cajaTextoNombre.setFont(new Font("Centaur", 1, 28));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoNombre.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoNombre, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoNombre(){
        return cajaTextoNombre.getText();
    }
    
    private void establecerBtonRegistrar() {
        botonRegistrar = new JButton("Registrar");
        botonRegistrar.setFocusPainted(false);
        botonRegistrar.setBounds(550, 350, 230, 60);  
        botonRegistrar.setForeground(Color.WHITE);
        botonRegistrar.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(78, 39, 0);
        botonRegistrar.setBackground(colorFondoBtn);
        Color colorBorde = new Color(94, 94, 94);
        botonRegistrar.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonRegistrar, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonRegistrarListener(ActionListener listenControl){
        botonRegistrar.addActionListener(listenControl);
    }
}
