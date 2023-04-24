package observer;


import java.util.ArrayList;
import java.util.List;

//this is the class that triggers the events
public class ScorerSubject {

    //subject should maintain list of scorecards
    private List<ScoreCardObserver> scoreCards=new ArrayList<ScoreCardObserver>();

    //allowing the observers to subscribe
    public void subscribe(ScoreCardObserver scoreCard){
        scoreCards.add(scoreCard);
    }

    //allowing the observers to unsubscribe
    public void unsubscribe(ScoreCardObserver scoreCard){
        scoreCards.remove(scoreCard);
    }

    //when the mmatchState changes,notify all the observers.
    public void notifyObservers(String matchState){
        for (ScoreCardObserver scoreCard:scoreCards){
            scoreCard.notifyNewDelivery(matchState);
        }
    }



}
