package CodeWithDurgesh.ObserverDP;

interface Subject {

    void subscribe(Observer observer);
    void unSubscribe(Observer observer);
    void uploadVideo(String title);
}
