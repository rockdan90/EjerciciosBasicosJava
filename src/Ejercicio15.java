import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 15");
        System.out.println("Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volvera a pedir(do while) despues myestra ese numero por consola");
        int num;
        Scanner read=new Scanner(System.in);
        
        do {
            num=read.nextInt();
            System.out.println("Numero: "+num);
            System.out.println("Para salir del sistema escribre un 0");
        } while (num!=0);
    }
}
