package observer;

//This is the observer interface
public interface ScoreCardObserver {

    //a method use to communicate about new events to the observer

    // TODO: use an object as the match state
    void notifyNewDelivery(String matchState);//Here event is matchState

}
