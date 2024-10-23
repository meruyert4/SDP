public class Level1TaskHandler extends TaskHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.LOW) {
            System.out.println("Processing task of Level 1 (low): " + request.getTask());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
