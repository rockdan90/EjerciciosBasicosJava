import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 9");
        System.out.println("Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.");
        final Double iva=0.21;
        Scanner read=new Scanner(System.in);
        System.out.println("Ingresa el precio");
        Double precio=read.nextDouble();
        System.out.println("el precio del producto es "+((precio*iva)+precio));

    }
}
