package vista;

import java.awt.Button;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Vista 
{
    private JFrame ventana;
    private JTextField texto, clave, numInte, claveDos;
    private JTextArea textArea;
    private Button botonEncript, botonDes;
    private Button botonAyuda= new Button("?");
    private Button botonNumInte = new Button("Enviar");
    private JLabel textPal, textCla;
    public Vista()
    {
        //instanciar objetos 
        textPal= new JLabel("Palabra que desea encriptar");
        textCla= new JLabel("Contraseña para la encriptación");
        ventana=new JFrame("Encriptación y Descriptación");
        botonEncript=new Button("Encriptar");
        botonDes=new Button("Desencriptar");
        clave=new JTextField();
        texto=new JTextField();
        //posicionar y dar estilo a los elementos
        botonEncript.setBounds(50,125,100,30);
        texto.setBounds(50,25,200,30);
        clave.setBounds(50, 75, 200,30);
        botonDes.setBounds(150, 125, 100,30);
        textPal.setBounds(275,25, 200,30);
        textCla.setBounds(275,75, 200,30);

        //agregar componentes a la ventana
        ventana.add(textPal);
        ventana.add(textCla);
        ventana.add(botonDes);
        ventana.add(clave);
        ventana.add(texto);
        ventana.add(botonEncript);
        ventana.setSize(500, 225);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public String getTexto()
    {
        return texto.getText();
    }
    public String getClave()
    {
        return clave.getText();
    } 
    public void botText(ActionListener act)
    {
        botonEncript.addActionListener(act);
    }
    public void botDes(ActionListener act)
    {
        botonDes.addActionListener(act);
    }
    public void ventanDos()
    {
        //instanciamento de objetos
        JLabel num, contra;
        num= new JLabel("Numero de interacciones");
        contra= new JLabel("Contraseña");
        JFrame ventana2 = new JFrame("Desencriptar");
        numInte= new JTextField();
        claveDos= new JTextField();
        //Posicionamiento de los objetos
        numInte.setBounds(25,100, 100, 30);
        botonNumInte.setBounds(50, 140,100,30 );
        claveDos.setBounds(25, 50, 100, 30);
        num.setBounds(150, 100, 200,30);
        contra.setBounds(150, 50, 200,30);
        botonAyuda.setBounds(300, 50, 50, 50);
        //Objetos a la ventana
        ventana2.add(botonAyuda);
        ventana2.add(num);
        ventana2.add(contra);
        ventana2.add(claveDos);
        ventana2.add(numInte);
        ventana2.add(botonNumInte);
        ventana2.setSize(400, 225);
        ventana2.setResizable(true);
        ventana2.setLocationRelativeTo(null);
        ventana2.setLayout(null);
        ventana2.setVisible(true);
    }
    public int getNumInt()
    {
        return Integer.parseInt(numInte.getText());
    }
    public String getClavedos()
    {
        return claveDos.getText();
    }
    public void botNumInt(ActionListener act)
    {
        botonNumInte.addActionListener(act);
    }
    public void botAyuda(ActionListener act)
    {
        botonAyuda.addActionListener(act);
    }

}