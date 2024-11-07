package CodeWithDurgesh.ObserverDP;

import java.util.ArrayList;
import java.util.List;

class YoutubeChannel implements Subject {

    String channelName;
    List<Observer> subscribers = new ArrayList<>();

    YoutubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Observer observer) {
        this.subscribers.add(observer);
        System.out.println("New subscriber subscribed to " + this.channelName + "'s Youtube channel");
    }

    @Override
    public void unSubscribe(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void uploadVideo(String title) {
        for (Observer observer: this.subscribers) {
            observer.notified(title);
        }
    }
    
}
