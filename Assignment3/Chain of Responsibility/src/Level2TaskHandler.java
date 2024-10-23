public class Level2TaskHandler extends TaskHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.MEDIUM) {
            System.out.println("Processing task of Level 2 (medium): " + request.getTask());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
