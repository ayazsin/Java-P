package car;

public class SportCar extends Car{

    int speedValue;


    public SportCar(String marque, String model, String id, int speedValue) {
        super(marque, model, id);
        this.speedValue = speedValue;
    }

    @Override
    public void move() {
        super.move();
        this.position += this.position * 0.1;
    }

    @Override
    public String toString() {
        return super.toString() + " SportCar [speedValue = " + speedValue + "]" ;
    }
}
