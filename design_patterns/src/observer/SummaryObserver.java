package observer;

public class SummaryObserver implements ScoreCardObserver{

    @Override
    public void notifyNewDelivery(String matchState) {
        System.out.println("updating the summary with new match state : "+matchState);
    }

}
