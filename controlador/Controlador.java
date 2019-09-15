package controlador;

import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import modelo.Modelo;
import vista.Vista;

/**
 * Controlador
 */
public class Controlador {
    private Vista vis = new Vista();
    private Modelo model = new Modelo();

    public Controlador() throws IOException {
        encript();
        venDesencript();
        numDesc();
        ayudaUser();
    }

    public void encript() throws IOException {
        ActionListener act = e -> {
            vis.getTexto();
            vis.getClave();

            try {
                new Modelo(vis.getTexto(), vis.getClave());

            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            JOptionPane.showMessageDialog(null,
                    "Te hemos creado un archivo de texto en el cual puedes encontrar la información de la contraseña y la encriptación");
        };
        vis.botText(act);

    }

    public void venDesencript() {
        ActionListener act = e -> {
            JOptionPane.showMessageDialog(null,
                    "Le recomendamos presionar el boton con el ? antes de llenar las casillas");
            vis.ventanDos();
        };
        vis.botDes(act);
    }

    public void numDesc() {
        ActionListener act = e -> model.descript(vis.getNumInt(), vis.getClavedos());
        vis.botNumInt(act);
    }

    public void ayudaUser() {
        ActionListener act = e -> {
            JOptionPane.showMessageDialog(null,
                    "Para el numero de interaccion es el primer numero antes del '-', y del la ultima casilla");
            JOptionPane.showMessageDialog(null, "Ejemplo: [1-1234][2-5431] en este caso es el 2 ['2'-5431]");
            JOptionPane.showMessageDialog(null, "La contraseña la encuentras en el archivo de texto");
            JOptionPane.showMessageDialog(null, 
            "Cuando se le pida que digite el numero vaya intruduciendo el número que va despues del signo '-'");
            JOptionPane.showMessageDialog(null, "Ejemplo: [2-'5641'] es el número que esta en las comillas simples");
        };
        vis.botAyuda(act);
    }
}