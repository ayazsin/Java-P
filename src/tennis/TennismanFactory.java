package tennis;

public class TennismanFactory {
    private TennisCapable player;

       public  TennismanFactory () {

           int numPlayer = (int) (Math.random() * 3) + 1;
           switch (numPlayer) {
               case 1:
                   player = new USTennisPlayer("US");
                   break;
               case 2:
                   player = new UKTennisPlayer("UK");
                   break;
               case 3:
                   player = new EUTennisPlayer("EU");
                   break;
           }

           player.isAvailable();
           player.playTennis();
           player.isInForm();

       }

       public TennisCapable getPlayer() {
           return this.player;
       }

    @Override
    public String toString() {
        return player.toString();
    }
}
