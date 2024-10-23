public class Level3TaskHandler extends TaskHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.HIGH) {
            System.out.println("Processing task of Level 3 (high): " + request.getTask());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
