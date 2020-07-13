package ObserverPattern;

    public interface Players{

        public void register(Observer o);
        public void unregister(Observer o);
        public void notifyObserver();

    }

