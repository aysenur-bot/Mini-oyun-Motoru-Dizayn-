public class UIObserver implements Observer {
    public void update(String event) {
        System.out.println("UI: " + event);
    }
}