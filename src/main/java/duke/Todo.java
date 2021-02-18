package duke;

public class Todo extends Task {

    public Todo(String description) {
        super(description);
    }

    @Override
    public String getDescription() {
        return "T" + "|" + (isDone ? "1" : "0") + "|" + this.description;
    }
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
