package personnel;

import classes.CurrentState;
import classes.Event;
import classes.Task;

import java.util.List;

/**
 * Created by Albert on 28.09.2016.
 */
public class HelperOfSecretary {
    //выполняет грязную работу секретаря

    public List<Task> getProporsedTasks(List<Task> tasks, CurrentState cs){
        //отсеить вещи, которыми заниматься не стоит точно, определяется по текущему состоянию
        // в будущем нужно будет предусмотреть, что в распоряжении человека есть какие-то ресурсы
        // в зависимости от местоположения человеку не стоит предлогать полить цветы, например.

        return tasks;
    }
}
