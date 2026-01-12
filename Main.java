package Agendita;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner formidable = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion;

        do {
            System.out.println("\n--- MENÚ AGENDA ---");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Mostrar contactos");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = Integer.parseInt(formidable.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = formidable.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = formidable.nextLine();

                    if (agenda.añadirContacto(nombre, telefono)) {
                        System.out.println("Contacto añadido correctamente.");
                    } else {
                        System.out.println("La agenda está llena.");
                    }
                    break;

                case 2:
                    System.out.print("Nombre a buscar: ");
                    String nombreBuscar = formidable.nextLine();
                    agenda.buscarContactos(agenda.contactos, nombreBuscar, agenda.contador);
                    break;

                case 3:
                    agenda.mostrarContactos(agenda.contactos, agenda.contador);
                    break;

                case 4:
                    System.out.print("Nombre a eliminar: ");
                    String nombreEliminar = formidable.nextLine();
                    agenda.contador = agenda.eliminarContacto(
                            agenda.contactos,
                            nombreEliminar,
                            agenda.contador
                    );
                    break;

                case 5:
                    System.out.println("Saliendo de la agenda...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        formidable.close();
    }
}
