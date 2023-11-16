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
    private JLabel textoV2;
    private JTextField cajaTextoNombreV2;
    private JTextField cajaTextoIdV2;
    private JTextField cajaTextoFechaDeNacimientoV2;
    private JTextField cajaTextoDireccionV2;
    private JTextField cajaTextoTelefonoV2;
    private JComboBox<String> comboBoxTipoDeTelefonoV2;
    private JComboBox<String> comboBoxTipoDePersonaV2;
    private JButton botonActualizar;
    private JButton botonAtras;
    
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
        establecerTextoV2();
        establecerCajaDeTextoNombreV2();
        establecerCajaDeTextoIdV2();
        establecerCajaDeTextoFechaDeNacimientoV2();
        establecerCajaDeTextoDireccionV2();
        establecerCajaDeTextoTelefonoV2();
        establecerComboBoxDeTipoDeTelefonoV2();
        establecerComboBoxDeTipoDePersonaV2();
        establecerBtonActualizarV2(); 
        establecerBtonAtras();
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
    
    public void mostrarComponentesV1(boolean estado){
        texto.setEnabled(estado);
        texto.setVisible(estado);
        botonCerrar.setEnabled(estado);
        botonCerrar.setVisible(estado);
        botonBuscar.setEnabled(estado);
        botonBuscar.setVisible(estado);
        cajaTextoIdV1.setEnabled(estado);
        cajaTextoIdV1.setVisible(estado);
    }
    
    private void establecerTextoV2() {
        textoV2 = new JLabel("Directorio");
        textoV2.setBounds(265, 20, 530, 120);
        Color colorLetra = new Color(78, 39, 0);
        textoV2.setForeground(colorLetra);
        textoV2.setFont(new Font("Bernard MT Condensed", 1, 85));
        layeredPane.add(textoV2, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerCajaDeTextoNombreV2() {
        cajaTextoNombreV2 = new JTextField();
        cajaTextoNombreV2.setBounds(100, 150, 140, 30);
        cajaTextoNombreV2.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoNombreV2.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoNombreV2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoNombreV2(){
        return cajaTextoNombreV2.getText();
    }
   
    private void establecerCajaDeTextoIdV2() {
        cajaTextoIdV2 = new JTextField();
        cajaTextoIdV2.setBounds(100, 190, 140, 30);
        cajaTextoIdV2.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoIdV2.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoIdV2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoIdV2(){
        return cajaTextoIdV2.getText();
    }
    
    private void establecerCajaDeTextoFechaDeNacimientoV2() {
        cajaTextoFechaDeNacimientoV2= new JTextField();
        cajaTextoFechaDeNacimientoV2.setBounds(100, 230, 140, 30);
        cajaTextoFechaDeNacimientoV2.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoFechaDeNacimientoV2.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoFechaDeNacimientoV2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoFechaDeNacimientoV2(){
        return cajaTextoFechaDeNacimientoV2.getText();
    }
    
    private void establecerCajaDeTextoDireccionV2() {
        cajaTextoDireccionV2 = new JTextField();
        cajaTextoDireccionV2.setBounds(100, 270, 140, 30);
        cajaTextoDireccionV2.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoDireccionV2.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoDireccionV2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoDireccionV2(){
        return cajaTextoDireccionV2.getText();
    }
    
    private void establecerCajaDeTextoTelefonoV2() {
        cajaTextoTelefonoV2 = new JTextField();
        cajaTextoTelefonoV2.setBounds(100, 310, 140, 30);
        cajaTextoTelefonoV2.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoTelefonoV2.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoTelefonoV2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoTelefonoV2(){
        return cajaTextoTelefonoV2.getText();
    }
    
    private void establecerComboBoxDeTipoDeTelefonoV2(){
        String[] opciones = {"", "MOVIL", "CASA", "OFICINA"};
        comboBoxTipoDeTelefonoV2 = new JComboBox<>(opciones);
        comboBoxTipoDeTelefonoV2.setBounds(350, 310, 230, 40);
        layeredPane.add(comboBoxTipoDeTelefonoV2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getComboBoxTipoDeTelefonoV2(){
        return (String) comboBoxTipoDeTelefonoV2.getSelectedItem();
    }
    
    private void establecerComboBoxDeTipoDePersonaV2(){
        String[] opciones = {"","ESTUDIANTE", "PROFESOR", "EMPLEADO"};
        comboBoxTipoDePersonaV2 = new JComboBox<>(opciones);
        comboBoxTipoDePersonaV2.setBounds(550, 250, 230, 40);
        layeredPane.add(comboBoxTipoDePersonaV2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getComboBoxTipoDePersonaV2(){
        return (String) comboBoxTipoDePersonaV2.getSelectedItem();
    }
    
    private void establecerBtonActualizarV2() {
        botonActualizar = new JButton("Actualizar");
        botonActualizar.setFocusPainted(false);
        botonActualizar.setBounds(550, 450, 230, 60);  
        botonActualizar.setForeground(Color.WHITE);
        botonActualizar.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(78, 39, 0);
        botonActualizar.setBackground(colorFondoBtn);
        Color colorBorde = new Color(94, 94, 94);
        botonActualizar.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonActualizar, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonActualizarListener(ActionListener listenControl){
        botonActualizar.addActionListener(listenControl);
    }
    
    private void establecerBtonAtras() {
        botonAtras = new JButton("Atras");
        botonAtras.setFocusPainted(false);
        botonAtras.setBounds(200, 450, 230, 60);  
        botonAtras.setForeground(Color.WHITE);
        botonAtras.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(78, 39, 0);
        botonAtras.setBackground(colorFondoBtn);
        Color colorBorde = new Color(94, 94, 94);
        botonAtras.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonAtras, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonAtrasListener(ActionListener listenControl){
        botonAtras.addActionListener(listenControl);
    }
    
    public void mostrarComponentesV2(boolean estado){
        textoV2.setEnabled(estado);
        textoV2.setVisible(estado);
        cajaTextoNombreV2.setEnabled(estado);
        cajaTextoNombreV2.setVisible(estado);
        cajaTextoIdV2.setEnabled(estado);
        cajaTextoIdV2.setVisible(estado);
        cajaTextoFechaDeNacimientoV2.setEnabled(estado);
        cajaTextoFechaDeNacimientoV2.setVisible(estado);
        cajaTextoDireccionV2.setEnabled(estado);
        cajaTextoDireccionV2.setVisible(estado);
        cajaTextoTelefonoV2.setEnabled(estado);
        cajaTextoTelefonoV2.setVisible(estado);
        comboBoxTipoDeTelefonoV2.setEnabled(estado);
        comboBoxTipoDeTelefonoV2.setVisible(estado);
        comboBoxTipoDePersonaV2.setEnabled(estado);
        comboBoxTipoDePersonaV2.setVisible(estado);
        botonActualizar.setEnabled(estado);
        botonActualizar.setVisible(estado);
        botonAtras.setEnabled(estado);
        botonAtras.setVisible(estado);
    }
}