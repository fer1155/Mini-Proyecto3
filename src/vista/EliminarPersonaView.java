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
    
    //Constructor de la ventana Eliminar Persona
    public EliminarPersonaView(){
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
        establecerTexto();
        establecerCajaDeTextoId();
        establecerTextArea();
        establecerBtonEliminar();
        establecerBtonAtras();
        establecerBtonBuscar();
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
        imagenFondo = new ImageIcon("");
        JLabel etiquetaFondo = new JLabel();
        etiquetaFondo.setBounds(0, 0, this.getWidth(), this.getHeight());
        //etiquetaFondo.setIcon(new ImageIcon(imagenFondo.getImage().getScaledInstance(etiquetaFondo.getWidth(), etiquetaFondo.getHeight(), Image.SCALE_SMOOTH)));
        layeredPane.add(etiquetaFondo, JLayeredPane.PALETTE_LAYER);
    }
        
    private void establecerTexto() {
        texto = new JLabel("Directorio");
        texto.setBounds(265, 20, 530, 120);
        Color colorLetra = new Color(78, 39, 0);
        texto.setForeground(colorLetra);
        texto.setFont(new Font("Bernard MT Condensed", 1, 85));
        layeredPane.add(texto, JLayeredPane.MODAL_LAYER);    
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
    
    public void establecerTextArea(){
        textArea = new JTextArea("");
        textArea.setColumns(40);  // Número de columnas
        textArea.setRows(40);
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(100, 140, 500, 200);
        layeredPane.add(scrollPane, JLayeredPane.MODAL_LAYER);
    }
    
    private void establecerBtonEliminar() {
        botonEliminar = new JButton("Eliminar");
        botonEliminar.setFocusPainted(false);
        botonEliminar.setBounds(450, 450, 230, 60);  
        botonEliminar.setForeground(Color.WHITE);
        botonEliminar.setFont(new Font("Bernard MT Condensed", 0, 28));
        Color colorFondoBtn = new Color(78, 39, 0);
        botonEliminar.setBackground(colorFondoBtn);
        Color colorBorde = new Color(94, 94, 94);
        botonEliminar.setBorder(BorderFactory.createLineBorder(colorBorde,3,true));
        layeredPane.add(botonEliminar, JLayeredPane.MODAL_LAYER);
    }
    
    public void addBtonEliminarListener(ActionListener listenControl){
        botonEliminar.addActionListener(listenControl);
    }
    
    private void establecerBtonAtras() {
        botonAtras = new JButton("Atras");
        botonAtras.setFocusPainted(false);
        botonAtras.setBounds(100, 450, 230, 60);  
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
    
    private void establecerBtonBuscar() {
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
    
    public void addBtonBuscarListener(ActionListener listenControl){
        botonBuscar.addActionListener(listenControl);
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
