import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 13");
        System.out.println(" Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no");
        Scanner read=new Scanner(System.in);
        System.out.println("Ingresa el numero de ventas");
        int numVentas=read.nextInt();
        int ciclo=1;
        int totalVentas=0;
        System.out.println("Ingresa las "+numVentas+" ventas");
        while(ciclo<=numVentas){
            System.out.println("Ingresa la venta numero: "+ciclo);
            int ventas=read.nextInt();
            totalVentas=totalVentas+ventas;
            ciclo++;
        }
        System.out.println("En total en ventas fue "+totalVentas);
    }
}
