package ObserverPattern;

//Aceasta este o aplicatie unde pattern-ul Observer este folosit in creearea unui leaderboard in care se tine evidenta scorurilor mai multor jucatori

public class Main{

        public static void main(String[] args){

            getScore getScore = new getScore();

            Leaderboard observer1 = new Leaderboard(getScore);

            getScore.setScore1(19);
            getScore.setScore2(6);
            getScore.setScore3(6);

            Leaderboard observer2 = new Leaderboard(getScore);

            getScore.setScore1(19);
            getScore.setScore2(6);
            getScore.setScore3(6);


            getScore.unregister(observer2);

            getScore.setScore1(19);
            getScore.setScore2(6);
            getScore.setScore3(6);

            Runnable getScore1 = new GetTheScore(getScore, 2, "Kills", 19);
            Runnable getScore2 = new GetTheScore(getScore, 2, "HeadShots", 6);
            Runnable getScore3 = new GetTheScore(getScore, 2, "Deaths", 6);


            new Thread(getScore1).start();
            new Thread(getScore2).start();
            new Thread(getScore3).start();


        }

    }

