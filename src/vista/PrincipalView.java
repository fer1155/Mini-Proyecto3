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

public class PrincipalView extends JFrame{
    private JLayeredPane layeredPane;
    private JPanel panel;
    private ImageIcon imagenFondo;
    private JLabel titulo;
    private JButton botonRegistrarPersona;
    private JButton botonMostrarPersona;
    private JButton botonActualizarPersona;
    private JButton botonEliminarPersona;
    
    //Constructor de la ventana Principal
    public PrincipalView(){
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
        establecerBtonRegistrarPersona();
        establecerBtonMostrarPersona();
        establecerBtonActualizarPersona();
        establecerBtonEliminarPersona();
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
    
    private void establecerBtonRegistrarPersona() {
        botonRegistrarPersona = new JButton("Registrar Persona");
        botonRegistrarPersona.setFocusPainted(false);
        botonRegistrarPersona.setBounds(550, 350, 230, 60);  
        botonRegistrarPersona.setForeground(Color.WHITE);
        botonRegistrarPersona.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(78, 39, 0);
        botonRegistrarPersona.setBackground(colorFondoBtn);
        Color colorBorde = new Color(94, 94, 94);
        botonRegistrarPersona.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonRegistrarPersona, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonRegistrarPersonaListener(ActionListener listenControl){
        botonRegistrarPersona.addActionListener(listenControl);
    }
    
    private void establecerBtonMostrarPersona() {
        botonMostrarPersona = new JButton("Mostrar Personas");
        botonMostrarPersona.setFocusPainted(false);
        botonMostrarPersona.setBounds(200, 350, 230, 60);  
        botonMostrarPersona.setForeground(Color.WHITE);
        botonMostrarPersona.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(78, 39, 0);
        botonMostrarPersona.setBackground(colorFondoBtn);
        Color colorBorde = new Color(94, 94, 94);
        botonMostrarPersona.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonMostrarPersona, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonMostrarPersonaListener(ActionListener listenControl){
        botonMostrarPersona.addActionListener(listenControl);
    }
    
    private void establecerBtonActualizarPersona() {
        botonActualizarPersona = new JButton("Actualizar Persona");
        botonActualizarPersona.setFocusPainted(false);
        botonActualizarPersona.setBounds(200, 200, 230, 60);  
        botonActualizarPersona.setForeground(Color.WHITE);
        botonActualizarPersona.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(78, 39, 0);
        botonActualizarPersona.setBackground(colorFondoBtn);
        Color colorBorde = new Color(94, 94, 94);
        botonActualizarPersona.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonActualizarPersona, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonActualizarPersonaListener(ActionListener listenControl){
        botonActualizarPersona.addActionListener(listenControl);
    }
    
    private void establecerBtonEliminarPersona() {
        botonEliminarPersona = new JButton("Eliminar Persona");
        botonEliminarPersona.setFocusPainted(false);
        botonEliminarPersona.setBounds(550, 200, 230, 60);  
        botonEliminarPersona.setForeground(Color.WHITE);
        botonEliminarPersona.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(78, 39, 0);
        botonEliminarPersona.setBackground(colorFondoBtn);
        Color colorBorde = new Color(94, 94, 94);
        botonEliminarPersona.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonEliminarPersona, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonEliminarPersonaListener(ActionListener listenControl){
        botonEliminarPersona.addActionListener(listenControl);
    }
}
