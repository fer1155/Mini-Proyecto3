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
    private JLabel titulo;
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
    
    //Constructor de la ventana Actualizar Persona
    public ActualizarPersonaView(){
        this.setTitle("Directorio");
        this.setBounds(200, 50, 900,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        establecerLayeredPanel();
        establecerPanel();
        establecerFondo();
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
        imagenFondo = new ImageIcon("FondoActualizar.png");
        JLabel etiquetaFondo = new JLabel();
        etiquetaFondo.setBounds(0, 0, this.getWidth(), this.getHeight());
        etiquetaFondo.setIcon(new ImageIcon(imagenFondo.getImage().getScaledInstance(etiquetaFondo.getWidth(), etiquetaFondo.getHeight(), Image.SCALE_SMOOTH)));
        layeredPane.add(etiquetaFondo, JLayeredPane.PALETTE_LAYER);
    }
        
    private void establecerTextoV1() {
        texto = new JLabel("Agregue el ID de la persona a actualizar");
        texto.setBounds(190, 40, 530, 120);
        Color colorLetra = new Color(0, 0, 0);
        texto.setForeground(colorLetra);
        texto.setFont(new Font("Bernard MT Condensed", 1, 30));
        layeredPane.add(texto, JLayeredPane.MODAL_LAYER);    
    }
    
     private void establecerTextoIdV1() {
        texto = new JLabel("Número de identificación:");
        texto.setBounds(170, 150, 530, 120);
        Color colorLetra = new Color(0, 0, 0);
        texto.setForeground(colorLetra);
        texto.setFont(new Font("Bookman Old Style", 1, 22));
        layeredPane.add(texto, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerCajaDeTextoIdV1() {
        cajaTextoIdV1 = new JTextField();
        cajaTextoIdV1.setBounds(530, 190, 170, 40);
        cajaTextoIdV1.setFont(new Font("Centaur", 1, 18));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoIdV1.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoIdV1, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoIdV1(){
        return cajaTextoIdV1.getText();
    }
    
    private void establecerTextoTipoDePersona() {
        titulo = new JLabel("Tipo de persona:");
        titulo.setBounds(230, 80, 530, 120);
        Color colorLetra = new Color(0, 0, 0);
        titulo.setForeground(colorLetra);
        titulo.setFont(new Font("Bookman Old Style", 1, 18));
        layeredPane.add(titulo, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerTextoFechaDeNacimiento() {
        titulo = new JLabel("Fecha de nacimiento:");
        titulo.setBounds(230, 135, 530, 120);
        Color colorLetra = new Color(0, 0, 0);
        titulo.setForeground(colorLetra);
        titulo.setFont(new Font("Bookman Old Style", 1, 18));
        layeredPane.add(titulo, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerTextoNumeroID() {
        titulo = new JLabel("Número de ID:");
        titulo.setBounds(230, 185, 530, 120);
        Color colorLetra = new Color(0, 0, 0);
        titulo.setForeground(colorLetra);
        titulo.setFont(new Font("Bookman Old Style", 1, 18));
        layeredPane.add(titulo, JLayeredPane.MODAL_LAYER);    
    }
    
     private void establecerTextoNombre() {
        titulo = new JLabel("Nombre completo:");
        titulo.setBounds(230, 235, 530, 120);
        Color colorLetra = new Color(0, 0, 0);
        titulo.setForeground(colorLetra);
        titulo.setFont(new Font("Bookman Old Style", 1, 18));
        layeredPane.add(titulo, JLayeredPane.MODAL_LAYER);    
    }
     
     private void establecerTextoDireccion() {
        titulo = new JLabel("Dirección(es):");
        titulo.setBounds(230, 285, 530, 120);
        Color colorLetra = new Color(0, 0, 0);
        titulo.setForeground(colorLetra);
        titulo.setFont(new Font("Bookman Old Style", 1, 18));
        layeredPane.add(titulo, JLayeredPane.MODAL_LAYER);    
    }
     
     private void establecerTextoNumero() {
        titulo = new JLabel("Número de teléfono(s):");
        titulo.setBounds(230, 335, 530, 120);
        Color colorLetra = new Color(0, 0, 0);
        titulo.setForeground(colorLetra);
        titulo.setFont(new Font("Bookman Old Style", 1, 18));
        layeredPane.add(titulo, JLayeredPane.MODAL_LAYER);    
    }
    private void establecerBtonBuscarV1() {
        botonBuscar = new JButton("Buscar");
        botonBuscar.setFocusPainted(false);
        botonBuscar.setBounds(465, 280, 120, 50);  
        botonBuscar.setForeground(Color.BLACK);
        botonBuscar.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(99, 203, 249);
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
        botonCerrar.setBounds(310, 280, 120, 50);  
        botonCerrar.setForeground(Color.BLACK);
        botonCerrar.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(242, 68, 68);
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
        textoV2 = new JLabel("Agregue los siguientes datos de la persona a actualizar");
        textoV2.setBounds(175, 10, 600, 120);
        Color colorLetra = new Color(0, 0, 0);
        textoV2.setForeground(colorLetra);
        textoV2.setFont(new Font("Bernard MT Condensed", 1, 25));
        layeredPane.add(textoV2, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerCajaDeTextoNombreV2() {
        cajaTextoNombreV2 = new JTextField();
        cajaTextoNombreV2.setBounds(450, 280, 140, 30);
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
        cajaTextoIdV2.setBounds(450, 230, 140, 30);
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
        cajaTextoFechaDeNacimientoV2.setBounds(450, 180, 140, 30);
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
        cajaTextoDireccionV2.setBounds(450, 330, 140, 30);
        cajaTextoDireccionV2.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoDireccionV2.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoDireccionV2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoDireccionV2(){
        return cajaTextoDireccionV2.getText();
    }
    
    private void establecerCajaDeTextoDireccion2V2() {
        cajaTextoDireccion2V2 = new JTextField();
        cajaTextoDireccion2V2.setBounds(620, 330, 140, 30);
        cajaTextoDireccion2V2.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoDireccion2V2.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoDireccion2V2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoDireccion2V2(){
        return cajaTextoDireccion2V2.getText();
    }
    
    private void establecerCajaDeTextoTelefonoV2() {
        cajaTextoTelefonoV2 = new JTextField();
        cajaTextoTelefonoV2.setBounds(450, 380, 120, 30);
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
        comboBoxTipoDeTelefonoV2.setBounds(450, 420, 120, 30);
        layeredPane.add(comboBoxTipoDeTelefonoV2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getComboBoxTipoDeTelefonoV2(){
        return (String) comboBoxTipoDeTelefonoV2.getSelectedItem();
    }
    
    private void establecerCajaDeTextoTelefono2V2() {
        cajaTextoTelefono2V2 = new JTextField();
        cajaTextoTelefono2V2.setBounds(600, 380, 120, 30);
        cajaTextoTelefono2V2.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoTelefono2V2.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoTelefono2V2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoTelefono2V2(){
        return cajaTextoTelefono2V2.getText();
    }
    
    private void establecerComboBoxDeTipoDeTelefono2V2(){
        String[] opciones = {"", "MOVIL", "CASA", "OFICINA"};
        comboBoxTipoDeTelefono2V2 = new JComboBox<>(opciones);
        comboBoxTipoDeTelefono2V2.setBounds(600, 420, 120, 30);
        layeredPane.add(comboBoxTipoDeTelefono2V2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getComboBoxTipoDeTelefono2V2(){
        return (String) comboBoxTipoDeTelefono2V2.getSelectedItem();
    }
    
    private void establecerCajaDeTextoTelefono3V2() {
        cajaTextoTelefono3V2 = new JTextField();
        cajaTextoTelefono3V2.setBounds(730, 380, 120, 30);
        cajaTextoTelefono3V2.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(94, 94, 94);
        cajaTextoTelefono3V2.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoTelefono3V2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoTelefono3V2(){
        return cajaTextoTelefono3V2.getText();
    }
    
    private void establecerComboBoxDeTipoDeTelefono3V2(){
        String[] opciones = {"", "MOVIL", "CASA", "OFICINA"};
        comboBoxTipoDeTelefono3V2 = new JComboBox<>(opciones);
        comboBoxTipoDeTelefono3V2.setBounds(730, 420, 120, 30);
        layeredPane.add(comboBoxTipoDeTelefono3V2, JLayeredPane.MODAL_LAYER);
    }
    
    public String getComboBoxTipoDeTelefono3V2(){
        return (String) comboBoxTipoDeTelefono3V2.getSelectedItem();
    }
    
    private void establecerComboBoxDeTipoDePersonaV2(){
        String[] opciones = {"","ESTUDIANTE", "PROFESOR", "EMPLEADO"};
        comboBoxTipoDePersonaV2 = new JComboBox<>(opciones);
        comboBoxTipoDePersonaV2.setBounds(450, 120, 160, 40);
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
        botonAtras.setBounds(275, 490, 120, 40);
        botonAtras.setForeground(Color.BLACK);
        botonAtras.setFont(new Font("Bernard MT Condensed", 0, 22));
        Color colorFondoBtn = new Color(242, 68, 68);
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
