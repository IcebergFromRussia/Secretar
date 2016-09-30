package personnel;

import classes.CurrentState;
import classes.Event;
import classes.Task;

import java.util.Date;
import java.util.List;

/**
 * Created by Albert on 28.09.2016.
 */
public class Supervisor {
     // этот класс будет руководить секретарём и другими
    private Secretary secretary = new Secretary();
    private Diary diary = new Diary();
    private HelperOfSupervisior helper =new HelperOfSupervisior();

    public void proporseEvents(){
        List<Event> list = diary.getEventsByDay(new Date(2016,9,29)); // date поменять потом нужно будет
        // нужно чтобы он был отсортирован
        for(int i=0; !list.get(i+1).equals(null);i++) {
            CurrentState cs = helper.getCurrentState(list.get(0), list.get(1));
            List<Task> tasks = secretary.proposeEvent(cs);
            //метод который отправляет предложения
            // TODO: 29.09.2016 нужно предумать форму предложения тасков


        }

    }

    public void addEvent(Event event){
        diary.addEvent(event);
    }
    public void addTask(Task task){
        secretary.addTask(task);
    }
}
