public class Ejercicio2 {
        // 2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. 
        // Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
        public static void main(String[] args) {

        int uno=150;
        int dos=150;

        if (uno==dos) {
            System.out.println(uno+" es igual a "+dos);
        } else {
            if (uno>dos) {
                System.out.println(uno + " es mayor que "+dos);
            } else {
                System.out.println(uno + " es menor que "+dos);
            }
        }
    }
}
