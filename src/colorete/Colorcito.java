package colorete;

import java.util.Arrays;

public class Colorcito {

    private String[] colores = {
        "Rojo",
        "Verde",
        "Azul",
        "Amarillo",
        "Naranja",
        "Morado",
        "Rosa",
        "Marrón",
        "Turquesa",
        "Gris"
    };

    // Constructor por defecto
    public Colorcito() {
        // No hace falta reasignar nada, el array ya está inicializado arriba
    }

    // Getter y Setter
    public String[] getColores() {
        return colores;
    }

    public void setColores(String[] colores) {
        this.colores = colores;
    }

    // Añadir un nuevo color al final del array
    public void AñadirColor(String nuevoColor) {
        String[] nuevoArray = Arrays.copyOf(colores, colores.length + 1);
        nuevoArray[colores.length] = nuevoColor;
        colores = nuevoArray;
    }

    // Obtener n colores aleatorios sin repetición
    public String[] getColoresAleatorios(int n) {
        if (n > colores.length) {
            System.out.println("Error: No hay suficientes colores.");
            return new String[0];
        }

        // Copiamos el array original
        String[] copia = Arrays.copyOf(colores, colores.length);

        // Mezclamos el array 
        for (int i = copia.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            String temp = copia[i];
            copia[i] = copia[j];
            copia[j] = temp;
        }

        // Devolvemos los primeros n elementos ya mezclados
        return Arrays.copyOf(copia, n);
    }
}
