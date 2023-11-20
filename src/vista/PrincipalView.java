package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
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
        this.setBounds(200, 50, 500, 700);
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
        imagenFondo = new ImageIcon("Inicio.png");
        JLabel etiquetaFondo = new JLabel();
        etiquetaFondo.setBounds(0, 0, this.getWidth(), this.getHeight());
        etiquetaFondo.setIcon(new ImageIcon(imagenFondo.getImage().getScaledInstance(etiquetaFondo.getWidth(), etiquetaFondo.getHeight(), Image.SCALE_SMOOTH)));
        layeredPane.add(etiquetaFondo, JLayeredPane.PALETTE_LAYER);
    }
        
    private void establecerTitulo() {
        titulo = new JLabel("-- INICIO --");
        titulo.setBounds(55, 40, 400, 140);
        Color colorLetra = new Color(255, 255, 255);
        titulo.setForeground(colorLetra);
        titulo.setFont(new Font("Bauhaus 93", 1, 80));
        layeredPane.add(titulo, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerBtonRegistrarPersona() {
        botonRegistrarPersona = new JButton("Registrar Persona");
        botonRegistrarPersona.setFocusPainted(false);
        botonRegistrarPersona.setBounds(120, 200, 250, 60);  
        botonRegistrarPersona.setForeground(Color.BLACK);
        botonRegistrarPersona.setFont(new Font("Bauhaus 93", 0, 28));
        Color colorFondoBtn = new Color(255, 255, 255);
        botonRegistrarPersona.setBackground(colorFondoBtn);
        Color colorBorde = new Color(0, 0, 0);
        botonRegistrarPersona.setBorder(BorderFactory.createLineBorder(colorBorde,3,false));
        layeredPane.add(botonRegistrarPersona, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonRegistrarPersonaListener(ActionListener listenControl){
        botonRegistrarPersona.addActionListener(listenControl);
    }
    
    private void establecerBtonMostrarPersona() {
        botonMostrarPersona = new JButton("Mostrar Personas");
        botonMostrarPersona.setFocusPainted(false);
        botonMostrarPersona.setBounds(120, 400, 250, 60);  
        botonMostrarPersona.setForeground(Color.BLACK);
        botonMostrarPersona.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(255, 255, 255);
        botonMostrarPersona.setBackground(colorFondoBtn);
        Color colorBorde = new Color(0, 0, 0);
        botonMostrarPersona.setBorder(BorderFactory.createLineBorder(colorBorde,3,false));
        layeredPane.add(botonMostrarPersona, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonMostrarPersonaListener(ActionListener listenControl){
        botonMostrarPersona.addActionListener(listenControl);
    }
    
    private void establecerBtonActualizarPersona() {
        botonActualizarPersona = new JButton("Actualizar Persona");
        botonActualizarPersona.setFocusPainted(false);
        botonActualizarPersona.setBounds(120, 300, 250, 60);  
        botonActualizarPersona.setForeground(Color.BLACK);
        botonActualizarPersona.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(255, 255, 255);
        botonActualizarPersona.setBackground(colorFondoBtn);
        Color colorBorde = new Color(0, 0, 0);
        botonActualizarPersona.setBorder(BorderFactory.createLineBorder(colorBorde,3,false));
        layeredPane.add(botonActualizarPersona, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonActualizarPersonaListener(ActionListener listenControl){
        botonActualizarPersona.addActionListener(listenControl);
    }
    
    private void establecerBtonEliminarPersona() {
        botonEliminarPersona = new JButton("Eliminar Persona");
        botonEliminarPersona.setFocusPainted(false);
        botonEliminarPersona.setBounds(120, 500, 250, 60);  
        botonEliminarPersona.setForeground(Color.BLACK);
        botonEliminarPersona.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(255, 255, 255);
        botonEliminarPersona.setBackground(colorFondoBtn);
        Color colorBorde = new Color(0, 0, 0);
        botonEliminarPersona.setBorder(BorderFactory.createLineBorder(colorBorde,3,false));
        layeredPane.add(botonEliminarPersona, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonEliminarPersonaListener(ActionListener listenControl){
        botonEliminarPersona.addActionListener(listenControl);
    }
}
