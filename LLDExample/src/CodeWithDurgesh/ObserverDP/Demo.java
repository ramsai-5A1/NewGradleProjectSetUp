package CodeWithDurgesh.ObserverDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        YoutubeChannel channel = new YoutubeChannel("TakeUForward");

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Press 1 to upload video");
            System.out.println("Press 2 to create new Subscriber");
            System.out.println("Press 3 to exit the application");

            boolean shouldTerminate = false;
            int option = Integer.parseInt(read.readLine().trim());
            switch (option) {
                case 1:
                    System.out.println("Please enter video title: ");
                    String videoTitle = read.readLine().trim();
                    channel.uploadVideo(videoTitle);
                    break;

                case 2:
                    System.out.println("Please enter the name of subscriber: ");
                    String nameOfSubscriber = read.readLine().trim();
                    Subscriber subscriber = new Subscriber(nameOfSubscriber);
                    channel.subscribe(subscriber);
                    break;

                case 3:
                    shouldTerminate = true;
                    break;

                default:
                    System.out.println("Please enter appropriate option");
            }

            if (shouldTerminate) {
                break;
            }
        }

    }
    
}
