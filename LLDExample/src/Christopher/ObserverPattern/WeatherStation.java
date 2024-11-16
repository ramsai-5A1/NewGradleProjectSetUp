import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {

    int temperature = 98;
    List<IObserver> subscribers;

    public WeatherStation() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void add(IObserver observer) {
        this.subscribers.add(observer);
    }   

    @Override
    public void remove(IObserver observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (IObserver observer: this.subscribers) {
            observer.update();
        }
    }

    public int getTemperature() {
        return this.temperature;
    }

}
