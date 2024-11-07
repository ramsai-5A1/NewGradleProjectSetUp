package CodeWithDurgesh.ObserverDP;

class Subscriber implements Observer {
    String name;

    Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notified(String title) {
        System.out.println(title + " video upload notification sent to " + this.name);
    }
}
