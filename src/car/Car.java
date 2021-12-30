package car;

public class Car {
    protected String marque;
    protected String model;
    protected String id;
    protected int position;

    public Car(String marque, String model, String id) {
        this.marque = marque;
        this.model = model;
        this.id = id;
        this.position = position;
    }

    public void move(){
        this.position += 1000;
    }

    @Override
    public String toString() {
        return "Car [" +
                "brand='" + marque + '\'' +
                ", model='" + model + '\'' +
                ", id='" + id + '\'' +
                ", position=" + position + " (km) " +
                ']';
    }
}
