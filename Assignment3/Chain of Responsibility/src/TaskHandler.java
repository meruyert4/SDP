public abstract class TaskHandler {
    protected TaskHandler nextHandler;

    public void setNextHandler(TaskHandler handler) {
        this.nextHandler = handler;
    }

    public abstract void handleRequest(Request request);
}
