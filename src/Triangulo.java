public class Circulo
        extends FiguraGeometrica {

    private double radio;
    private Punto centro;

    public Circulo(
        Punto centro,
        double radio
    ) {

        super(
            "Circulo",
            1
        );

        if (radio <= 0) {
            throw new IllegalArgumentException(
                "El radio debe ser mayor que 0"
            );
        }

        this.centro = centro;
        this.radio = radio;

        puntos[0] = centro;
    }

    @Override
    public double calcularArea() {

        return Math.PI
            * radio
            * radio;
    }

    @Override
    public double calcularPerimetro() {

        return 2
            * Math.PI
            * radio;
    }

    @Override
    public double dimensionar() {

        return calcularArea();
    }

    @Override
    public void desplazar(
        double x,
        double y
    ) {

        centro.desplazar(
            x,
            y
        );
    }

    @Override
    public void escalar(
        double factor
    ) {

        if (factor <= 0) {
            throw new IllegalArgumentException(
                "El factor debe ser mayor que 0"
            );
        }

        centro.escalar(
            factor
        );

        radio =
            radio * factor;
    }

    @Override
    public String toString() {

        return super.toString()
            + "\nCentro: "
            + centro
            + "\nRadio: "
            + radio;
    }
}