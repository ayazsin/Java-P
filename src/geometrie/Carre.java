package geometrie;

public class Carre extends Forme{
    private double length;

    public Carre(double x, double y, double length) {
        super(x, y);
        this.length = length;
    }

    @Override
    public double perimetre() {
        return this.length * 4;
    }

    @Override
    public double aire() {
        return length * length;
    }

    @Override
    public String toString() {
        return "Carre{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", length=" + length +
                ", perimeter=" + perimetre() +
                ", aire=" + aire() +
                '}';
    }


}
