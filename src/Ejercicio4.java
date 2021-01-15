import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

// 4) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).
public class Ejercicio4 {
    public static void main(String[] args) throws IOException{
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresa tu nombre: ");
        String nombre=read.readLine();
        JOptionPane.showMessageDialog(null,"Bienvenido "+nombre);
        // System.out.println("Bienvenido "+nombre);
    }
}
