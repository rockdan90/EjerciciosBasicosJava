import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 8");
        System.out.println("8) Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char) y muestre su código en la tabla ASCII.");
        Scanner read=new Scanner(System.in);
        System.out.println("Ingresa el caracter");
        char caracter=read.next().charAt(0);
        int numero=(int)caracter;
        System.out.println(numero);
    }
}
