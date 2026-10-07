import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Circulo circulo1 =
            new Circulo(
                new Punto(0, 0),
                5
            );

        Circulo circulo2 =
            new Circulo(
                new Punto(2, 2),
                3
            );

        Triangulo triangulo =
            new Triangulo(
                5,
                3,
                4
            );

        Cuadrilatero cuadrilatero =
            new Cuadrilatero(
                4
            );

        PentagonoRegular pentagono =
            new PentagonoRegular(
                2.75,
                4
            );

        ControladorFigura controlador =
            new ControladorFigura();

        controlador.agregarFigura(
            circulo1
        );

        controlador.agregarFigura(
            circulo2
        );

        controlador.agregarFigura(
            triangulo
        );

        controlador.agregarFigura(
            cuadrilatero
        );

        controlador.agregarFigura(
            pentagono
        );

        System.out.println(
            "===== INFORMACION ====="
        );

        mostrar(circulo1);
        mostrar(triangulo);
        mostrar(cuadrilatero);
        mostrar(pentagono);

        System.out.println(
            "\n===== COMPARACION ====="
        );

        System.out.println(
            controlador.compararFiguras(
                circulo1,
                circulo2
            )
        );

        System.out.println(
            "\n===== DESPLAZAMIENTO ====="
        );

        circulo1.desplazar(
            2,
            3
        );

        System.out.println(
            circulo1
        );

        System.out.println(
            "\n===== ESCALAMIENTO ====="
        );

        triangulo.escalar(
            2
        );

        System.out.println(
            triangulo
        );

        System.out.println(
            "\n===== DIMENSION INVALIDA ====="
        );

        try {

            new Circulo(
                new Punto(0, 0),
                0
            );

        } catch (
            IllegalArgumentException e
        ) {

            System.out.println(
                e.getMessage()
            );
        }

        System.out.println(
            "\n===== COMPARACION INVALIDA ====="
        );

        System.out.println(
            controlador.compararFiguras(
                circulo1,
                triangulo
            )
        );

        abrirVentana(
            controlador
        );
    }

    public static void mostrar(
        FiguraGeometrica figura
    ) {

        System.out.println(
            "\n--------------------"
        );

        System.out.println(
            figura
        );
    }

    public static void abrirVentana(
        ControladorFigura controlador
    ) {

        String[] opciones = {
            "Mostrar figuras",
            "Comparar dos circulos",
            "Salir"
        };

        while (true) {

            String opcion =
                (String)
                JOptionPane.showInputDialog(

                    null,

                    "Seleccione una opcion",

                    "Figuras geometricas",

                    JOptionPane.QUESTION_MESSAGE,

                    null,

                    opciones,

                    opciones[0]
                );

            if (
                opcion == null
                || opcion.equals("Salir")
            ) {

                break;
            }

            if (
                opcion.equals(
                    "Mostrar figuras"
                )
            ) {

                String informacion = "";

                for (
                    FiguraGeometrica figura :
                    controlador.getListaFiguras()
                ) {

                    informacion +=
                        figura
                        + "\n\n";
                }

                JOptionPane.showMessageDialog(
                    null,
                    informacion
                );
            }

            if (
                opcion.equals(
                    "Comparar dos circulos"
                )
            ) {

                FiguraGeometrica figura1 =
                    controlador.getListaFiguras()
                    .get(0);

                FiguraGeometrica figura2 =
                    controlador.getListaFiguras()
                    .get(1);

                JOptionPane.showMessageDialog(

                    null,

                    controlador.compararFiguras(
                        figura1,
                        figura2
                    )
                );
            }
        }
    }
}