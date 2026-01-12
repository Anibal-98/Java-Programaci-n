package Agendita;

public class Agenda {
	/*
	 * Crea una clase Agenda que almacena hasta 10 contactos. Cada contacto tiene
	 * nombre y teléfono. Incluye métodos para:
	 * 
	 * Añadir un contacto. Buscar un contacto por nombre. Mostrar todos los
	 * contactos.
	 */

	Contacto[] contactos = new Contacto[10];
	int contador = 0;

	// Métodos

	// 1. Añadir un contacto.

	public boolean añadirContacto(String nombre, String telefono) {
		if (contador < contactos.length) {
			contactos[contador] = new Contacto(nombre, telefono);
			contador++;
			return true;
		}
		return false; // Agenda llena
	}

	// 2. Buscar contacto.

	public void buscarContactos(Contacto[] contactos, String nombre, int contador) {
		boolean encontrado = false;
		for (int i = 0; i < contador; i++) {
			if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Contacto encontrado: " + contactos[i]);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("No se encontró el contacto: " + nombre);
		}
	}
	// Mostrar todos los contactos.
	
	public void mostrarContactos (Contacto[] contactos, int contador) {
		if (contador == 0) 
			{
			System.out.println("La agenda está vacía.");
			} else {
				System.out.println("Lista de contactos: ");
				for (int i = 0; i < contador; i++) {
					System.out.println(contactos[i]);
				}
			}
	}
	
	// Eliminar contactos.
	
	public int eliminarContacto (Contacto[] contactos, String nombre, int contador) {
		boolean encontrado = false;
		for (int i = 0; i < contador; i++) {
			if (contactos[i].getNombre().equalsIgnoreCase(nombre)) 
				{
				 for (int j = i; j < contador - 1; j++) {
					 contactos[j] = contactos[j + 1];
				 }
				 contactos[contador - 1] = null;
				 contador --;
				 System.out.println("Contacto eliminado: " + nombre);
				 break;
				}
			}
		if (!encontrado) {
			System.out.println("No se encontró el contacto: " + nombre);
		
	}
		return contador;
 }
}