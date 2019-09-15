package modelo;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;
//import java.util.Scanner;
/**
 * Modelo
 */
public class Modelo 
{
    private String claves;
    private String palabraEncript;//variable que va la recibir la palabra que va a hacer encriptada
    public Modelo(){}
    public Modelo(String palabraEncript, String claves) throws IOException
    {
        this.claves=claves;
        this.palabraEncript=palabraEncript;
        encriptar(palabraEncript);
        //System.out.print("Digte la palabra que desea encriptar: ");
        //palabraEncript=tc.next();
        //System.out.print("Digite un numero para le nivel de encriptacion de :" );
        //claves=tc.next();  
        
        //System.out.println(vaEnc);
        //recor(encriptar(palabraEncript)); 
        //System.out.println("--------------------------");
        //descript(encriptar(palabraEncript));
        //recor(encriptar(palabraEncript));
        //System.out.println(claveEnDe());
        
        //descript(2);
    }
    /*public Modelo(String claves)
    {
        this.claves=claves;
    }*/
    public int claveEnDe()
    {
        int vaEnc=0,auxiliar=0;
        char[] clave=claves.toCharArray();
        for (int i = 0; i < clave.length; i++) 
        {
            auxiliar+=clave[i];
        }
        vaEnc=auxiliar*999;
        return vaEnc;
        
    }
    public int[] encriptar(String palabra)throws IOException
    {
        FileWriter texto = new FileWriter("Encriptacion.txt");
        char[] caracter=palabra.toCharArray();
        int[] hola= new int[palabra.length()];
        int aux[]=new int[palabra.length()];   
        for (int i = 0; i < caracter.length; i++) 
        {
            
            hola[i]=(int)caracter[i];
            //System.out.print(hola[i]*1024);
            //System.out.print("-"); 
            aux[i]=(hola[i]=(int)caracter[i]*claveEnDe());   
            texto.write("["+(i+1)+"-"+aux[i]+"]");
            texto.write("\n"); 
              
        }
        texto.write("\nSu clave para desencriptar es: " + claves);
        texto.close();
        return aux;

    } 
    public void recor(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print("["+(i+1)+"-"+arr[i]+"]");    
        }
        System.out.println("");
    }
    /*public int claveEnDe2()
    {
        int vaEnc=0,auxiliar=0;
        char[] clave=cl.toCharArray();
        for (int i = 0; i < clave.length; i++) 
        {
            auxiliar+=clave[i];
        }
        vaEnc=auxiliar*999;
        return vaEnc;
        
    }*/
    public void descript(int num, String cl)
    {
        int vaEnc=0,auxiliar=0;
        char[] clave=cl.toCharArray();
        for (int i = 0; i < clave.length; i++) 
        {
            auxiliar+=clave[i];
        }
        vaEnc=auxiliar*999;
    //siguiente liena de codigo
        int aux=0;
        char[] caracter=new char[num];
        int[] arraAux = new int[num];
        for (int i = 0; i < num; i++) 
        {
            
            aux=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"+(i+1)));
            arraAux[i]=aux/vaEnc;
            caracter[i]=(char) arraAux[i];
            System.out.print(caracter[i]);
            
        }
        JOptionPane.showMessageDialog(null,"Su mensaje desencriptado es: "+String.valueOf(caracter));
        System.out.println("");  
    }
   
}