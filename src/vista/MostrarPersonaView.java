/*
Miniproyecto No. 3

Fernando Cardona - 2241381
Oscar Mario Muñoz - 2242481
Santiago Alzate   - 2242274

Grupo de FPOE: 80
*/
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
        this.setBounds(370, 80, 550, 550);
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
        imagenFondo = new ImageIcon("Fondo1.jpg");
        JLabel etiquetaFondo = new JLabel();
        etiquetaFondo.setBounds(0, 0, this.getWidth(), this.getHeight());
        etiquetaFondo.setIcon(new ImageIcon(imagenFondo.getImage().getScaledInstance(etiquetaFondo.getWidth(), etiquetaFondo.getHeight(), Image.SCALE_SMOOTH)));
        layeredPane.add(etiquetaFondo, JLayeredPane.PALETTE_LAYER);
    }
        
    private void establecerTitulo() {
        titulo = new JLabel("Mostrar Usuarios");
        titulo.setBounds(95, 20, 400, 80);
        Color colorLetra = new Color(255, 255, 255);
        titulo.setForeground(colorLetra);
        titulo.setFont(new Font("Bernard MT Condensed", 1, 55));
        layeredPane.add(titulo, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerCajaDeTextoId() {
        cajaTextoId = new JTextField();
        cajaTextoId.setBounds(90, 300, 200, 35);
        cajaTextoId.setFont(new Font("Arial", 1, 20));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoId.setBorder(BorderFactory.createLineBorder(colorBorde,4,false));
        layeredPane.add(cajaTextoId, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoId(){
        return cajaTextoId.getText();
    }
    
    private void establecerBtonBuscar() {
        botonBuscar = new JButton("Buscar");
        botonBuscar.setFocusPainted(false);
        botonBuscar.setBounds(310, 290, 120, 50);  
        botonBuscar.setForeground(Color.BLACK);
        botonBuscar.setFont(new Font("Segoe UI Symbol", 1, 20));
        Color colorFondoBtn = new Color(255, 255, 255);
        botonBuscar.setBackground(colorFondoBtn);
        Color colorBorde = new Color(94, 94, 94);
        botonBuscar.setBorder(BorderFactory.createLineBorder(colorBorde,3,false));
        layeredPane.add(botonBuscar, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonBuscarListener(ActionListener listenControl){
        botonBuscar.addActionListener(listenControl);
    }
    
    private void establecerBtonMostrarPersonas() {
        botonMostrarPersonas = new JButton("Mostrar todas las personas");
        botonMostrarPersonas.setFocusPainted(false);
        botonMostrarPersonas.setBounds(130, 140, 280, 55);  
        botonMostrarPersonas.setForeground(Color.BLACK);
        botonMostrarPersonas.setFont(new Font("Segoe UI Symbol", 1, 20));
        Color colorFondoBtn = new Color(255, 255, 255);
        botonMostrarPersonas.setBackground(colorFondoBtn);
        Color colorBorde = new Color(94, 94, 94);
        botonMostrarPersonas.setBorder(BorderFactory.createLineBorder(colorBorde,3,false));
        layeredPane.add(botonMostrarPersonas, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonMostrarPersonasListener(ActionListener listenControl){
        botonMostrarPersonas.addActionListener(listenControl);
    }
    
    private void establecerBtonMostrarPersona() {
        botonMostrarPersona = new JButton("Mostrar persona por ID");
        botonMostrarPersona.setFocusPainted(false);
        botonMostrarPersona.setBounds(150, 210, 240, 55);  
        botonMostrarPersona.setForeground(Color.BLACK);
        botonMostrarPersona.setFont(new Font("Segoe UI Symbol", 1, 20));
        Color colorFondoBtn = new Color(255, 255, 255);
        botonMostrarPersona.setBackground(colorFondoBtn);
        Color colorBorde = new Color(94, 94, 94);
        botonMostrarPersona.setBorder(BorderFactory.createLineBorder(colorBorde,3,false));
        layeredPane.add(botonMostrarPersona, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonMostrarPersonaListener(ActionListener listenControl){
        botonMostrarPersona.addActionListener(listenControl);
    }
    
    private void establecerBtonCerrar() {
        botonCerrar = new JButton("Cerrar");
        botonCerrar.setFocusPainted(false);
        botonCerrar.setBounds(210, 380, 120, 50);  
        botonCerrar.setForeground(Color.BLACK);
        botonCerrar.setFont(new Font("Segoe UI Symbol", 1, 20));
        Color colorFondoBtn = new Color(255, 255, 255);
        botonCerrar.setBackground(colorFondoBtn);
        Color colorBorde = new Color(94, 94, 94);
        botonCerrar.setBorder(BorderFactory.createLineBorder(colorBorde,3,false));
        layeredPane.add(botonCerrar, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonCerrarListener(ActionListener listenControl){
        botonCerrar.addActionListener(listenControl);
    }
    
    public JPanel ventanaEmergente(String textoAMostrar){
        JPanel panelVentanaEmergente = new JPanel();
        JTextArea textArea = new JTextArea(textoAMostrar);
        textArea.setColumns(30);
        textArea.setRows(30);
        textArea.setEnabled(false);
        textArea.setDisabledTextColor(Color.BLACK);
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
        cajaTextoId.setText("");
    }
    
}
