import java.util.Scanner;

// import javax.swing.JOptionPane;

public class Ejercicio07 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 7");
        System.out.println("Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.");
        Scanner read=new Scanner(System.in);
        System.out.println("Ingresa el código");
        int number=read.nextInt();
 
        //Pasamos el codigo a caracter
        char caracter=(char)number;
        System.out.println(caracter);
    }
}
