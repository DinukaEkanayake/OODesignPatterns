package observer;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        //scorecards-->observers (subscribers)
        //summary(current score-wickets(overs))
        //batting card
        //bowling card

        //scorer-->Subject(publisher)

        //create subject
        ScorerSubject scorerSubject=new ScorerSubject();

        //create observers
        ScoreCardObserver battingCard=new BattingCardObserver();
        ScoreCardObserver bowlingCard=new BowlingCardObserver();
        ScoreCardObserver summary=new SummaryObserver();

        //subscribe
        scorerSubject.subscribe(battingCard);
        scorerSubject.subscribe(bowlingCard);
        scorerSubject.subscribe(summary);

        scorerSubject.notifyObservers("Bat 1 -> 20,Bat 2 -> 30");

        Thread.sleep(5000);

        scorerSubject.notifyObservers("Bat 1 -> 22,Bat 2 -> 32");

        Thread.sleep(10000);

        scorerSubject.notifyObservers("Bat 1 -> 24,Bat 2 -> 35");


        //1.use a matchstate object instead of using a string as the match state
        //2.Implement a GUI to capture the matchstate data  when click submit trigger subject.notifyobservers()
        //read second chapter of head first design patterns book


    }
}
