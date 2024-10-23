package observer;

public interface Observable { //defines methods to add, remove, and notify observers
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
