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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import modelo.Persona;

public class MostrarPersonaView extends JFrame{
    
    private JLayeredPane layeredPane;
    private JPanel panel;
    private ImageIcon imagenFondo;
    private JLabel titulo;
    private JButton botonMostrarPersona;
    private JButton botonCerrar;
    private JLabel textPrueba;
    
    //Constructor de la ventana Mostrar Personas
    public MostrarPersonaView(){
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
        establecerBtonMostrarPersonas();
        establecerBtonCerrar();
        establecerTextoPrueba();
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
    
    public JPanel obtenerPanel(){
        return panel;
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
    
    private void establecerBtonMostrarPersonas() {
        botonMostrarPersona = new JButton("Mostrar todas las persona");
        botonMostrarPersona.setFocusPainted(false);
        botonMostrarPersona.setBounds(500, 450, 230, 60);  
        botonMostrarPersona.setForeground(Color.WHITE);
        botonMostrarPersona.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(78, 39, 0);
        botonMostrarPersona.setBackground(colorFondoBtn);
        Color colorBorde = new Color(94, 94, 94);
        botonMostrarPersona.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonMostrarPersona, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonMostrarPersonasListener(ActionListener listenControl){
        botonMostrarPersona.addActionListener(listenControl);
    }
    
    private void establecerBtonCerrar() {
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
    
    public void addBtonCerrarListener(ActionListener listenControl){
        botonCerrar.addActionListener(listenControl);
    }
    
    public JPanel ventanaEmergente(String textoAMostrar){
        JPanel panelVentanaEmergente = new JPanel();
        JTextArea textArea = new JTextArea(textoAMostrar);
        textArea.setColumns(30);  // Número de columnas
        textArea.setRows(30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panelVentanaEmergente.add(scrollPane);
        return panelVentanaEmergente;
    }
    
    private void establecerTextoPrueba() {
        textPrueba = new JLabel();
        textPrueba.setBounds(350, 200, 530, 120);
        Color colorLetra = new Color(78, 39, 0);
        textPrueba.setForeground(colorLetra);
        textPrueba.setFont(new Font("Bernard MT Condensed", 1, 20));
        layeredPane.add(textPrueba, JLayeredPane.MODAL_LAYER);    
    }
    
    public void setCajaDeTextoPrueba(String texto){
        textPrueba.setText(texto);
    }
}
