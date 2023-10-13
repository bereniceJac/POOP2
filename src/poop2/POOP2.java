/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop2;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 */
public class POOP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Instrucciones para imprimir a pantalla, el primero es el usual, y el otro sale la impresión en rojo
         */
        System.out.println("Hola mundo");
        System.err.println("Hola mundo");
        
        /**
         * Imprime un mensaje a pantalla en la pantalla según la relación entre las variables 'a' y 'b'
         * @param a primera variable a comprar
         * @param b segunda variable a comprar
         */
        System.out.println("############## if ##############");
        int a;
        a = 15;
        int b = 10;
        if (a<b) {
            System.out.println("a es menor que b");
        } else if (a==b){
            System.out.println("a es igual a b");
        }else{
            System.out.println("a es mayor que b");
        }
        
        /**
         * Imprime un mensaje a pantalla en la pantalla según el valor que devuelve el método 'metor()'
         * @param a primera variable a comprar
         * @param b segunda variable a comprar
         */
        System.out.println("############## if ##############");
        if(menor(a,b)){
            System.out.println("metodo menor retorna true");
        }else{
            System.out.println("metodo menor retorna false");
        }
        
        /**
         * Imprime el nombre del día de la semana correspondiente al número dado
         * @param dia número de día de la semana
         */
        System.out.println("############## Switch ##############");
        int dia = 1;
        switch (dia) {
            case 1: 
                System.out.println("Domingo"); 
                break;
            case 2:
                System.out.println("Lunes"); 
                break;
            case 3: 
                System.out.println("Martes"); 
                break;
            case 4: 
                System.out.println("Miercoles"); 
                break;
            case 5: 
                System.out.println("Jueves"); 
                break;
            case 6: 
                System.out.println("Viernes"); 
                break;
            case 7: 
                System.out.println("Sabado"); 
                break;
            default:
                System.out.println("Día incorrecto");
        }
        /**
         * Imprime la vocal correspondiente a lo que tenga la variable 'vocal'
         * @param vocal la vocal seleccionada
         */
        System.out.println("############## Switch ##############");
        char vocal = '9';
        switch (vocal) {
            case 'a': 
                System.out.println("Seleccionó vocal a"); 
                break;
            case 'e': 
                System.out.println("Seleccionó vocal e"); 
                break;
            case 'i': 
                System.out.println("Seleccionó vocal i"); 
                break;
            case 'o': 
                System.out.println("Seleccionó vocal o"); 
                break;
            case 'u': 
                System.out.println("Seleccionó vocal u");
                break;
            default:
                System.out.println("No se seleccionó una vocal");
        }
        /**
         * Imprime los números del 0 al 9, primero hacia arriba y luego hacia abajo
         * el ciclo while realiza por lo menos una vuelta, aún si la condición es falsa
         */
        System.out.println("############## While ##############");
        int n=0;
        while (n<10) {
            System.out.println("Contando hacia arriba n="+n);
            n++;
        }
        while (n>0) {
            System.out.println("Contando hacia abajo n="+n);
            n--;
        }
        System.out.println("n="+n);
       
        System.out.println("############## Do-While ##############");
        do {            
            System.out.println("Contando hacia abajo");
            n--;
        } while (n>0);
        System.out.println("n="+n);
        
        /**
         * Imprime los número del 0 hasta el 9, primero hacia arriba y  luego hacia abajo 
         * El ciclo for se repite un número determinado de veces
         */
        System.out.println("############## For ##############");
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba "+i);  
        }
        
        for (int i = 10; i > 0; i--) {
            System.out.println("Contando hacia abajo " + i);
        }
        
        /**
         * Imprime el número de elementos de dos arreglos y los valores de uno de los arreglos
         * Imprime un mapeo en porcentaje de los valores del arreglo
         */
        System.out.println("############## For ##############");
        int[] miArreglo = {1,2,3,4,5};
        int numElementos = miArreglo.length;
        System.out.println("miArreglo tiene "+numElementos+" elementos");
        int[] miArreglo2 = new int[10];
        numElementos = miArreglo2.length;
        System.out.println("miArreglo2 tiene "+numElementos+" posiciones");
        for (int i = 0; i < miArreglo2.length; i++) {
            miArreglo2[i] = i*10;
        }
        for (int i = 0; i < miArreglo2.length; i++) {
            System.out.println("miArreglo2["+i+"]="+miArreglo2[i]);
        }
        for (int i = 0; i < miArreglo2.length; i++) {
            int j = miArreglo2[i];
            System.out.println("Mapeo en porcentaje "+j+"%");
        }
        
        /**
         * Imprime un mensaje que indica que se está hackeando la NASA con un porcentaje correspondiente a cada elemento del arreglo 'miArreglo2', por medio de un for-each
         */
        System.out.println("############## For-each ##############");
        for (int i : miArreglo2) {
            System.out.println("Hackeando la nasa "+i+"%");
        }
    }
    
    /**
     * Returna verdadero ('true') si 'x' es menor que 'y', falso ('false') en caso contrario
     * @param x primera variable a comparar
     * @param y segunda variable a comparar
     * @return 'true' si 'x' es menor que 'y', 'false' en caso contrario
     */
    private static boolean menor(int x, int y) {
        return x<y;
    }
    
}
