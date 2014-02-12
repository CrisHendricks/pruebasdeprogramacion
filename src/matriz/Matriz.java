package matriz;

import java.util.Random;
import java.util.Scanner;

public class Matriz {

    static private String[][] matrizCadena = new String[5][5];
    private static int puntos = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        resetear();
        cadenas();
        imprimir();
        while (true) {
            System.out.println("Puntos: " + puntos);
            System.out.println("Introduzca direccion:  ");
            direccion(sc.nextLine());
            imprimir();

        }

    }

    public static void resetear() {

        for (int num = 0; num < matrizCadena.length; num++) {
            for (int num2 = 0; num2 < matrizCadena.length; num2++) {
                matrizCadena[num][num2] = " ";
            }
        }
    }

    public static void cadenas() {

        matrizCadena[0][0] = "x";
        Random random = new Random();
        random.nextInt(matrizCadena.length);
        matrizCadena[random.nextInt(matrizCadena.length)][random.nextInt(matrizCadena.length)] = "0";
    }

    public static void imprimir() {

        for (int i = 0; i < matrizCadena.length; i++) {
            for (int o = 0; o < matrizCadena.length; o++) {
                System.out.print("[" + matrizCadena[i][o] + "]");
            }
            System.out.println("");
        }

    }

    public static void direccion(String dire) {

        switch (dire) {

            case "a":
                BUCLE:
                for (int i = 0; i < matrizCadena.length; i++) {
                    for (int o = 0; o < matrizCadena.length; o++) {

                        if (matrizCadena[i][o].equals("x")) {
                            if (matrizCadena[i][o - 1].equals("0")) {
                                puntos++;
                                resetear();
                                cadenas();
                            } else {
                                matrizCadena[i][o - 1] = matrizCadena[i][o];
                                matrizCadena[i][o] = " ";
                            }
                            break BUCLE;
                        }

                    }
                }
                break;
            case "d":
                BUCLE:
                for (int i = 0; i < matrizCadena.length; i++) {
                    for (int o = 0; o < matrizCadena.length; o++) {
                        if (matrizCadena[i][o].equals("x")) {
                            if (matrizCadena[i][o + 1].equals("0")) {
                                puntos++;
                                resetear();
                                cadenas();
                            } else {
                                matrizCadena[i][o + 1] = matrizCadena[i][o];
                                matrizCadena[i][o] = " ";
                            }
                            break BUCLE;
                        }

                    }
                }
                break;
            case "s":
                BUCLE:
                for (int i = 0; i < matrizCadena.length; i++) {
                    for (int o = 0; o < matrizCadena.length; o++) {
                        if (matrizCadena[i][o].equals("x")) {
                            if (matrizCadena[i + 1][o].equals("0")) {
                                puntos++;
                                resetear();
                                cadenas();
                            } else {
                                matrizCadena[i + 1][o] = matrizCadena[i][o];
                                matrizCadena[i][o] = " ";
                            }
                            break BUCLE;
                        }

                    }
                }
                break;
            case "w":
                BUCLE:
                for (int i = 0; i < matrizCadena.length; i++) {
                    for (int o = 0; o < matrizCadena.length; o++) {
                        if (matrizCadena[i][o].equals("x")) {
                            if (matrizCadena[i - 1][o].equals("0")) {
                                puntos++;
                                resetear();
                                cadenas();
                            } else {
                                matrizCadena[i - 1][o] = matrizCadena[i][o];
                                matrizCadena[i][o] = " ";
                            }
                            break BUCLE;
                        }

                    }
                }
                break;
        }
    }

    public static void setDireccion(int pFila, int pColum) {

        for (int i = 0; i < matrizCadena.length; i++) {
            for (int o = 0; o < matrizCadena.length; o++) {
                if (matrizCadena[i][o].equals("x")) {
                    matrizCadena[pFila][pColum] = matrizCadena[i][o];
                    matrizCadena[i][o] = " ";
                    break;
                }

            }
        }
    }
}
