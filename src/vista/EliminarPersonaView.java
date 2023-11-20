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
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class EliminarPersonaView extends JFrame{
    private JLayeredPane layeredPane;
    private JPanel panel;
    private ImageIcon imagenFondo;
    private JLabel texto;
    private JButton botonCerrar;
    private JTextField cajaTextoId;
    private JButton botonEliminar;
    private JButton botonBuscar;
    private JButton botonAtras;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JLabel texto2;
    
    //Constructor de la ventana Eliminar Persona
    public EliminarPersonaView(){
        this.setTitle("Directorio");
        this.setBounds(200, 50, 900, 450);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        establecerLayeredPanel();
        establecerPanel();
        establecerFondo();
        establecerTexto();
        establecerCajaDeTextoId();
        establecerTextArea();
        establecerBtonEliminar();
        establecerBtonAtras();
        establecerBtonBuscar();
        establecerBtonCerrar();
        establecerTexto2();
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
        imagenFondo = new ImageIcon("FondoEliminar.png");
        JLabel etiquetaFondo = new JLabel();
        etiquetaFondo.setBounds(0, 0, this.getWidth(), this.getHeight());
        etiquetaFondo.setIcon(new ImageIcon(imagenFondo.getImage().getScaledInstance(etiquetaFondo.getWidth(), etiquetaFondo.getHeight(), Image.SCALE_SMOOTH)));
        layeredPane.add(etiquetaFondo, JLayeredPane.PALETTE_LAYER);
    }
        
    private void establecerTexto() {
        texto = new JLabel("Directorio");
        texto.setBounds(265, 20, 530, 120);
        Color colorLetra = new Color(255, 255, 255);
        texto.setForeground(colorLetra);
        texto.setFont(new Font("Bernard MT Condensed", 1, 85));
        layeredPane.add(texto, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerTexto2() {
        texto2 = new JLabel("Número ID: ");
        texto2.setBounds(180, 190, 180, 50);
        Color colorLetra = new Color(255, 255, 255);
        texto2.setForeground(colorLetra);
        texto2.setFont(new Font("Arial", 0, 25));
        layeredPane.add(texto2, JLayeredPane.MODAL_LAYER);    
    }
    
    private void establecerCajaDeTextoId() {
        cajaTextoId = new JTextField();
        cajaTextoId.setBounds(350, 190, 200, 50);
        cajaTextoId.setFont(new Font("Centaur", 1, 15));
        Color colorBorde = new Color(255, 255, 255);
        cajaTextoId.setBorder(BorderFactory.createLineBorder(colorBorde,4,true));
        layeredPane.add(cajaTextoId, JLayeredPane.MODAL_LAYER);
    }
    
    public String getCajaDeTextoId(){
        return cajaTextoId.getText();
    }
    
    public void establecerTextArea(){
        textArea = new JTextArea("");
        textArea.setColumns(20);  // Número de columnas
        textArea.setRows(40);
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(150, 160, 600, 100);
        layeredPane.add(scrollPane, JLayeredPane.MODAL_LAYER);
    }
    
    private void establecerBtonEliminar() {
        botonEliminar = new JButton("Eliminar");
        botonEliminar.setFocusPainted(false);
        botonEliminar.setBounds(500, 300, 230, 60);  
        botonEliminar.setForeground(Color.BLACK);
        botonEliminar.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(255, 255, 255);
        botonEliminar.setBackground(colorFondoBtn);
        Color colorBorde = new Color(0, 0, 0);
        botonEliminar.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonEliminar, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonEliminarListener(ActionListener listenControl){
        botonEliminar.addActionListener(listenControl);
    }
    
    private void establecerBtonAtras() {
        botonAtras = new JButton("Atras");
        botonAtras.setFocusPainted(false);
        botonAtras.setBounds(200, 300, 200, 60);  
        botonAtras.setForeground(Color.BLACK);
        botonAtras.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(255, 255, 255);
        botonAtras.setBackground(colorFondoBtn);
        Color colorBorde = new Color(0, 0, 0);
        botonAtras.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonAtras, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonAtrasListener(ActionListener listenControl){
        botonAtras.addActionListener(listenControl);
    }
    
    private void establecerBtonBuscar() {
        botonBuscar = new JButton("Buscar");
        botonBuscar.setFocusPainted(false);
        botonBuscar.setBounds(500, 300, 230, 60);  
        botonBuscar.setForeground(Color.BLACK);
        botonBuscar.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(255, 255, 255);
        botonBuscar.setBackground(colorFondoBtn);
        Color colorBorde = new Color(0, 0, 0);
        botonBuscar.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonBuscar, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonBuscarListener(ActionListener listenControl){
        botonBuscar.addActionListener(listenControl);
    }
    
    private void establecerBtonCerrar() {
        botonCerrar = new JButton("Cerrar");
        botonCerrar.setFocusPainted(false);
        botonCerrar.setBounds(200, 300, 200, 60);  
        botonCerrar.setForeground(Color.BLACK);
        botonCerrar.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(255, 255, 255);
        botonCerrar.setBackground(colorFondoBtn);
        Color colorBorde = new Color(0, 0, 0);
        botonCerrar.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonCerrar, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonCerrarListener(ActionListener listenControl){
        botonCerrar.addActionListener(listenControl);
    }
    
    public void mostrarComponentesV2(boolean estado){
        botonEliminar.setEnabled(estado);
        botonEliminar.setVisible(estado);
        botonAtras.setEnabled(estado);
        botonAtras.setVisible(estado);
        scrollPane.setEnabled(estado);
        scrollPane.setVisible(estado);
    }
    
    public void mostrarComponentesV1(boolean estado){
        botonBuscar.setEnabled(estado);
        botonBuscar.setVisible(estado);
        botonCerrar.setEnabled(estado);
        botonCerrar.setVisible(estado);
        cajaTextoId.setEnabled(estado);
        cajaTextoId.setVisible(estado);
    }
    
    public void limpiarComponentes(){
        cajaTextoId.setText("");
        textArea.setText("");
    }
    
    public void setTextoArea(String texto){
        textArea.setText(texto);
    }
}
