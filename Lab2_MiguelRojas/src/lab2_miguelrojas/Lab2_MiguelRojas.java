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
        //Instancia de personajes
        Personajes per0 = new Personajes("Mago", "Miguel The Wise", "Humano", 1.80, 70, 18, "El mago mas poderoso", "Norfair", 75, 20);
        lista.add(per0);
        Personajes per1 = new Personajes("Barbaro", "Daenerys The Mad", "Mediano", 1.70, 65, 30, "La reina loca", "Brinstar", 50, 65);
        lista.add(per1);
        Personajes per2 = new Personajes("Clerigo", "Robb Stark", "Humano", 1.75, 65, 23, "The King of the North", "Zebes", 70, 40);
        lista.add(per2);
        Personajes per3 = new Personajes("Picaro", "Link of Hyrule", "Elfo", 1.90, 50, 40, "El mejor arquero", "Crateria", 55, 50);
        lista.add(per3);
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
                                flag_n = true;
                                break;
                            case 2:
                                nacionalidad = "Brinstar";
                                flag_n = true;
                                break;
                            case 3:
                                nacionalidad = "Maridia";
                                flag_n = true;
                                break;
                            case 4:
                                nacionalidad = "Zebes";
                                flag_n = true;
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
                    int hp = 0;
                    if (raza == "Mediano") {
                        hp = 50 + r.nextInt(60 - 50);
                    } else if (raza == "Enano") {
                        hp = 80 + r.nextInt(100 - 80);
                    } else if (raza == "Elfo") {
                        hp = 50 + r.nextInt(70 - 50);
                    } else if (raza == "Humano") {
                        hp = 40 + r.nextInt(75 - 40);
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
                    int n = 4;

                    Personajes per = new Personajes(tipo_personaje, nombre, raza, estatura, peso, años, descrip, nacionalidad, hp, ac);
                    lista.add(per);

                    System.out.println(lista.get(4));
                    n++;
                    System.out.println("Se Agrego con exito Su personaje\n");
                    break;
                case 'b':
                case 'B':
                    System.out.println("Modificación de Personaje");

                    break;
                case 'c':
                case 'C':
                    System.out.println("Ver Atributos de Personaje");

                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i));
                        System.out.println("Posicion = " + i);
                    }
                    System.out.println();
                    break;
                case 'd':
                case 'D':
                    System.out.println("Eliminar Personaje");
                    System.out.print("Ingrese posicion del personaje: ");
                    int pos = sc.nextInt();
                    lista.remove(pos);
                    System.out.println("Se ha eliminado el personaje exitosamente");
                    break;
                case 'e':
                case 'E':
                    System.out.println("Simulación de Combate\n");
                    Combate(lista);
                    System.out.println();
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

    public static void Combate(ArrayList lista) {

        Random r2 = new Random();
        Scanner sc = new Scanner(System.in);

        int damage = 0;
        int damage2 = 0;
        int turno = 1;
        boolean end = false;
        //Players
        System.out.println("Lista de Personajes");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("[" + i + "]" + ((Personajes) lista.get(i)).getNombre());
        }
        System.out.println();
        System.out.println("Ingrese opcion: ");
        int player = sc.nextInt();
        int player2 = 0 + r2.nextInt(4);

        while (player2 == player) {
            player2 = 0 + r2.nextInt(4);
        }
        while (end == false) {
            if (turno % 2 != 0) {
                System.out.println("Turno de Jugador");
                System.out.println("[1] Atacar");
                System.out.println("[2] Defender");
                System.out.print("Ingrese que hacer: ");
                int decision = sc.nextInt();
                switch (decision) {
                    case 1:
                        int attack_player1 = r2.nextInt(99) + 1;
                        int crit_player1 = 0;
                        int crit_player2 = 0;

                        //Crit a superar
                        if (((Personajes) lista.get(player2)).getTipo_personaje() == "Clerigo") {
                            crit_player2 = 97;
                        } else if (((Personajes) lista.get(player2)).getTipo_personaje() == "Barbaro") {
                            crit_player2 = 93;
                        } else if (((Personajes) lista.get(player2)).getTipo_personaje() == "Mago") {
                            crit_player2 = 101;
                        } else if (((Personajes) lista.get(player2)).getTipo_personaje() == "Picaro") {
                            crit_player2 = 80;
                        }

                        //Damage
                        if (player == 0) {
                            //Random del mago
                            damage = r2.nextInt(10 - 5) + 5;
                        } else if (player == 1) {
                            //Random del barbaro
                            damage = r2.nextInt(30 - 15) + 15;
                        } else if (player == 2) {
                            //Random de clerigo
                            damage = r2.nextInt(15 - 5) + 5;
                        } else if (player == 3) {
                            //Random del Picaro
                            damage = r2.nextInt(25 - 15) + 15;
                        } else {
                            //Else si el personaje no es de los predeterminados
                            if (((Personajes) lista.get(player)).getTipo_personaje() == "Clerigo") {
                                damage = r2.nextInt(15 - 5) + 5;
                            } else if (((Personajes) lista.get(player)).getTipo_personaje() == "Barbaro") {
                                damage = r2.nextInt(30 - 15) + 15;
                            } else if (((Personajes) lista.get(player)).getTipo_personaje() == "Mago") {
                                damage = r2.nextInt(10 - 5) + 5;
                            } else if (((Personajes) lista.get(player)).getTipo_personaje() == "Picaro") {
                                damage = r2.nextInt(25 - 15) + 15;
                            }
                        }

                        //Ataque
                        ((Personajes) lista.get(player)).getAC();
                        if (attack_player1 > ((Personajes) lista.get(player2)).getAC()) {
                            //Validar si el ataque es mayor que el crit
                            if (attack_player1 > crit_player2) {
                                crit_player1 = damage * 2;
                                ((Personajes) lista.get(player2)).setHP(((Personajes) lista.get(player)).getHP() - crit_player1);
                                System.out.println(((Personajes) lista.get(player)).getNombre() + "Pego un critico de " + crit_player1 + "\na "+((Personajes) lista.get(player2)).getNombre());
                            } else {
                                //Atacar con damage normal
                                ((Personajes) lista.get(player2)).setHP(((Personajes) lista.get(player)).getHP() - damage);
                                System.out.println(((Personajes) lista.get(player)).getNombre() + " le pego a " + ((Personajes) lista.get(player2)).getNombre() + " por " + damage);
                            }

                            //Verificar si termino el juego
                            if (((Personajes) lista.get(player2)).getHP() <= 0) {
                                System.out.print("El personaje " + ((Personajes) lista.get(player2)).getNombre() + "ha muerto ");
                                System.out.println("A perdido la computadora");
                                end = true;
                            }
                        } else {
                            System.out.println("El ataque de " + ((Personajes) lista.get(player)).getNombre() + "Fue muy debil");
                        }
                        break;
                    case 2:
                        ((Personajes) lista.get(player)).setAC(((Personajes) lista.get(player)).getAC() + 15);
                        System.out.println("Su Armadura a incrementado por 15 puntos");
                        System.out.println("Armadura = " + ((Personajes) lista.get(player2)).getAC());
                        break;
                    default:
                        System.out.println("Perdio un turno");
                }
                System.out.println();
                turno++;
            } else {
                //Turno de CPU
                System.out.println("Turno de " + ((Personajes) lista.get(player2)).getNombre());
                int decision = r2.nextInt(1) + 1;
                switch (decision) {
                    case 1:
                        int attack_player2 = r2.nextInt(99) + 1;
                        int crit_player1 = 0;
                        int crit_player2 = 0;

                        //Crit a superar
                        if (((Personajes) lista.get(player)).getTipo_personaje() == "Clerigo") {
                            crit_player1 = 97;
                        } else if (((Personajes) lista.get(player)).getTipo_personaje() == "Barbaro") {
                            crit_player1 = 93;
                        } else if (((Personajes) lista.get(player)).getTipo_personaje() == "Mago") {
                            crit_player1 = 101;
                        } else if (((Personajes) lista.get(player)).getTipo_personaje() == "Picaro") {
                            crit_player1 = 80;
                        }

                        //Damage
                        if (player2 == 0) {
                            //Random del mago
                            damage2 = r2.nextInt(10 - 5) + 5;
                        } else if (player2 == 1) {
                            //Random del barbaro
                            damage2 = r2.nextInt(30 - 15) + 15;
                        } else if (player2 == 2) {
                            //Random de clerigo
                            damage2 = r2.nextInt(15 - 5) + 5;
                        } else if (player2 == 3) {
                            //Random del Picaro
                            damage2 = r2.nextInt(25 - 15) + 15;
                        } else {
                            //Else si el personaje no es de los predeterminados
                            if (((Personajes) lista.get(player2)).getTipo_personaje() == "Clerigo") {
                                damage = r2.nextInt(15 - 5) + 5;
                            } else if (((Personajes) lista.get(player2)).getTipo_personaje() == "Barbaro") {
                                damage = r2.nextInt(30 - 15) + 15;
                            } else if (((Personajes) lista.get(player2)).getTipo_personaje() == "Mago") {
                                damage = r2.nextInt(10 - 5) + 5;
                            } else if (((Personajes) lista.get(player2)).getTipo_personaje() == "Picaro") {
                                damage = r2.nextInt(25 - 15) + 15;
                            }
                        }

                        //Ataque
                        ((Personajes) lista.get(player)).getAC();
                        if (attack_player2 > ((Personajes) lista.get(player)).getAC()) {
                            //Validar si el ataque es mayor que el crit
                            if (attack_player2 > crit_player1) {
                                crit_player2 = damage2 * 2;
                                ((Personajes) lista.get(player)).setHP(((Personajes) lista.get(player)).getHP() - crit_player2);
                                System.out.println(((Personajes) lista.get(player)).getNombre() + " Pego un critico de " + crit_player1 + "\na "+((Personajes) lista.get(player2)).getNombre());
                            } else {
                                //Atacar con damage normal
                                ((Personajes) lista.get(player)).setHP(((Personajes) lista.get(player)).getHP() - damage2);
                                System.out.println(((Personajes) lista.get(player2)).getNombre() + " le pego a " + ((Personajes) lista.get(player)).getNombre() + " por " + damage2);
                            }
                            //Verificar si la vida del primer jugador es <=0
                            //Asi termina la simulacion
                            if (((Personajes) lista.get(player)).getHP() <= 0) {
                                System.out.print(((Personajes) lista.get(player)).getNombre() + " ha muerto .");
                                System.out.println("A perdido el judgador 1 ");
                                end = true;
                            }
                        } else{
                            System.out.println("El ataque de " + ((Personajes) lista.get(player2)).getNombre() + " Fue muy debil");
                        }
                        break;
                    case 2:
                        ((Personajes) lista.get(player2)).setAC(((Personajes) lista.get(player2)).getAC() + 15);
                        System.out.println("Su Armadura a incrementado por 15 puntos");
                        System.out.println("Armadura = " + ((Personajes) lista.get(player2)).getAC());
                        break;
                    default:
                        System.out.println("Fallo la CPU");
                }
                System.out.println();
                turno ++;
            }
        }

    }
}
