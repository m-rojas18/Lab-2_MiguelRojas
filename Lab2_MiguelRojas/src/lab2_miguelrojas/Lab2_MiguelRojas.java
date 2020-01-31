package lab2_miguelrojas;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2_MiguelRojas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        ArrayList lista = new ArrayList();

        String tipo_personaje = "";

        char resp = 's';
        while (resp == 's') {
            System.out.println("Codest");
            System.out.println("[A] Creación de Personaje");
            System.out.println("[B] Modificación de Personaje");
            System.out.println("[C] Ver Atributos de Personajes");
            System.out.println("[D] Eliminar Personaje");
            System.out.println("[E] Combate");
            System.out.println("[F] Salir");
            System.out.print("Ingrese opcion: ");
            char opcion = sc.next().charAt(0);

            switch (opcion) {
                case 'a':
                case 'A':
                    System.out.println("Creacion de Personaje");

                    boolean flag = false;
                    while (flag == false) {
                        System.out.println("[1] Clerigo");
                        System.out.println("[2] Barbaro");
                        System.out.println("[3] Mago");
                        System.out.println("[4] Picaro");
                        System.out.println("Seleccione un tipo de personaje");
                        int tipo = sc.nextInt();
                        //Elegir personaje
                        switch (tipo) {
                            case 1:
                                tipo_personaje = "Clerigo";
                                flag = true;
                                break;
                            case 2:
                                tipo_personaje = "Barbaro";
                                flag = true;
                                break;
                            case 3:
                                tipo_personaje = "Mago";
                                flag = true;
                                break;
                            case 4:
                                tipo_personaje = "Picaro";
                                flag = true;
                                break;
                            default:
                                System.out.println("Seleccione un tipo de personaje valido");
                                flag = false;
                        }

                        System.out.print("Ingrese nombre: ");
                        String nombre = sc.nextLine();
                        nombre = sc.nextLine();
                        //Selección de raza
                        String raza = "";
                        boolean flag_r = false;
                        while (flag_r == false) {
                            System.out.println("Seleccione Raza");
                            System.out.println("[1] Mediano");
                            System.out.println("[2] Enano");
                            System.out.println("[3] Elfo");
                            System.out.println("[4] Humano");
                            System.out.println("Seleccione opcion");
                            int op_raza = sc.nextInt();
                            switch (op_raza) {
                                case 1:
                                    raza = "Mediano";
                                    flag_r = true;
                                    break;
                                case 2:
                                    raza = "Enano";
                                    flag_r = true;
                                    break;
                                case 3:
                                    raza = "Elfo";
                                    flag_r = true;
                                    break;
                                case 4:
                                    raza = "Humano";
                                    flag_r = true;
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion valida");
                                    flag_r = false;
                            }
                        }
                        //Selección de estatura
                        System.out.print("Ingrese estatura: ");
                        Double estatura = sc.nextDouble();
                        //Seleccion de peso
                        System.out.print("Ingrese peso: ");
                        int peso = sc.nextInt();
                        //Selección de años
                        System.out.print("Ingrese años: ");
                        int años = sc.nextInt();
                        //Escribir Descripción
                        System.out.print("Escriba una descripcion del personaje: ");
                        String descrip = sc.nextLine();
                        descrip = sc.nextLine();
                        //Escribir Nacionalidad
                        String nacionalidad = "";
                        boolean flag_n = false;
                        while (flag_n == false) {
                            System.out.println("Seleccione una Nacionalidad");
                            System.out.println("[1] Norfair");
                            System.out.println("[2] Brinstar");
                            System.out.println("[3] Maridia");
                            System.out.println("[4] Zebes");
                            System.out.println("[5] Crateria");
                            System.out.println("Seleccione una opcion");
                            int opcion_nac = sc.nextInt();
                            switch (opcion_nac) {
                                case 1:
                                    nacionalidad = "Norfair";
                                    flag_n =true;
                                    break;
                                case 2:
                                    nacionalidad = "Brinstar";
                                    flag_n =true;
                                    break;
                                case 3:
                                    nacionalidad = "Maridia";
                                    flag_n =true;
                                    break;
                                case 4:
                                    nacionalidad = "Zebes";
                                    flag_n =true;
                                    break;
                                case 5:
                                    nacionalidad = "Crateria";
                                    flag_n = true;
                                    break;
                                default:
                                    System.out.println("Ingrese una opción valida");
                                    flag_n = false;
                            }
                        }

                        //Atributos aparte
                        //Hit points
                        int hp  = 0;
                        if (raza == "Mediano") {
                            hp = 50 + r.nextInt(60);
                        } else if (raza == "Enano") {
                            hp = 80 + r.nextInt(100);
                        } else if (raza == "Elfo") {
                            hp = 50 + r.nextInt(70);
                        } else if (raza == "Humano") {
                            hp = 40 + r.nextInt(75);
                        } else {
                            //do nothin
                        }

                        //Armor Class
                        int ac = 0;
                        if (tipo_personaje == "Clerigo") {
                            ac = 40;
                        } else if (tipo_personaje == "Barbaro") {
                            ac = 65;
                        } else if (tipo_personaje == "Mago") {
                            ac = 20;
                        } else if (tipo_personaje == "Picaro") {
                            ac = 50;
                        } else {
                            //do nothing
                        }

                        Personajes per = new Personajes(tipo_personaje, nombre, raza, estatura, peso, años, descrip, nacionalidad, hp, ac);
                        
                        lista.add(per);
                        
                        for (Object o : lista) {
                            System.out.println(o);
                        }
                    }

                    break;
                case 'b':
                case 'B':
                    break;
                case 'c':
                case 'C':
                    break;
                case 'd':
                case 'D':
                    break;
                case 'e':
                case 'E':
                    break;
                case 'f':
                case 'F':
                    resp = 'n';
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }

    }

}
