public abstract class FiguraGeometrica {

    private String tipo;

    protected Punto[] puntos;

    public FiguraGeometrica(
        String tipo,
        int cantidadPuntos
    ) {

        this.tipo = tipo;
        this.puntos =
            new Punto[cantidadPuntos];
    }

    public String getTipo() {
        return tipo;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public abstract double dimensionar();

    public abstract void desplazar(
        double x,
        double y
    );

    public abstract void escalar(
        double factor
    );

    @Override
    public String toString() {

        return
            "Tipo: " + tipo
            + "\nArea: " + calcularArea()
            + "\nPerimetro: "
            + calcularPerimetro()
            + "\nDimensionar: "
            + dimensionar();
    }
}