package com.coudevi;

public class Main {

//-------------------------------------------------------------------------------------
    //Ejercicio 1: Suma de números pares positivos

    // Dado un arreglo de números enteros, crea un metodo que sume únicamente
    // los números pares y positivos.
    // Si no existen números que cumplan la condición, el metodo debe retornar 0.

//    public static void main(String[] args) {
//        int[] entrada = {3, 4, -2, 8, 7};
//        int resultado = sumarParesPositivos(entrada);
//        System.out.println(resultado);
//    }

    public static int sumarParesPositivos(int[] numeros){
        int suma = 0;
        for (int num : numeros){
            if (num > 0 && num % 2 == 0){
                suma += num;
            }
        }
        return suma;
    }
//-------------------------------------------------------------------------------------

    // Ejercicio 2: Producto de números impares positivos
    // El programa debe:
    // Recibir un arreglo de números
    // Multiplicar solo los números impares y positivos
    // Si no hay ninguno, devolver 0

//    public static void main(String[] args){
//        int[] entrada = {3, 4, 7, -1, 2};
//        int resultado = productoImparesPositivos(entrada);
//        System.out.println(resultado);
//    }

    public static int productoImparesPositivos(int[] numeros){
        int producto = 1;
        boolean hayImpares = false;
        for (int num : numeros){
            if (num > 0 && num % 2 != 0){
                producto *= num;
                hayImpares = true;
            }
        }
        return  hayImpares ? producto : 0;
    }
//-------------------------------------------------------------------------------------

    // Ejercicio: Verificar si un número es primo
    // Crea un programa que: Reciba un número entero, Determine si es número primo y
    // Muestre el resultado en consola
    // Un número primo: Es mayor que 1 y Solo es divisible entre 1 y él mismo

//    public static void main(String[] args){
//        int numero = 7;
//        boolean esPrimo = verificarPrimo(numero);
//        System.out.println(esPrimo);
//    }

    public static boolean verificarPrimo(int numero){
        if (numero <= 1){
            return false;
        }
        for (int i = 2; i < numero; i++){
            if (numero % i == 0 ){
                return false;
            }
        }
        return true;
    }
//-------------------------------------------------------------------------------------
    // Ejercicio: Contar Numeros pares
    // Dado un arreglo de numeros enteros, cuenta cuantos numeros pares existen
    // {4, 7, 2, 9, 6}


//    public static void main(String[] args){
//        int[] numeros = {4, 7, 2, 9, 6};
//        int cantidad = contarPares(numeros);
//        System.out.println(cantidad);
//    }

    public static int contarPares(int[] numeros){
        int contador = 0;
        for (int num : numeros){
            if (num % 2 == 0){
                contador++;
            }
        }
        return contador;
    }
//-------------------------------------------------------------------------------------

    // Ejercicio: Invertir un numero entero positivo, crea un programa que invierta sus digitos

//    public static void main(String[] args){
//        int numero = 321;
//        int invertido = invertirNumero(numero);
//        System.out.println(invertido);
//    }

    public static int invertirNumero(int numero){
        int invertido = 0;
        while(numero > 0){
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }
        return invertido;
    }
//-------------------------------------------------------------------------------------

    // Ejercicio: Verificar si un numero es palindromo
    // Un numero es palindromo si se lee igual de izquierda a derecha que de derecha a izquierda
    // 121 => palindromo true || 123 => no palindromo false

//    public static void main(String[] args){
//        int numero = 121;
//        boolean esPalindromo = esPalindromo(numero);
//        System.out.println(esPalindromo);
//    }

    public static boolean esPalindromo(int numero){
        int original = numero;
        int invertido = 0;
        while (numero > 0){
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }
        return original == invertido;
    }

//-------------------------------------------------------------------------------------

    // Ejercicio: Sumar los digitos de un numero
    // Dado un numero entero positivo, crea un programa que sume todos sus digitos

//    public static void main(String[] args){
//        int numero = 123;
//        int suma = sumarDigitos(numero);
//        System.out.println(suma);
//    }

    public static int sumarDigitos(int numero) {
        int suma = 0;
        while (numero > 0) {
            int digito = numero % 10;
            suma += digito;
            numero = numero / 10;
        }
        return suma;
    }
//-------------------------------------------------------------------------------------

    // Ejercicio: Encontrar el menor numero de un arreglo
    // Dado un arreglo de numeros enteros, crea un programa que encuentre y
    // retorne el número menor || {8, 3, 10, 1, 6}  => resultad = 1

//    public static void main(String[] args){
//        int[] numeros = {8, 3, 10, 1, 6};
//        int menor = encontrarMenor(numeros);
//        System.out.println(menor);
//    }

    public static int encontrarMenor(int[] numeros){
        int menor = numeros[0];
        for (int num : numeros){
            if(num < menor){
                menor = num;
            }
        }
        return menor;
    }

//-------------------------------------------------------------------------------------

    // Ejercicio: Encontrar el mayor numero de un arreglo
    // Dado un arreglo de numeros enteros, crea un programa que encuentre y
    // retorne el número mayor || {4, 9, 2, 15, 7} => resultado 15

//    public static void main(String[] args){
//        int[] numeros = {4, 9, 2, 15, 7};
//        int mayor = encontrarMayor(numeros);
//        System.out.println(mayor);
//    }

    public static int encontrarMayor(int[] numeros){
        int mayor = numeros[0];
        for (int num : numeros){
            if (num > mayor){
                mayor = num;
            }
        }
        return mayor;
    }

//-------------------------------------------------------------------------------------

    // Ejercicio: Contar cuantas veces aparece un numero en un arreglo
    // Dado un arreglo de numeros enteros y un numero a buscar, crea un programa que cuente
    // cuantas veces aparece ese numero en el arreglo
    // Arreglo: {1, 3, 5, 3, 7, 3}
    // Número a buscar: 3
    // Resultado: 3

//    public static void main(String[] args){
//        int[] numeros = {1, 3, 5, 3, 7, 3};
//        int buscar = 3;
//        int cantidad = contarApariciones(numeros, buscar);
//        System.out.println(cantidad);
//    }

    public static int contarApariciones(int[] numeros, int buscar){
        int contador = 0;
        for (int num : numeros){
            if (num == buscar){
                contador++;
            }
        }
        return contador;
    }

//-------------------------------RETO TECNICO------------------------------------------------------

    // CREA UN PROGRAMA EN JAVA QUE HAGA LO SIGUIENTE
    //Dado un arreglo de números enteros positivos, realiza estas operaciones:
    //
    //🔹 Encuentra el número mayor
    //
    //🔹 Encuentra el número menor
    //
    //🔹 Cuenta cuántos números pares hay
    //
    //🔹 Calcula la suma de los dígitos del número mayor

    // int[] numeros = {12, 7, 5, 24, 9};

    public static void main(String[] args){
        int[] numeros = {12, 7, 5, 24, 9};
        int mayor = encontraMayor(numeros); // 1
        int menor = encontraMenor(numeros); // 2
        int cantidad = contarPar(numeros);   // 3
        int suma = sumarDigito(mayor);    // 4
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Cantidad de pares: " + cantidad);
        System.out.println("Suma de dígitos del mayor: " + suma);
    }

    // 1
    public static int encontraMayor(int[] numeros){
        int mayor = numeros[0];
        for (int num : numeros){
            if (num > mayor){
                mayor = num;
            }
        }
        return mayor;
    }

    // 2
    public static int encontraMenor(int[] numeros){
        int menor = numeros[0];
        for (int num : numeros){
            if (num < menor){
                menor = num;
            }
        }
        return menor;
    }

    // 3
    public static int contarPar(int[] numeros){
        int contador = 0;
        for (int num : numeros){
            if (num % 2 == 0){
                contador++;
            }
        }
        return contador;
    }

    // 4
    public static int sumarDigito(int numero) {
        int suma = 0;
        while (numero > 0) {
            int digito = numero % 10;
            suma += digito;
            numero = numero / 10;
        }
        return suma;
    }

}// fin de la clase