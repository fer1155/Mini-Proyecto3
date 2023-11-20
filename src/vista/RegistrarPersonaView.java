package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class RegistrarPersonaView extends JFrame {

    private JLayeredPane layeredPane;
    private JPanel panel;
    private ImageIcon imagenFondo;
    private JLabel titulo;
    private JLabel fechaNacimiento;
    private JLabel nombre;
    private JLabel tipoPersona;
    private JLabel numeroID;
    private JLabel direccion;
    private JLabel telefono;
    private JTextField cajaTextoNombre;
    private JTextField cajaTextoId;
    private JTextField cajaTextoFechaDeNacimiento;
    private JTextField cajaTextoDireccion;
    private JTextField cajaTextoTelefono1;
    private JComboBox<String> comboBoxTipoDeTelefono1;
    private JComboBox<String> comboBoxTipoDePersona;
    private JButton botonRegistrar;
    private JButton botonCerrar;
    private ImageIcon imgMasTelefonos;
    private JLabel etiquetaMasTelefonos;
    private JTextField cajaTextoTelefono2;
    private JComboBox<String> comboBoxTipoDeTelefono2;
    private JTextField cajaTextoTelefono3;
    private JComboBox<String> comboBoxTipoDeTelefono3;
    private ImageIcon imgMenosTelefonos;
    private JLabel etiquetaMenosTelefonos;
    private JTextField cajaTextoDireccion2;
    private ImageIcon imgMasDirecciones;
    private JLabel etiquetaMasDirecciones;
    private ImageIcon imgMenosDirecciones;
    private JLabel etiquetaMenosDirecciones;
    
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
        establecerTextoTipoDePersona();
        establecerTextoFechaDeNacimiento();
        establecerTextoNumeroID();
        establecerTextoNombre();
        establecerTextoDireccion();
        establecerTextoNumero();
        establecerCajaDeTextoNombre();
        establecerCajaDeTextoId();
        establecerCajaDeTextoFechaDeNacimiento();
        establecerCajaDeTextoDireccion();
        establecerCajaDeTextoDireccion2();
        establecerBotonMasDirecciones();
        establecerBotonMenosDirecciones();
        establecerCajaDeTextoTelefono1();
        establecerComboBoxDeTipoDeTelefono1();
        establecerCajaDeTextoTelefono2();
        establecerComboBoxDeTipoDeTelefono2();
        establecerCajaDeTextoTelefono3();
        establecerComboBoxDeTipoDeTelefono3();
        establecerBotonMasTelefonos();
        establecerBotonMenosTelefonos();
        establecerComboBoxDeTipoDePersona();
        establecerBtonRegistrar();
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
    
    public JPanel obtenerPanel() {
        return panel;
    }

    private void establecerFondo() {
        imagenFondo = new ImageIcon("FondoRegistrar.png");
        JLabel etiquetaFondo = new JLabel();
        etiquetaFondo.setBounds(0, 0, this.getWidth(), this.getHeight());
        etiquetaFondo.setIcon(new ImageIcon(imagenFondo.getImage().getScaledInstance(etiquetaFondo.getWidth(), etiquetaFondo.getHeight(), Image.SCALE_SMOOTH)));
        layeredPane.add(etiquetaFondo, JLayeredPane.PALETTE_LAYER);
    }
        
    private void establecerTitulo() {
        titulo = new JLabel("Agregue los datos de la persona a registrar");
        titulo.setBounds(175, 10, 530, 120);
        Color colorLetra = new Color(255, 255, 255);
        titulo.setForeground(colorLetra);
        titulo.setFont(new Font("Bernard MT Condensed", 1, 30));
        layeredPane.add(titulo, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerTextoTipoDePersona() {
        tipoPersona = new JLabel("Tipo de persona:");
        tipoPersona.setBounds(150, 80, 530, 120);
        Color colorLetra = new Color(255, 255, 255);
        tipoPersona.setForeground(colorLetra);
        tipoPersona.setFont(new Font("Bookman Old Style", 1, 18));
        layeredPane.add(tipoPersona, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerTextoFechaDeNacimiento() {
        fechaNacimiento = new JLabel("Fecha de nacimiento:");
        fechaNacimiento.setBounds(150, 135, 530, 120);
        Color colorLetra = new Color(255, 255, 255);
        fechaNacimiento.setForeground(colorLetra);
        fechaNacimiento.setFont(new Font("Bookman Old Style", 1, 18));
        layeredPane.add(fechaNacimiento, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerTextoNumeroID() {
        numeroID = new JLabel("Número de ID:");
        numeroID.setBounds(150, 185, 530, 120);
        Color colorLetra = new Color(255, 255, 255);
        numeroID.setForeground(colorLetra);
        numeroID.setFont(new Font("Bookman Old Style", 1, 18));
        layeredPane.add(numeroID, JLayeredPane.MODAL_LAYER);    
    }
    
     private void establecerTextoNombre() {
        nombre = new JLabel("Nombre completo:");
        nombre.setBounds(150, 235, 530, 120);
        Color colorLetra = new Color(255, 255, 255);
        nombre.setForeground(colorLetra);
        nombre.setFont(new Font("Bookman Old Style", 1, 18));
        layeredPane.add(nombre, JLayeredPane.MODAL_LAYER);    
    }
     
     private void establecerTextoDireccion() {
        direccion = new JLabel("Dirección(es):");
        direccion.setBounds(150, 285, 530, 120);
        Color colorLetra = new Color(255, 255, 255);
        direccion.setForeground(colorLetra);
        direccion.setFont(new Font("Bookman Old Style", 1, 18));
        layeredPane.add(direccion, JLayeredPane.MODAL_LAYER);    
    }
     
     private void establecerTextoNumero() {
        telefono = new JLabel("Número de teléfono(s):");
        telefono.setBounds(150, 335, 530, 120);
        Color colorLetra = new Color(255, 255, 255);
        telefono.setForeground(colorLetra);
        telefono.setFont(new Font("Bookman Old Style", 1, 18));
        layeredPane.add(telefono, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerCajaDeTextoNombre() {
        cajaTextoNombre = new JTextField();
        cajaTextoNombre.setBounds(370, 280, 140, 30);
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
        cajaTextoId.setBounds(370, 230, 140, 30);
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
        cajaTextoFechaDeNacimiento.setBounds(370, 180, 140, 30);
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
        cajaTextoDireccion.setBounds(370, 330, 140, 30);
        cajaTextoDireccion.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoDireccion.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoDireccion, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoDireccion(){
        return cajaTextoDireccion.getText();
    }
    
    private void establecerCajaDeTextoDireccion2() {
        cajaTextoDireccion2 = new JTextField();
        cajaTextoDireccion2.setBounds(540, 330, 140, 30);
        cajaTextoDireccion2.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoDireccion2.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoDireccion2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoDireccion2(){
        return cajaTextoDireccion2.getText();
    }
    
    private void establecerBotonMasDirecciones() {
        imgMasDirecciones = new ImageIcon("mas.png");
        etiquetaMasDirecciones = new JLabel();
        etiquetaMasDirecciones.setBounds(513, 332, 20, 20);
        etiquetaMasDirecciones.setIcon(new ImageIcon(imgMasDirecciones.getImage().getScaledInstance(etiquetaMasDirecciones.getWidth(), etiquetaMasDirecciones.getHeight(), Image.SCALE_SMOOTH)));
        layeredPane.add(etiquetaMasDirecciones, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtnMasDireccionesListener(MouseListener listenControl){
        etiquetaMasDirecciones.addMouseListener(listenControl);
    }
    
    private void establecerBotonMenosDirecciones() {
        imgMenosDirecciones = new ImageIcon("menoss.png");
        etiquetaMenosDirecciones = new JLabel();
        etiquetaMenosDirecciones.setBounds(688, 335, 20, 20);
        etiquetaMenosDirecciones.setIcon(new ImageIcon(imgMenosDirecciones.getImage().getScaledInstance(etiquetaMenosDirecciones.getWidth(), etiquetaMenosDirecciones.getHeight(), Image.SCALE_SMOOTH)));
        layeredPane.add(etiquetaMenosDirecciones, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtnMenosDireccionesListener(MouseListener listenControl){
        etiquetaMenosDirecciones.addMouseListener(listenControl);
    }
    
    public void mostrarMasDirecciones(boolean estado){
        cajaTextoDireccion2.setEnabled(estado);
        cajaTextoDireccion2.setVisible(estado);
        etiquetaMenosDirecciones.setEnabled(estado);
        etiquetaMenosDirecciones.setVisible(estado);
    }
    
    private void establecerCajaDeTextoTelefono1() {
        cajaTextoTelefono1 = new JTextField();
        cajaTextoTelefono1.setBounds(370, 380, 120, 30);
        cajaTextoTelefono1.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoTelefono1.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoTelefono1, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoTelefono1(){
        return cajaTextoTelefono1.getText();
    }
    
    private void establecerComboBoxDeTipoDeTelefono1(){
        String[] opciones = {"", "MOVIL", "CASA", "OFICINA"};
        comboBoxTipoDeTelefono1 = new JComboBox<>(opciones);
        comboBoxTipoDeTelefono1.setBounds(370, 420, 120, 30);
        layeredPane.add(comboBoxTipoDeTelefono1, JLayeredPane.MODAL_LAYER);
    }
    
    public String getComboBoxTipoDeTelefono1(){
        return (String) comboBoxTipoDeTelefono1.getSelectedItem();
    }
    
    private void establecerCajaDeTextoTelefono2() {
        cajaTextoTelefono2 = new JTextField();
        cajaTextoTelefono2.setBounds(520, 380, 120, 30);
        cajaTextoTelefono2.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoTelefono2.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoTelefono2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoTelefono2(){
        return cajaTextoTelefono2.getText();
    }
    
    private void establecerComboBoxDeTipoDeTelefono2(){
        String[] opciones = {"", "MOVIL", "CASA", "OFICINA"};
        comboBoxTipoDeTelefono2 = new JComboBox<>(opciones);
        comboBoxTipoDeTelefono2.setBounds(520, 420, 120, 30);
        layeredPane.add(comboBoxTipoDeTelefono2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getComboBoxTipoDeTelefono2(){
        return (String) comboBoxTipoDeTelefono2.getSelectedItem();
    }
    
    private void establecerCajaDeTextoTelefono3() {
        cajaTextoTelefono3 = new JTextField();
        cajaTextoTelefono3.setBounds(650, 380, 120, 30);
        cajaTextoTelefono3.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoTelefono3.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoTelefono3, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoTelefono3(){
        return cajaTextoTelefono3.getText();
    }
    
    private void establecerComboBoxDeTipoDeTelefono3(){
        String[] opciones = {"", "MOVIL", "CASA", "OFICINA"};
        comboBoxTipoDeTelefono3 = new JComboBox<>(opciones);
        comboBoxTipoDeTelefono3.setBounds(650, 420, 120, 30);
        layeredPane.add(comboBoxTipoDeTelefono3, JLayeredPane.MODAL_LAYER);
    }
    
    public String getComboBoxTipoDeTelefono3(){
        return (String) comboBoxTipoDeTelefono3.getSelectedItem();
    }
    
    private void establecerBotonMasTelefonos() {
        imgMasTelefonos = new ImageIcon("mas.png");
        etiquetaMasTelefonos = new JLabel();
        etiquetaMasTelefonos.setBounds(495, 385, 20, 20);
        etiquetaMasTelefonos.setIcon(new ImageIcon(imgMasTelefonos.getImage().getScaledInstance(etiquetaMasTelefonos.getWidth(), etiquetaMasTelefonos.getHeight(), Image.SCALE_SMOOTH)));
        layeredPane.add(etiquetaMasTelefonos, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtnMasTelefonosListener(MouseListener listenControl){
        etiquetaMasTelefonos.addMouseListener(listenControl);
    }
    
    private void establecerBotonMenosTelefonos() {
        imgMenosTelefonos = new ImageIcon("menoss.png");
        etiquetaMenosTelefonos = new JLabel();
        etiquetaMenosTelefonos.setBounds(778, 385, 20, 20);
        etiquetaMenosTelefonos.setIcon(new ImageIcon(imgMenosTelefonos.getImage().getScaledInstance(etiquetaMenosTelefonos.getWidth(), etiquetaMenosTelefonos.getHeight(), Image.SCALE_SMOOTH)));
        layeredPane.add(etiquetaMenosTelefonos, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtnMenosTelefonosListener(MouseListener listenControl){
        etiquetaMenosTelefonos.addMouseListener(listenControl);
    }
    
    public void mostrarMasTelefonos(boolean estado){
        cajaTextoTelefono2.setEnabled(estado);
        cajaTextoTelefono2.setVisible(estado);
        comboBoxTipoDeTelefono2.setEnabled(estado);
        comboBoxTipoDeTelefono2.setVisible(estado);
        cajaTextoTelefono3.setEnabled(estado);
        cajaTextoTelefono3.setVisible(estado);
        comboBoxTipoDeTelefono3.setEnabled(estado);
        comboBoxTipoDeTelefono3.setVisible(estado);
        etiquetaMenosTelefonos.setEnabled(estado);
        etiquetaMenosTelefonos.setVisible(estado);
    }
    
    private void establecerComboBoxDeTipoDePersona(){
        String[] opciones = {"","ESTUDIANTE", "PROFESOR", "EMPLEADO"};
        comboBoxTipoDePersona = new JComboBox<>(opciones);
        comboBoxTipoDePersona.setBounds(370, 120, 160, 40);
        layeredPane.add(comboBoxTipoDePersona, JLayeredPane.MODAL_LAYER);
    }
    
    public String getComboBoxTipoDePersona(){
        return (String) comboBoxTipoDePersona.getSelectedItem();
    }
    
    private void establecerBtonRegistrar() {
        botonRegistrar = new JButton("Registrar");
        botonRegistrar.setFocusPainted(false);
        botonRegistrar.setBounds(480, 490, 120, 40);  
        botonRegistrar.setForeground(Color.BLACK);
        botonRegistrar.setFont(new Font("Bernard MT Condensed", 0, 22));
        Color colorFondoBtn = new Color(99, 203, 249);
        botonRegistrar.setBackground(colorFondoBtn);
        Color colorBorde = new Color(94, 94, 94);
        botonRegistrar.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonRegistrar, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonRegistrarListener(ActionListener listenControl){
        botonRegistrar.addActionListener(listenControl);
    }
    
    private void establecerBtonCerrar() {
        botonCerrar = new JButton("Cerrar");
        botonCerrar.setFocusPainted(false);
        botonCerrar.setBounds(275, 490, 120, 40);  
        botonCerrar.setForeground(Color.BLACK);
        botonCerrar.setFont(new Font("Bernard MT Condensed", 0, 22));
        Color colorFondoBtn = new Color(242, 68, 68);
        botonCerrar.setBackground(colorFondoBtn);
        Color colorBorde = new Color(94, 94, 94);
        botonCerrar.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonCerrar, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonCerrarListener(ActionListener listenControl){
        botonCerrar.addActionListener(listenControl);
    }
    
    public void limpiarCampos(){
        cajaTextoNombre.setText("");
        cajaTextoId.setText("");
        cajaTextoFechaDeNacimiento.setText("");
        cajaTextoDireccion.setText("");
        cajaTextoDireccion2.setText("");
        cajaTextoTelefono1.setText("");
        comboBoxTipoDeTelefono1.setSelectedItem("");
        cajaTextoTelefono2.setText("");
        comboBoxTipoDeTelefono2.setSelectedItem("");
        cajaTextoTelefono3.setText("");
        comboBoxTipoDeTelefono3.setSelectedItem("");
        comboBoxTipoDePersona.setSelectedItem("");
    }
}
