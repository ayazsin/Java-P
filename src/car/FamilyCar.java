package car;

public class FamilyCar extends Car{

    int seats;

    public FamilyCar(String marque, String model, String id, int seats) {
        super(marque, model, id);
        this.seats = seats;
    }


    @Override
    public String toString() {
        return super.toString() + " FamilyCar [seats = " + seats + "]" ;
    }
}
