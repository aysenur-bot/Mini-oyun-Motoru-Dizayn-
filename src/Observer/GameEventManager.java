import java.util.*;

public class GameEventManager {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void notifyAllObservers(String event) {
        for (Observer o : observers) {
            o.update(event);
        }
    }
}