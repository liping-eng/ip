public class Task {
    protected String description;
    protected boolean isDone;


    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public boolean isDone() {
        return isDone;
    }

    public String getDescription() {
        return description;
    }

    public String getStatusIcon(boolean isDone) {
        return (isDone ? "[\u2713] " : "[ ] "); //return tick or X symbols
    }

    public void setDone() {
        isDone = true;
    }

    @Override
    public String toString() {
        return getStatusIcon(isDone) + description;
    }
}