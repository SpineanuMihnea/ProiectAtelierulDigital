package ObserverPattern;

import java.text.DecimalFormat;

public class GetTheScore implements Runnable{

    private String score;
    private double points;


    private Players getScore;

    public GetTheScore(Players getScore, int newStartTime, String newScore, double newPoints){

        this.getScore = getScore;


        score = newScore;
        points = newPoints;

    }

    public void run(){

        for(int i = 1; i <= 20; i++){

            try{

                Thread.sleep(2000);

            }
            catch(InterruptedException e)
            {}

            double randNum = Math.random();

            DecimalFormat df = new DecimalFormat("#");

            points = Double.valueOf(df.format((points + randNum)));

            if(score == "Kills") ((getScore) getScore).setScore1(points);
            if(score == "HeadShots") ((getScore) getScore).setScore2(points);
            if(score == "Deaths") ((getScore) getScore).setScore3(points);

            System.out.println(score + ": " + df.format((points + randNum)));

        }
    }

}