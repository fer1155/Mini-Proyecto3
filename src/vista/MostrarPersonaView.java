package vista;

import java.awt.Color;
import java.awt.Font;
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
    private JTextField cajaTextoNombre;
    private JTextField cajaTextoId;
    private JTextField cajaTextoFechaDeNacimiento;
    private JTextField cajaTextoDireccion;
    private JTextField cajaTextoTelefono;
    private JComboBox<String> comboBoxTipoDeTelefono;
    private JComboBox<String> comboBoxTipoDePersona;
    private JLabel textPrueba;
    private JButton botonBuscar;
    
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
        establecerCajaDeTextoNombre();
        establecerCajaDeTextoId();
        establecerCajaDeTextoFechaDeNacimiento();
        establecerCajaDeTextoDireccion();
        establecerCajaDeTextoTelefono();
        establecerComboBoxDeTipoDeTelefono();
        establecerComboBoxDeTipoDePersona();
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
        cajaTextoNombre.setBounds(100, 150, 140, 30);
        cajaTextoNombre.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoNombre.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoNombre, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoNombre(){
        return cajaTextoNombre.getText();
    }
    
    private void establecerCajaDeTextoId() {
        cajaTextoId = new JTextField();
        cajaTextoId.setBounds(100, 190, 140, 30);
        cajaTextoId.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoId.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoId, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoId(){
        return cajaTextoId.getText();
    }
    
    private void establecerCajaDeTextoFechaDeNacimiento() {
        cajaTextoFechaDeNacimiento= new JTextField();
        cajaTextoFechaDeNacimiento.setBounds(100, 230, 140, 30);
        cajaTextoFechaDeNacimiento.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoFechaDeNacimiento.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoFechaDeNacimiento, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoFechaDeNacimiento(){
        return cajaTextoFechaDeNacimiento.getText();
    }
    
    private void establecerCajaDeTextoDireccion() {
        cajaTextoDireccion= new JTextField();
        cajaTextoDireccion.setBounds(100, 270, 140, 30);
        cajaTextoDireccion.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoDireccion.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoDireccion, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoDireccion(){
        return cajaTextoDireccion.getText();
    }
    
    private void establecerCajaDeTextoTelefono() {
        cajaTextoTelefono= new JTextField();
        cajaTextoTelefono.setBounds(100, 310, 140, 30);
        cajaTextoTelefono.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoTelefono.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoTelefono, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoTelefono(){
        return cajaTextoTelefono.getText();
    }
    
    private void establecerComboBoxDeTipoDeTelefono(){
        String[] opciones = {"", "MOVIL", "CASA", "OFICINA"};
        comboBoxTipoDeTelefono = new JComboBox<>(opciones);
        comboBoxTipoDeTelefono.setBounds(350, 310, 230, 40);
        layeredPane.add(comboBoxTipoDeTelefono, JLayeredPane.MODAL_LAYER);
    }
    
    public String getComboBoxTipoDeTelefono(){
        return (String) comboBoxTipoDeTelefono.getSelectedItem();
    }
    
    private void establecerComboBoxDeTipoDePersona(){
        String[] opciones = {"","ESTUDIANTE", "PROFESOR", "EMPLEADO"};
        comboBoxTipoDePersona = new JComboBox<>(opciones);
        comboBoxTipoDePersona.setBounds(550, 250, 230, 40);
        layeredPane.add(comboBoxTipoDePersona, JLayeredPane.MODAL_LAYER);
    }
    
    public String getComboBoxTipoDePersona(){
        return (String) comboBoxTipoDePersona.getSelectedItem();
    }
    
    private void establecerBtonBuscar() {
        botonBuscar = new JButton("Buscar");
        botonBuscar.setFocusPainted(false);
        botonBuscar.setBounds(550, 150, 230, 60);  
        botonBuscar.setForeground(Color.WHITE);
        botonBuscar.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(78, 39, 0);
        botonBuscar.setBackground(colorFondoBtn);
        Color colorBorde = new Color(94, 94, 94);
        botonBuscar.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonBuscar, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonBuscarListener(ActionListener listenControl){
        botonBuscar.addActionListener(listenControl);
    }
    
    private void establecerBtonMostrarPersonas() {
        botonMostrarPersonas = new JButton("Mostrar todas las persona");
        botonMostrarPersonas.setFocusPainted(false);
        botonMostrarPersonas.setBounds(500, 450, 230, 60);  
        botonMostrarPersonas.setForeground(Color.WHITE);
        botonMostrarPersonas.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(78, 39, 0);
        botonMostrarPersonas.setBackground(colorFondoBtn);
        Color colorBorde = new Color(94, 94, 94);
        botonMostrarPersonas.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonMostrarPersonas, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonMostrarPersonasListener(ActionListener listenControl){
        botonMostrarPersonas.addActionListener(listenControl);
    }
    
    private void establecerBtonMostrarPersona() {
        botonMostrarPersona = new JButton("Buscar persona individualmente");
        botonMostrarPersona.setFocusPainted(false);
        botonMostrarPersona.setBounds(500, 380, 230, 60);  
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
    
    public void mostrarCampos(boolean estado){
        cajaTextoNombre.setEnabled(estado);
        cajaTextoNombre.setVisible(estado);
        cajaTextoId.setEnabled(estado);
        cajaTextoId.setVisible(estado);
        cajaTextoFechaDeNacimiento.setEnabled(estado);
        cajaTextoFechaDeNacimiento.setVisible(estado);
        cajaTextoDireccion.setEnabled(estado);
        cajaTextoDireccion.setVisible(estado);
        cajaTextoTelefono.setEnabled(estado);
        cajaTextoTelefono.setVisible(estado);
        comboBoxTipoDeTelefono.setEnabled(estado);
        comboBoxTipoDeTelefono.setVisible(estado);
        comboBoxTipoDePersona.setEnabled(estado);
        comboBoxTipoDePersona.setVisible(estado);
        botonBuscar.setEnabled(estado);
        botonBuscar.setVisible(estado);
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
