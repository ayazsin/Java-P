package geometrie;

public class Rectangle extends Forme{
    private double length;
    private double width;

    public Rectangle(double x, double y, double length, double width) {
        super(x, y);
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimetre() {
        return (this.length + this.width) * 2;
    }

    @Override
    public double aire() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", length=" + length +
                ", width=" + width +
                ", perimeter=" + perimetre() +
                ", aire=" + aire() +
                '}';
    }
}
