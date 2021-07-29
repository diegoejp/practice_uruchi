package main;

import java.util.Scanner;

public class PracticoProgramacionJava {

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
            System.out.println("Preciona 0 para Salir");

            opt1 = in.nextInt();

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
            }

        } while (opt1 != 0);


    }

    public static String returnReverseString(String text) {
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
        for (int i = num2.length()-1; i >= 0; i--) {

            strReverse += num2.charAt(i);
            System.out.println(num2.charAt(i));
        }
        numReverse = Integer.parseInt(strReverse);
        if (num == numReverse) {
            state = true;
        }else state =false;

        return state;
    }
}
