package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import modelo.Persona;

public class MostrarPersonaView extends JFrame{
    
    private JLayeredPane layeredPane;
    private JPanel panel;
    private ImageIcon imagenFondo;
    private JLabel titulo;
    private JButton botonMostrarPersona;
    private JButton botonMostrarPersonas;
    private JButton botonCerrar;
    private JTextField cajaTextoId;
    private JLabel textPrueba;
    private JButton botonBuscar;
    
    //Constructor de la ventana Mostrar Personas
    public MostrarPersonaView(){
        this.setTitle("Buscar Usuario");
        this.setBounds(200, 50, 900, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        establecerLayeredPanel();
        establecerPanel();
        establecerFondo();
        establecerTitulo();
        establecerCajaDeTextoId();
        establecerBtonBuscar();
        establecerBtonMostrarPersonas();
        establecerBtonMostrarPersona();
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
        imagenFondo = new ImageIcon("Fondo 5.jpg");
        JLabel etiquetaFondo = new JLabel();
        etiquetaFondo.setBounds(0, 0, this.getWidth(), this.getHeight());
        etiquetaFondo.setIcon(new ImageIcon(imagenFondo.getImage().getScaledInstance(etiquetaFondo.getWidth(), etiquetaFondo.getHeight(), Image.SCALE_SMOOTH)));
        layeredPane.add(etiquetaFondo, JLayeredPane.PALETTE_LAYER);
    }
        
    private void establecerTitulo() {
        titulo = new JLabel("Buscar Usuarios");
        titulo.setBounds(320, 20, 260, 80);
        Color colorLetra = new Color(255, 255, 255);
        titulo.setForeground(colorLetra);
        titulo.setFont(new Font("Bernard MT Condensed", 1, 40));
        layeredPane.add(titulo, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerCajaDeTextoId() {
        cajaTextoId = new JTextField();
        cajaTextoId.setBounds(300, 240, 300, 45);
        cajaTextoId.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoId.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoId, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoId(){
        return cajaTextoId.getText();
    }
    
    private void establecerBtonBuscar() {
        botonBuscar = new JButton("Buscar");
        botonBuscar.setFocusPainted(false);
        botonBuscar.setBounds(550, 320, 200, 60);  
        botonBuscar.setForeground(Color.BLACK);
        botonBuscar.setFont(new Font("Bernard MT Condensed", 0, 25));
        Color colorFondoBtn = new Color(255, 255, 255);
        botonBuscar.setBackground(colorFondoBtn);
        Color colorBorde = new Color(0, 0, 0);
        botonBuscar.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonBuscar, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonBuscarListener(ActionListener listenControl){
        botonBuscar.addActionListener(listenControl);
    }
    
    private void establecerBtonMostrarPersonas() {
        botonMostrarPersonas = new JButton("Mostrar todas las persona");
        botonMostrarPersonas.setFocusPainted(false);
        botonMostrarPersonas.setBounds(500, 150, 300, 60);  
        botonMostrarPersonas.setForeground(Color.BLACK);
        botonMostrarPersonas.setFont(new Font("Bernard MT Condensed", 0, 25));
        Color colorFondoBtn = new Color(255, 255, 255);
        botonMostrarPersonas.setBackground(colorFondoBtn);
        Color colorBorde = new Color(0, 0, 0);
        botonMostrarPersonas.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonMostrarPersonas, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonMostrarPersonasListener(ActionListener listenControl){
        botonMostrarPersonas.addActionListener(listenControl);
    }
    
    private void establecerBtonMostrarPersona() {
        botonMostrarPersona = new JButton("Buscar persona individualmente");
        botonMostrarPersona.setFocusPainted(false);
        botonMostrarPersona.setBounds(100, 150, 300, 60);  
        botonMostrarPersona.setForeground(Color.BLACK);
        botonMostrarPersona.setFont(new Font("Bernard MT Condensed", 0, 25));
        Color colorFondoBtn = new Color(255, 255, 255);
        botonMostrarPersona.setBackground(colorFondoBtn);
        Color colorBorde = new Color(0, 0, 0);
        botonMostrarPersona.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonMostrarPersona, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonMostrarPersonaListener(ActionListener listenControl){
        botonMostrarPersona.addActionListener(listenControl);
    }
    
    private void establecerBtonCerrar() {
        botonCerrar = new JButton("Cerrar");
        botonCerrar.setFocusPainted(false);
        botonCerrar.setBounds(150, 320, 200, 60);  
        botonCerrar.setForeground(Color.BLACK);
        botonCerrar.setFont(new Font("Bernard MT Condensed", 0, 25));
        Color colorFondoBtn = new Color(255, 255, 255);
        botonCerrar.setBackground(colorFondoBtn);
        Color colorBorde = new Color(0, 0, 0);
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
    
    public void mostrarCampos(boolean estado){
        cajaTextoId.setEnabled(estado);
        cajaTextoId.setVisible(estado);
        botonBuscar.setEnabled(estado);
        botonBuscar.setVisible(estado);
    }
    
    public void limpiarCampos(){
        cajaTextoId.setText(" ");
    }
    
    private void establecerTextoPrueba() {
        textPrueba = new JLabel();
        textPrueba.setBounds(350, 200, 530, 120);
        Color colorLetra = new Color(255, 255, 255);
        textPrueba.setForeground(colorLetra);
        textPrueba.setFont(new Font("Bernard MT Condensed", 1, 20));
        layeredPane.add(textPrueba, JLayeredPane.MODAL_LAYER);    
    }
    
    public void setCajaDeTextoPrueba(String texto){
        textPrueba.setText(texto);
    }
}
