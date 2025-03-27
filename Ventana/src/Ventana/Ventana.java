
package Ventana;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana  extends JFrame{
    public Ventana() {
        
       setSize(500, 500); // tamaño de ventana
        setTitle("UZZIEL");//ESTABLECER EL TITULO
       // setLocation(500, 250);//ubicacion de la ventana
       //setBounds(550, 250, 500, 500);//englova la ubicacion y el tamaño
        setLocationRelativeTo(null);//establece la ventana en el centro
        setMinimumSize(new Dimension(200, 200));//establece el tamaño minimo que se le puede dar a la ventana
        
        
       
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);//terminar ejecucion de ventana
    }
    private void iniciarComponentes(){
        
        JPanel panel=new JPanel();//crear el panel
        panel.setLayout(null);//quitar los Layauts
        this.getContentPane().add(panel);//mostrar el panel en la ventana
        panel.setBackground(Color.DARK_GRAY);//cambiar el color de fondo
        
        JLabel etiqueta = new JLabel(/*"hola", SwingConstants.CENTER*//*sirve para mover el texto*/);//etiqueta de texto
        etiqueta.setText("hola");
        etiqueta.setBounds(10, 10, 50, 20); //ubicar el texto
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//centrar el texto
        etiqueta.setForeground(Color.WHITE);//color de letra
        etiqueta.setOpaque(true); //abilitar el cambio de color
        etiqueta.setBackground(Color.BLACK);// color de la etiqueta
        etiqueta.setFont(new Font("arial", Font.PLAIN, 20));//establecer la fuente
        //tambien se pueden colocar el tipo de letra en numero, empenzando desde el 0
        panel.add(etiqueta);//agregamos etiqueta al panel
       
    }
}
