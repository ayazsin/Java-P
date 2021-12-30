package tennis;

public class UKTennisPlayer implements TennisCapable{

    private boolean playTennis;
    private boolean isInForm;
    private boolean isAvailable;

    private String name;

    public UKTennisPlayer(String name) {
        this.name = name;
    }

    @Override
    public void playTennis() {
        playTennis = true;
    }

    @Override
    public void isInForm() {
        isInForm = true;
    }

    @Override
    public void isAvailable() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return "UKTennisPlayer{" +
                "playTennis=" + playTennis +
                ", isInForm=" + isInForm +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
