public class Ejercicio01 {
    // metodo main 
    // funcion publica 
    //public: Es el modificador de acceso del método. Pueden ser public 
        //(cualquier clase en cualquier paquete puede acceder al método), private 
        //(el método sólo puede usarse dentro de la misma clase) o protected 
        //(solo quienes hereden de dicha clase pueden acceder al método).
    //static: Indica que no es necesario crear una instancia de la clase para acceder al método.
        // Corresponde a la clase en general, mas no a una intancia.
    //void: Indica el tipo de objeto que regresa la función. En este caso la función no 
        //regresa ningún valor, por eso es void. Si una función regresara un texto sería String, 
        //si regresara un número entero sería int, etc.
    //main(String[] args): Nombre del método principal para ejecutar en consola con el JVM. 
        //Entre los paréntesis está el parámetro que recibe, en este caso un array (arreglo) que 
        //contiene strings; este array dentro del método se le identificará con el nombre args.
    public static void main(String[] args) throws Exception {

    // Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, 
    // multiplicación, división y módulo (resto de la división).
        float uno=10;
        float dos=5;

        System.out.println("la suma de "+uno+" mas "+dos+" es igual a: "+(uno+dos));
        System.out.println("la resta de "+uno+" menos "+dos+" es igual a: "+(uno-dos));
        System.out.println("la multiplicación de "+uno+" por "+dos+" es igual a: "+(uno*dos));
        System.out.println("la división de "+uno+" entre "+dos+" es igual a: "+(uno/dos));

    }
}
