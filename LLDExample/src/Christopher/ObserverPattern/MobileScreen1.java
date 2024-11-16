public class MobileScreen1 implements IObserver {

    WeatherStation station;

    public MobileScreen1(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        System.out.println("Notified screen-1, updated temperature is: " + this.station.getTemperature());
    }

}
