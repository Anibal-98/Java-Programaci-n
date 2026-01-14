package colorete;

public class Main {

    public static void main(String[] args) {
        Colorcito c = new Colorcito();

        c.AñadirColor("Cian");
        c.AñadirColor("Magenta");

        String[] aleatorios = c.getColoresAleatorios(4);

        for (String color : aleatorios) {
            System.out.println(color);
        }
    }
}
