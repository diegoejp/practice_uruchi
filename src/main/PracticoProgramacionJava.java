package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PracticoProgramacionJava {
    //public static List<Integer> ejemploLista = new ArrayList<Integer>(5);
    public static Integer[] arrayglobal = new Integer[5];
    public static int auxGlobal = 5;
    public static int ubicacion = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opt1 = 0;

        System.out.println("Bienvenido a mi App Java");
        do {

            System.out.println("--------------");
            System.out.println("Selecciona una funcion del menú");
            System.out.println("1.- Es Femenino");
            System.out.println("2.- La suma es Par");
            System.out.println("3.- Si alguno es Par");
            System.out.println("4.- Compara 2 palabras");
            System.out.println("5.- Es Capiúca");
            System.out.println("6.- Es menor a que b");
            System.out.println("7.- A*B = A/C ?: ");
            System.out.println("8.- Comparar arreglos");
            System.out.println("9.- Devolver palabra al revés");
            System.out.println("10.- Cambiar vocales por x");
            System.out.println("11.- Mostrar n° de últimos 5 ej: ");
            System.out.println("Preciona 0 para Salir");

            opt1 = in.nextInt();
            ultimos5(opt1);


            switch (opt1) {
                case 1:
                    System.out.println("Tu sexo es Femenino : " + isFeminine());
                    break;
                case 0:
                    System.out.println("Gracias por usar la App hasta pronto!");

                    break;
                case 2:
                    System.out.println("La suma de pos 2,3 y 4 es Par :  " + sumaEsPar());
                    break;
                case 3:
                    System.out.println("ALguno de tus numero es par : " + siUnoesPar());
                    break;
                case 4:
                    System.out.println("Tus palabras son iguales: " + sonIguales());
                    break;
                case 5:
                    System.out.println("Tu numero es Capicúa: " + esCapicua());
                    break;
                case 6:
                    System.out.println("Tu numero es menor: " + esMenor());
                    break;
                case 7:
                    System.out.println("a*b = a/b : " + aPorB());
                    break;
                case 8:
                    System.out.println("Tu arreglo contiene 2 = al menos: " + compararArreglos());
                    break;
                case 9:
                    System.out.println(returnReverseString());
                    break;
                case 10:
                    System.out.println(devolverConX());
                    break;

            }

        } while (opt1 != 0);


    }

    public static String returnReverseString() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa Palabra");
        var text = in.nextLine();
        var chain = "";
        for (var i = text.length() - 1; i >= 0; i--) {
            //.charArt(index) return a char of given  int argument
            chain += text.charAt(i);
        }
        return chain;
    }

    public static boolean isFeminine() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa tu sexo");
        char sex = in.next().charAt(0);

        boolean state = true;
        sex = Character.toLowerCase(sex);
        //Using method Character.compare(char1,char2)
        if (sex == 'f') {
            state = true;
        } else if (sex == 'm') {
            state = false;
        }
        return state;
    }

    public static boolean sumaEsPar() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa 5 números para tu arreglo");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa numero para posicion " + i);
            arr[i] = in.nextInt();
        }
        int suma = 0;
        boolean state = false;
        if (arr.length < 5) {
            System.out.println("Tu arreglo no sirve para este Ejercicio");
        } else {
            suma = arr[2] + arr[3] + arr[4];
            if (suma % 2 == 0) {
                state = true;
            } else {
                state = false;
            }
        }
        return state;
    }

    public static boolean siUnoesPar() {
        Scanner in = new Scanner(System.in);
        boolean state = false;
        System.out.println("Ingresa 3 números para tu arreglo");
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa numero  " + (i + 1));
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                state = true;
            }
        }
        return state;
    }

    public static boolean sonIguales() {
        Scanner in = new Scanner(System.in);
        boolean state = false;
        System.out.println("Ingresa palabra");
        String str1 = in.nextLine();
        System.out.println("Ingresa otra palabra");
        String str2 = in.nextLine();
        if (str1.equals(str2)) {
            state = true;
        }
        return state;
    }

    public static boolean esCapicua() {
        Scanner in = new Scanner(System.in);
        boolean state;
        String strReverse = "";
        int numReverse = 0;
        System.out.println("Ingresa un entero");
        int num = in.nextInt();
        String num2 = Integer.toString(num);
        for (int i = num2.length() - 1; i >= 0; i--) {

            strReverse += num2.charAt(i);
            System.out.println(num2.charAt(i));
        }
        numReverse = Integer.parseInt(strReverse);
        if (num == numReverse) {
            state = true;
        } else state = false;

        return state;
    }

    public static boolean esMenor() {
        boolean state = false;

        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa numero 1");
        int num1 = in.nextInt();
        System.out.println("Ingresa numero 1");
        int num2 = in.nextInt();
        if (num1 < num2) {
            state = true;
        } else if (num1 > num2) {
            state = false;
        } else {
            state = false;
            System.out.println("Tus números son iguales");
        }

        return state;
    }

    public static boolean compararArreglos() {
        int arr1[] = {1, 2, 4, 5};
        int arr2[] = {1, 3, 6, 7};
        int aux = 0;
        boolean state = false;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    aux++;
                    if (aux >= 2) {
                        state = true;
                    }
                }
            }
        }
        return state;
    }

    public static boolean aPorB() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa n° 1");
        int num1 = in.nextInt();
        System.out.println("Ingresa n° 1");
        int num2 = in.nextInt();

        int resultadoM = num1 * num2;
        int resultadoD = num1 / num2;
        if (num1 == 0 || num2 == 0) {
            return false;
        }
        if (resultadoM == resultadoD) {
            return true;
        } else return false;
    }

    public static String devolverConX() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa tu palabra");
        String palabra = in.nextLine();
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (palabra.charAt(i) == vocales[j]) {
                    palabra = palabra.replace(palabra.charAt(i), 'x');
                }
            }
        }
        return palabra;
    }

    public static void ultimos5(int opt) {

        if (arrayglobal[0] == null) {
            arrayglobal[ubicacion] = opt;
            ubicacion++;
            auxGlobal--;
        }


            if (auxGlobal == 1) {
                arrayglobal[0] = arrayglobal[1];
                arrayglobal[1] = arrayglobal[2];
                arrayglobal[2] = arrayglobal[3];
                arrayglobal[3] = arrayglobal[4];
                arrayglobal[4] = opt;
                auxGlobal = 5;
                ubicacion = 0;
            }

            System.out.println(Arrays.toString(arrayglobal));
        }


    }
