package observer;

public class NewsChannel implements Observer {
    private String channelName;

    public NewsChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void update(String headline) {
        System.out.println(channelName + " received headline: " + headline);
    }
}
