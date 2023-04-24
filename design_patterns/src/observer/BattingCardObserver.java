package observer;

public class BattingCardObserver implements ScoreCardObserver{


    @Override
    public void notifyNewDelivery(String matchState) {
        System.out.println("updating the batting card with new match state : "+matchState);
    }
}
