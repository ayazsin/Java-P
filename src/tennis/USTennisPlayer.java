package tennis;

public class USTennisPlayer implements TennisCapable{

    private boolean playTennis;
    private boolean isInForm;
    private boolean isAvailable;

    private String name;

    public USTennisPlayer(String name) {
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
        return "USTennisPlayer{" +
                "playTennis=" + playTennis +
                ", isInForm=" + isInForm +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
