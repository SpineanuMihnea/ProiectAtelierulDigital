package ObserverPattern;


    import java.util.ArrayList;



    public class getScore implements Players{

        private ArrayList<Observer> observers;


        private double Score1;
        private double Score2;
        private double Score3;

        public getScore(){
            observers = new ArrayList<Observer>();
        }

        public void register(Observer newObserver) {
            observers.add(newObserver);
        }

        public void unregister(Observer deleteObserver) {

            int observerIndex = observers.indexOf(deleteObserver);

            System.out.println("Player " + (observerIndex+1) + " deleted");


            observers.remove(observerIndex);

        }

        public void notifyObserver() {


            for(Observer observer : observers){

                observer.update(Score1, Score2, Score3);

            }
        }



        public void setScore1(double newScore1){

            this.Score1 = newScore1;

            notifyObserver();

        }

        public void setScore2(double newScore2){

            this.Score2 = newScore2;

            notifyObserver();

        }

        public void setScore3(double newScore3){

            this.Score3 = newScore3;

            notifyObserver();

        }

    }

