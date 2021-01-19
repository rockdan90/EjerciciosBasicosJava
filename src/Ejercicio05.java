import java.util.Scanner;

public class Ejercicio05 {
    /* 5) Haz una aplicación que calcule el área de un círculo(pi*R2). 
        El radio se pedirá por teclado (recuerda pasar de String a double 
        con Double.parseDouble). Usa la constante PI y el método pow de Math.]
    */

    public static void main(String[] args) {
        Double numero;
        Scanner read=new Scanner(System.in);
        System.out.println("ingresa el radio del circulo");
        String numeroString=read.nextLine();
        numero=Double.parseDouble(numeroString);
        System.out.println(numero+numero);
        System.out.println("el area del circulo con radio de "+numero+" es de: " +(Math.PI)*(Math.pow(numero,2)));
    }
}
