package org.example;

import clases.Estudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner objetoLector =  new Scanner(System.in);

        Estudiante[] estudiantes = new Estudiante[5];


        System.out.println("***MENU***");
        System.out.println("1- Agregar un estudiante");
        System.out.println("2. Ver estudiantes");
        System.out.println("3. SALIR");

        int opcion = 100;

        while (opcion != 3){

            System.out.println("Digite una opcion: ");
            opcion=objetoLector.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("Selecciono opcion 1");
                    for(int i = 0;i<estudiantes.length;i++){
                        Estudiante estudiante = new Estudiante();
                        System.out.println("Digite el nombre del estudiante: ");
                        estudiante.setNombre(objetoLector.next());
                        estudiantes[i]=estudiante;

                    }

                    break;
                case 2:
                    System.out.println("selecciona opcion 2");
                    for(int i = 0; i< estudiantes.length;i++){
                        System.out.println("Nombre de los estudiantes");
                        System.out.println(estudiantes[i].getNombre());
                    }
                    break;
                case 3:
                    System.out.println("adiosn bro");
                    break;
                default:
                    System.out.println("selecciona una opccion valida");

            }

        }
    }
}