package observer;

import java.util.ArrayList;
import java.util.List;

public class CountObservable implements IObservable{
    List<IObserver> observerList;
    int count;

    public CountObservable(){
        count =0;
        observerList = new ArrayList<>();
    }

    public void incrementCounter(){
        count++;
        publish();
    }

    @Override
    public void addObserver(IObserver iObserver) {
        observerList.add(iObserver);
    }

    @Override
    public void removeObserver(IObserver iObserver) {
        observerList.remove(iObserver);
    }

    @Override
    public void publish() {
        for (IObserver observer: observerList) {
            observer.pushUpdate(count);
        }
    }
}
