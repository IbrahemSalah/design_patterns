package observer;

public class ObserverOne implements IObserver {
    @Override
    public void pushUpdate(int count) {
        System.out.println("First Observer Notified" + count);
    }
}