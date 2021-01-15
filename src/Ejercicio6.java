import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[] args) {
        System.out.println("Ejercicio 6");
        System.out.println("Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.");
        Scanner read=new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int number=read.nextInt();

        if (number%2==0) {
            System.out.println(number+" es divisible entre 2");
        } else {
            System.out.println(number+" no es divisible entre 2");
        }

        System.out.println("el numero "+number);
    }
}