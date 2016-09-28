package personnel;
import classes.CurrentState;
import classes.Event;
import classes.Task;

import java.util.List;

/**
 * Created by Albert on 27.09.2016.
 */
public class Secretary {
    // Секретарь- манипуляции с событиями

    //выполняет грязную работу секретаря
    HelperOfSecretary helper= new HelperOfSecretary();
    public void addEvent(){

    }
    // думаю, что лучше каждому event-у давать id чтобы по нему удалять, можно идентифицировать по паре (user, id)
    public void deleteEvent(){

    }
    // предложить ивент
    public List<Task> proposeEvent(List<Task> tasks, CurrentState cs){
        // приходит текущее состояние, понять какой таск лучше предложить
        // TODO: 28.09.2016 нужно добавить отсортированный список заданий по приоритетам и времени 

        //метод, который выдаёт список предлагаемых тасков
        List<Task> listOfProporsedTasks=helper.getProporsedTasks(tasks, cs);

        return listOfProporsedTasks;
    }

    // предложить task
    public List<Task> proposeTask(){
        return null;
    }

}
