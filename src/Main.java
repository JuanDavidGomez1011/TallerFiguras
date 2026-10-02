public class Main {

    public static void main(String[] args) {

        Circulo circulo =
            new Circulo(
                new Punto(0, 0),
                5
            );

        Triangulo triangulo =
            new Triangulo(
                5,
                3,
                4
            );

        System.out.println(
            circulo
        );

        System.out.println(
            "\n--------------------\n"
        );

        System.out.println(
            triangulo
        );
    }
}