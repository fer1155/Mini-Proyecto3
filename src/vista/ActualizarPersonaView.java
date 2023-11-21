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
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ActualizarPersonaView extends JFrame{
    private JLayeredPane layeredPane;
    private JPanel panel;
    private JLabel fechaNacimiento;
    private JLabel nombre;
    private JLabel tipoPersona;
    private JLabel numeroID;
    private JLabel direccion;
    private JLabel telefono;
    private JLabel numID;
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
    private JTextField cajaTextoDireccion2V2;
    private JComboBox<String> comboBoxTipoDeTelefono2V2;
    private JTextField cajaTextoTelefono2V2;
    private JTextField cajaTextoTelefono3V2;
    private JComboBox<String> comboBoxTipoDeTelefono3V2;
    private int width;
    private int height;
    private JLabel titulo;
    
    //Constructor de la ventana Actualizar Persona
    public ActualizarPersonaView(){
        this.setTitle("Directorio");
        width = 900;
        height = 450;
        this.setBounds(200, 50,900 ,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        iniciarComponentes();
    }
    
    private void iniciarComponentes() {
        establecerLayeredPanel();
        establecerPanel();
        establecerFondo();
        establecerTitulo();
        establecerTextoV1();
        establecerTextoTipoDePersona();
        establecerTextoFechaDeNacimiento();
        establecerTextoNumeroID();
        establecerTextoNombre();
        establecerTextoDireccion();
        establecerTextoNumero();
        establecerTextoIdV1();
        establecerCajaDeTextoIdV1();
        establecerBtonBuscarV1();
        establecerBtonCerrarV1();
        establecerTextoV2();
        establecerCajaDeTextoNombreV2();
        establecerCajaDeTextoIdV2();
        establecerCajaDeTextoFechaDeNacimientoV2();
        establecerCajaDeTextoDireccionV2();
        establecerCajaDeTextoDireccion2V2();
        establecerCajaDeTextoTelefonoV2();
        establecerComboBoxDeTipoDeTelefonoV2();
        establecerCajaDeTextoTelefono2V2();
        establecerComboBoxDeTipoDeTelefono2V2();
        establecerCajaDeTextoTelefono3V2();
        establecerComboBoxDeTipoDeTelefono3V2();
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
        imagenFondo = new ImageIcon("FondoActualizar2.jpg");
        JLabel etiquetaFondo = new JLabel();
        etiquetaFondo.setBounds(0, 0, this.getWidth(), this.getHeight());
        etiquetaFondo.setIcon(new ImageIcon(imagenFondo.getImage().getScaledInstance(etiquetaFondo.getWidth(), etiquetaFondo.getHeight(), Image.SCALE_SMOOTH)));
        layeredPane.add(etiquetaFondo, JLayeredPane.PALETTE_LAYER);
    }
    
    private void establecerTitulo() {
        titulo = new JLabel("Actualizar Usuario");
        titulo.setBounds(240, 30, 500, 80);
        Color colorLetra = new Color(0, 0, 0);
        titulo.setForeground(colorLetra);
        titulo.setFont(new Font("Bernard MT Condensed", 1, 55));
        layeredPane.add(titulo, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerTextoV1() {
        texto = new JLabel("Agregue el ID de la persona a actualizar");
        texto.setBounds(210, 150, 530, 70);
        Color colorLetra = new Color(0, 0, 0);
        texto.setForeground(colorLetra);
        texto.setFont(new Font("Arial", 1, 25));
        layeredPane.add(texto, JLayeredPane.MODAL_LAYER);    
    }
    
     private void establecerTextoIdV1() {
        numID = new JLabel("Número ID:");
        numID.setBounds(270, 230, 530, 120);
        Color colorLetra = new Color(0, 0, 0);
        numID.setForeground(colorLetra);
        numID.setFont(new Font("Arial", 1, 22));
        layeredPane.add(numID, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerCajaDeTextoIdV1() {
        cajaTextoIdV1 = new JTextField();
        cajaTextoIdV1.setBounds(410, 270, 220, 35);
        cajaTextoIdV1.setFont(new Font("Arial", 1, 18));
        Color colorBorde = new Color(0, 0, 0);
        cajaTextoIdV1.setBorder(BorderFactory.createLineBorder(colorBorde,4,false));
        layeredPane.add(cajaTextoIdV1, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoIdV1(){
        return cajaTextoIdV1.getText();
    }
    
    private void establecerBtonBuscarV1() {
        botonBuscar = new JButton("Buscar");
        botonBuscar.setFocusPainted(false);
        botonBuscar.setBounds(475, 400, 120, 50);  
        botonBuscar.setForeground(Color.BLACK);
        botonBuscar.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(99, 203, 249);
        botonBuscar.setBackground(colorFondoBtn);
        Color colorBorde = new Color(0,0,0);
        botonBuscar.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonBuscar, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonBuscarListenerV1(ActionListener listenControl){
        botonBuscar.addActionListener(listenControl);
    }
    
    private void establecerBtonCerrarV1() {
        botonCerrar = new JButton("Cerrar");
        botonCerrar.setFocusPainted(false);
        botonCerrar.setBounds(300, 400, 120, 50);  
        botonCerrar.setForeground(Color.BLACK);
        botonCerrar.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(242, 68, 68);
        botonCerrar.setBackground(colorFondoBtn);
        Color colorBorde = new Color(0,0,0);
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
        texto.setEnabled(estado);
        texto.setVisible(estado);
        numID.setEnabled(estado);
        numID.setVisible(estado);
        titulo.setEnabled(estado);
        titulo.setVisible(estado);
    }
    
    private void establecerTextoV2() {
        textoV2 = new JLabel("Agregue los siguientes datos de la persona a actualizar:");
        textoV2.setBounds(190, 20, 600, 50);
        Color colorLetra = new Color(0, 0, 0);
        textoV2.setForeground(colorLetra);
        textoV2.setFont(new Font("Arial", 1, 20));
        layeredPane.add(textoV2, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerTextoNombre() {
        nombre = new JLabel("Nombre completo:");
        nombre.setBounds(140, 215, 530, 120);
        Color colorLetra = new Color(0, 0, 0);
        nombre.setForeground(colorLetra);
        nombre.setFont(new Font("Arial", 1, 18));
        layeredPane.add(nombre, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerCajaDeTextoNombreV2() {
        cajaTextoNombreV2 = new JTextField();
        cajaTextoNombreV2.setBounds(310, 260, 150, 30);
        cajaTextoNombreV2.setFont(new Font("Arial", 1, 15));
        Color colorBorde = new Color(0, 0, 0);
        cajaTextoNombreV2.setBorder(BorderFactory.createLineBorder(colorBorde,4,false));
        layeredPane.add(cajaTextoNombreV2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoNombreV2(){
        return cajaTextoNombreV2.getText();
    }
    
    private void establecerTextoNumeroID() {
        numeroID = new JLabel("Número de ID:");
        numeroID.setBounds(160, 165, 530, 120);
        Color colorLetra = new Color(0, 0, 0);
        numeroID.setForeground(colorLetra);
        numeroID.setFont(new Font("Arial", 1, 18));
        layeredPane.add(numeroID, JLayeredPane.MODAL_LAYER);    
    }
   
    private void establecerCajaDeTextoIdV2() {
        cajaTextoIdV2 = new JTextField();
        cajaTextoIdV2.setBounds(310, 220, 150, 30);
        cajaTextoIdV2.setFont(new Font("Arial", 1, 15));
        Color colorBorde = new Color(0, 0, 0);
        cajaTextoIdV2.setBorder(BorderFactory.createLineBorder(colorBorde,4,false));
        layeredPane.add(cajaTextoIdV2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoIdV2(){
        return cajaTextoIdV2.getText();
    }
    
    private void establecerTextoFechaDeNacimiento() {
        fechaNacimiento = new JLabel("Fecha de nacimiento:");
        fechaNacimiento.setBounds(110, 115, 530, 120);
        Color colorLetra = new Color(0, 0, 0);
        fechaNacimiento.setForeground(colorLetra);
        fechaNacimiento.setFont(new Font("Arial", 1, 18));
        layeredPane.add(fechaNacimiento, JLayeredPane.MODAL_LAYER);    
    }
       
    private void establecerCajaDeTextoFechaDeNacimientoV2() {
        cajaTextoFechaDeNacimientoV2= new JTextField();
        cajaTextoFechaDeNacimientoV2.setBounds(310, 160, 150, 30);
        cajaTextoFechaDeNacimientoV2.setFont(new Font("ARIAL", 1, 15));
        Color colorBorde = new Color(0, 0, 0);
        cajaTextoFechaDeNacimientoV2.setBorder(BorderFactory.createLineBorder(colorBorde,4,false));
        layeredPane.add(cajaTextoFechaDeNacimientoV2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoFechaDeNacimientoV2(){
        return cajaTextoFechaDeNacimientoV2.getText();
    }
    
    private void establecerTextoDireccion() {
        direccion = new JLabel("Dirección(es):");
        direccion.setBounds(160, 265, 530, 120);
        Color colorLetra = new Color(0, 0, 0);
        direccion.setForeground(colorLetra);
        direccion.setFont(new Font("Arial", 1, 18));
        layeredPane.add(direccion, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerCajaDeTextoDireccionV2() {
        cajaTextoDireccionV2 = new JTextField();
        cajaTextoDireccionV2.setBounds(310, 310, 150, 30);
        cajaTextoDireccionV2.setFont(new Font("Arial", 1, 15));
        Color colorBorde = new Color(0, 0, 0);
        cajaTextoDireccionV2.setBorder(BorderFactory.createLineBorder(colorBorde,4,false));
        layeredPane.add(cajaTextoDireccionV2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoDireccionV2(){
        return cajaTextoDireccionV2.getText();
    }
    
    private void establecerCajaDeTextoDireccion2V2() {
        cajaTextoDireccion2V2 = new JTextField();
        cajaTextoDireccion2V2.setBounds(470, 310, 150, 30);
        cajaTextoDireccion2V2.setFont(new Font("Arial", 1, 15));
        Color colorBorde = new Color(0, 0, 0);
        cajaTextoDireccion2V2.setBorder(BorderFactory.createLineBorder(colorBorde,4,false));
        layeredPane.add(cajaTextoDireccion2V2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoDireccion2V2(){
        return cajaTextoDireccion2V2.getText();
    }

    private void establecerTextoNumero() {
        telefono = new JLabel("Número de teléfono(s):");
        telefono.setBounds(100, 315, 530, 120);
        Color colorLetra = new Color(0, 0, 0);
        telefono.setForeground(colorLetra);
        telefono.setFont(new Font("Arial", 1, 18));
        layeredPane.add(telefono, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerCajaDeTextoTelefonoV2() {
        cajaTextoTelefonoV2 = new JTextField();
        cajaTextoTelefonoV2.setBounds(310, 360, 150, 30);
        cajaTextoTelefonoV2.setFont(new Font("Arial", 1, 15));
        Color colorBorde = new Color(0,0,0);
        cajaTextoTelefonoV2.setBorder(BorderFactory.createLineBorder(colorBorde,4,false));
        layeredPane.add(cajaTextoTelefonoV2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoTelefonoV2(){
        return cajaTextoTelefonoV2.getText();
    }
    
    private void establecerComboBoxDeTipoDeTelefonoV2(){
        String[] opciones = {"", "MOVIL", "CASA", "OFICINA"};
        comboBoxTipoDeTelefonoV2 = new JComboBox<>(opciones);
        comboBoxTipoDeTelefonoV2.setBounds(310, 400, 150, 30);
        layeredPane.add(comboBoxTipoDeTelefonoV2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getComboBoxTipoDeTelefonoV2(){
        return (String) comboBoxTipoDeTelefonoV2.getSelectedItem();
    }
    
    private void establecerCajaDeTextoTelefono2V2() {
        cajaTextoTelefono2V2 = new JTextField();
        cajaTextoTelefono2V2.setBounds(470, 360, 150, 30);
        cajaTextoTelefono2V2.setFont(new Font("Arial", 1, 15));
        Color colorBorde = new Color(0,0,0);
        cajaTextoTelefono2V2.setBorder(BorderFactory.createLineBorder(colorBorde,4,false));
        layeredPane.add(cajaTextoTelefono2V2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoTelefono2V2(){
        return cajaTextoTelefono2V2.getText();
    }
    
    private void establecerComboBoxDeTipoDeTelefono2V2(){
        String[] opciones = {"", "MOVIL", "CASA", "OFICINA"};
        comboBoxTipoDeTelefono2V2 = new JComboBox<>(opciones);
        comboBoxTipoDeTelefono2V2.setBounds(470, 400, 150, 30);
        layeredPane.add(comboBoxTipoDeTelefono2V2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getComboBoxTipoDeTelefono2V2(){
        return (String) comboBoxTipoDeTelefono2V2.getSelectedItem();
    }
    
    private void establecerCajaDeTextoTelefono3V2() {
        cajaTextoTelefono3V2 = new JTextField();
        cajaTextoTelefono3V2.setBounds(630, 360, 150, 30);
        cajaTextoTelefono3V2.setFont(new Font("Arial", 1, 15));
        Color colorBorde = new Color(0,0,0);
        cajaTextoTelefono3V2.setBorder(BorderFactory.createLineBorder(colorBorde,4,false));
        layeredPane.add(cajaTextoTelefono3V2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoTelefono3V2(){
        return cajaTextoTelefono3V2.getText();
    }
    
    private void establecerComboBoxDeTipoDeTelefono3V2(){
        String[] opciones = {"", "MOVIL", "CASA", "OFICINA"};
        comboBoxTipoDeTelefono3V2 = new JComboBox<>(opciones);
        comboBoxTipoDeTelefono3V2.setBounds(630, 400, 150, 30);
        layeredPane.add(comboBoxTipoDeTelefono3V2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getComboBoxTipoDeTelefono3V2(){
        return (String) comboBoxTipoDeTelefono3V2.getSelectedItem();
    }

    private void establecerTextoTipoDePersona() {
        tipoPersona = new JLabel("Tipo de persona:");
        tipoPersona.setBounds(140, 60, 530, 120);
        Color colorLetra = new Color(0, 0, 0);
        tipoPersona.setForeground(colorLetra);
        tipoPersona.setFont(new Font("Arial", 1, 18));
        layeredPane.add(tipoPersona, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerComboBoxDeTipoDePersonaV2(){
        String[] opciones = {"","ESTUDIANTE", "PROFESOR", "EMPLEADO"};
        comboBoxTipoDePersonaV2 = new JComboBox<>(opciones);
        comboBoxTipoDePersonaV2.setBounds(310, 100, 150, 30);
        layeredPane.add(comboBoxTipoDePersonaV2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getComboBoxTipoDePersonaV2(){
        return (String) comboBoxTipoDePersonaV2.getSelectedItem();
    }
    
    private void establecerBtonActualizarV2() {
        botonActualizar = new JButton("Actualizar");
        botonActualizar.setFocusPainted(false);
        botonActualizar.setBounds(480, 490, 120, 40);  
        botonActualizar.setForeground(Color.BLACK);
        botonActualizar.setFont(new Font("Bernard MT Condensed", 0, 22));
        Color colorFondoBtn = new Color(99, 203, 249);
        botonActualizar.setBackground(colorFondoBtn);
        Color colorBorde = new Color(0,0,0);
        botonActualizar.setBorder(BorderFactory.createLineBorder(colorBorde,3,false));
        layeredPane.add(botonActualizar, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonActualizarListener(ActionListener listenControl){
        botonActualizar.addActionListener(listenControl);
    }
    
    private void establecerBtonAtras() {
        botonAtras = new JButton("Atras");
        botonAtras.setFocusPainted(false);
        botonAtras.setBounds(320, 490, 120, 40);
        botonAtras.setForeground(Color.BLACK);
        botonAtras.setFont(new Font("Bernard MT Condensed", 0, 22));
        Color colorFondoBtn = new Color(242, 68, 68);
        botonAtras.setBackground(colorFondoBtn);
        Color colorBorde = new Color(0,0,0);
        botonAtras.setBorder(BorderFactory.createLineBorder(colorBorde,3,false));
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
        cajaTextoDireccion2V2.setEnabled(estado);
        cajaTextoDireccion2V2.setVisible(estado);
        cajaTextoTelefonoV2.setEnabled(estado);
        cajaTextoTelefonoV2.setVisible(estado);
        comboBoxTipoDeTelefonoV2.setEnabled(estado);
        comboBoxTipoDeTelefonoV2.setVisible(estado);
        cajaTextoTelefono2V2.setEnabled(estado);
        cajaTextoTelefono2V2.setVisible(estado);
        comboBoxTipoDeTelefono2V2.setEnabled(estado);
        comboBoxTipoDeTelefono2V2.setVisible(estado);
        cajaTextoTelefono3V2.setEnabled(estado);
        cajaTextoTelefono3V2.setVisible(estado);
        comboBoxTipoDeTelefono3V2.setEnabled(estado);
        comboBoxTipoDeTelefono3V2.setVisible(estado);
        comboBoxTipoDePersonaV2.setEnabled(estado);
        comboBoxTipoDePersonaV2.setVisible(estado);
        botonActualizar.setEnabled(estado);
        botonActualizar.setVisible(estado);
        botonAtras.setEnabled(estado);
        botonAtras.setVisible(estado);
        fechaNacimiento.setEnabled(estado);
        fechaNacimiento.setVisible(estado);
        nombre.setEnabled(estado);
        nombre.setVisible(estado);
        tipoPersona.setEnabled(estado);
        tipoPersona.setVisible(estado);
        numeroID.setEnabled(estado);
        numeroID.setVisible(estado);
        direccion.setEnabled(estado);
        direccion.setVisible(estado);
        telefono.setEnabled(estado);
        telefono.setVisible(estado);      
    }
    
    public void limpiarComponentes(){
        cajaTextoIdV1.setText("");
        cajaTextoIdV2.setText("");
        cajaTextoNombreV2.setText("");
        cajaTextoFechaDeNacimientoV2.setText("");
        cajaTextoDireccionV2.setText("");
        cajaTextoTelefonoV2.setText("");
        comboBoxTipoDeTelefonoV2.setSelectedItem("");
        comboBoxTipoDePersonaV2.setSelectedItem("");
        cajaTextoDireccion2V2.setText("");
        comboBoxTipoDeTelefono2V2.setSelectedItem("");
        cajaTextoTelefono2V2.setText("");
        cajaTextoTelefono3V2.setText("");
        comboBoxTipoDeTelefono3V2.setSelectedItem("");
    }
    
    public void establecerDatosDeLaPersona(String nombre, String id, String fechaDeNacimiento, String direccion1, String direccion2, String telefono1, String tipoTelefono1, String tipoDePersona, String telefono2, String tipoTelefono2, String telefono3, String tipoTelefono3){
        cajaTextoIdV2.setText(id);
        cajaTextoNombreV2.setText(nombre);
        cajaTextoFechaDeNacimientoV2.setText(fechaDeNacimiento);
        cajaTextoDireccionV2.setText(direccion1);
        cajaTextoTelefonoV2.setText(telefono1);
        comboBoxTipoDeTelefonoV2.setSelectedItem(tipoTelefono1);
        cajaTextoDireccion2V2.setText(direccion2);
        comboBoxTipoDeTelefono2V2.setSelectedItem(tipoTelefono2);
        cajaTextoTelefono2V2.setText(telefono2);
        cajaTextoTelefono3V2.setText(telefono3);
        comboBoxTipoDeTelefono3V2.setSelectedItem(tipoTelefono3);
        
        
        if(null != tipoDePersona)switch (tipoDePersona) {
            case "Estudiante":
                comboBoxTipoDePersonaV2.setSelectedItem("ESTUDIANTE");
                break;
            case "Profesor":
                comboBoxTipoDePersonaV2.setSelectedItem("PROFESOR");
                break;
            case "Empleado":
                comboBoxTipoDePersonaV2.setSelectedItem("EMPLEADO");
                break;
            default:
                break;
        }
    }
}
