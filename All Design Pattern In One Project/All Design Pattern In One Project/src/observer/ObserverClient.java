package observer;

public class ObserverClient {

    IObserver observerOne;
    IObserver observerTwo;
    IObserver observerThree;

    CountObservable countObservable;


    public ObserverClient(){
        observerOne = new ObserverOne();
        observerTwo = new ObserverTwo();
        observerThree = new ObserverThree();

        countObservable = new CountObservable();
        countObservable.addObserver(observerOne);
        countObservable.addObserver(observerTwo);
        countObservable.addObserver(observerThree);


        countObservable.incrementCounter();
        countObservable.incrementCounter();
    }
}
