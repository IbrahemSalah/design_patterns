package observer;

public class ObserverTwo implements IObserver {
    @Override
    public void pushUpdate(int count) {
        System.out.println("First Observer Notified" + count);
    }
}
