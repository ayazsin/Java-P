package geometrie;

public abstract class Forme {

    private double x;
    private double y;

    public Forme(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public abstract double perimetre();
    public abstract double aire();

    public void move(double x, double y) {
        this.x += x;
        this.y += y;
        if (this.x>100 || this.y>100)
            try {
                throw (new Exception("Out of limit"));
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
    }



}
