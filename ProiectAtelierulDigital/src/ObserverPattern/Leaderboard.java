package ObserverPattern;

    public class Leaderboard implements Observer {

        private double Score1;
        private double Score2;
        private double Score3;

        private static int observerIDTracker = 0;

        private int observerID;

        private Players getScore;

        public Leaderboard(Players getScore){

            this.getScore = getScore;

            this.observerID = ++observerIDTracker;

            System.out.println("New Player " + this.observerID);

            getScore.register(this);

        }

        public void update(double Score1, double Score2, double Score3) {

            this.Score1 = Score1;
            this.Score2 = Score2;
            this.Score3 = Score3;

            printScores();

        }

        public void printScores(){

            System.out.println(observerID + "\nKills " + Score1 + "\nHeadShots " +
                    Score2 + "\nDeaths " + Score3 + "\n");

        }


}
