package tennis;

public class Runner {

    public static void main(String[] args) {
//        TennismanFactory playerChoosen = new TennismanFactory();
//        playerChoosen.getPlayer();
//
//        System.out.println(playerChoosen);



        Team<UKTennisPlayer> ukTennisPlayerTeam = new Team<>("Galatasaray");
        ukTennisPlayerTeam.addPlayer(new UKTennisPlayer("UK1"));
        ukTennisPlayerTeam.addPlayer(new UKTennisPlayer("UK2"));


       

        System.out.println(ukTennisPlayerTeam);

    }


}
