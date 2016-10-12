package classes;

import java.util.List;

/**
 * Created by Albert on 11.10.2016.
 */
public class Suggestion {
    private List<Task> tasks;
    private CurrentState cs;

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public CurrentState getCs() {
        return cs;
    }

    public void setCs(CurrentState cs) {
        this.cs = cs;
    }
}
