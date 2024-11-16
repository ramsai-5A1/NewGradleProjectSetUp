public class MobileScreen2 implements IObserver {

    WeatherStation station;

    public MobileScreen2(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        System.out.println("Notified screen-2, updated temperature is: " + this.station.getTemperature());
    }

}
