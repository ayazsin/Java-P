package geometrie;

public class Disque extends Forme{

    private double rayon;

    public Disque(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }


    @Override
    public double perimetre() {
        return this.rayon * 2 * Math.PI;
    }

    @Override
    public double aire() {
        return Math.pow(this.rayon,2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Disque{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", rayon=" + rayon +
                ", perimeter=" + perimetre() +
                ", aire=" + aire() +
                '}';
    }
}
