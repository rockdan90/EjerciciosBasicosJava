public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 12");
        System.out.println("Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.");


        for (int i = 0; i <= 100; i++) {
            
            if(i%2==0){
                System.out.println(i+"- Es divisible entre dos");
            }
            if(i%2==0 && i%3==0){
                System.out.println(i+"- Es divisible entre dos y tres");
            }
            if(i%3==0){
                System.out.println(i+"- Es divisible entre tres");
            }
        }
    }    
}
