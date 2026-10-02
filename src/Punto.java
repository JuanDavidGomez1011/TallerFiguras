public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void desplazar(double dx, double dy) {
        x = x + dx;
        y = y + dy;
    }

    public void escalar(double factor) {
        x = x * factor;
        y = y * factor;
    }

    public double distancia(Punto otro) {

        return Math.sqrt(
            Math.pow(x - otro.x, 2)
            + Math.pow(y - otro.y, 2)
        );
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}