/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

/**
 *
 * @author usuario
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Interfaz extends JFrame {
    
    JLabel etiquetaDatos, encabezado;
    JTextField Datos;
    JButton Agregar;
    
    public Interfaz(){
        setTitle("Colas");
        setLayout(null);
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Componentes();                                                           
    }
    
    public void Componentes(){
        encabezado = new JLabel("Colas");
        encabezado.setBounds(250, 0, 400 ,60 );
        
        etiquetaDatos = new JLabel("Ingrese los datos a agregar");
        etiquetaDatos.setBounds(100, 50 ,200 ,30 );
        Datos = new JTextField();
        Datos.setBounds(300, 50 ,200 ,30 );
        
        Agregar = new JButton("Encolar");
        Agregar.setBounds(200, 200, 150, 30);

        add(encabezado);
        add(Agregar);
    }
    
    public static void main(String[] args) {
        Interfaz GUI = new Interfaz();
        
        GUI.setLocationRelativeTo(null);
        GUI.setVisible(true);
        GUI.setResizable(false);
    } 
}
