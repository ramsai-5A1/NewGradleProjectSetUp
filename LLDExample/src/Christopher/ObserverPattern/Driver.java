public class Driver {

    public static void main(String[] args) {
        WeatherStation observable = new WeatherStation();
        IObserver observer1 = new MobileScreen1(observable);
        IObserver observer2 = new MobileScreen2(observable);
        observable.add(observer1);
        observable.add(observer2);
        observable.notifyAllObservers();
    }

}
