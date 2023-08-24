package patterns.behavioral.observer.challenge;

public class Client {
    public static void main(String[] args) {
        // create objects for testing
        Observer averageScoreDisplay = new AverageScoreDisplay();
        Observer currentScoreDisplay = new CurrentScoreDisplay();

        // pass the display to cricket data
        CricketData cricketData = new CricketData();

        // register display elements
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreDisplay);


        // in real app you have some logic to call this function when data changes
        cricketData.dataChanged();
        /*
            AverageScoreDisplay: Run Rate: 8.823529 || Predicted Score: 441
            CurrentScoreDisplay: Runs: 90 || Wickets: 2 || Overs: 10.2
         */


        // remove an observer
        cricketData.unregisterObserver(averageScoreDisplay);

        // now only currentScoreDisplay gets the notification
        cricketData.dataChanged();
        /*
            CurrentScoreDisplay: Runs: 90 || Wickets: 2 || Overs: 10.2
         */
    }
}
