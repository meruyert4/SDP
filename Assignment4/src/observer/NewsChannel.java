package observer;

public class NewsChannel implements Observer {
    private String name;
    private String headline;

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(String headline) {
        this.headline = headline;
        System.out.println(name + " received the new headline: " + headline);
    }

    public String getName() {
        return name;
    }
}
