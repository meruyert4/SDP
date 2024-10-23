class Request {
    private String task;
    private Priority priority;

    public Request(String task, Priority priority){
        this.task = task;
        this.priority = priority;
    }

    public String getTask(){
        return task;
    }

    public Priority getPriority(){
        return priority;
    }
}

enum Priority {
    LOW, MEDIUM, HIGH;
}