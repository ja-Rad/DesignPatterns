package patterns.behavioral.observer.challenge;

public interface Observer {
    public void update(int runs, int wickets, float overs);
}

class AverageScoreDisplay implements Observer {
    private float runRate;
    private int predictedScore;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runRate = (float) runs / overs;
        this.predictedScore = (int) (this.runRate * 50);
        System.out.println("AverageScoreDisplay: " + "Run Rate: " + runRate + " || Predicted Score: " + predictedScore);
    }
}

class CurrentScoreDisplay implements Observer {
    private int runs;
    private int wickets;
    private float overs;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;

        System.out.println("CurrentScoreDisplay: " + "Runs: " + runs + " || Wickets: " + wickets + " || Overs: " + overs);
    }
}
