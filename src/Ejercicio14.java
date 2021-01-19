import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Realiza una aplicación que nos calcule una ecuación de segundo grado. Debes pedir las variables a, b y c por teclado y comprobar antes que el discriminante (operación en la raíz cuadrada). Para la raíz cuadrada usa el método sqlrt de Math");
        double a,b,c,intraiz,x1,x2;
        Scanner read=new Scanner(System.in);
        System.out.println("Introduce el valor de a");
        a=read.nextDouble();
        System.out.println("Introduce el valor de b");
        b=read.nextDouble();
        System.out.println("Introduce el valor de c");
        c=read.nextDouble();
        intraiz=Math.sqrt((Math.pow(b, 2)-(4*(a*c))));

        x1=(((b)*(-1))+intraiz)/(2*a);
        x2=(((b)*(-1))-intraiz)/(2*a);
        
        System.out.println("las variables son a="+a+" b="+b+" c="+c);
        // interior de la raiz
        System.out.println("Dentro de la raiz "+intraiz);
        System.out.println("x1= "+x1);
        System.out.println("x2= "+x2);
        
    
    }
}
