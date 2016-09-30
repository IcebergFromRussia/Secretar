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

    private List<Task> tasks=null; //пусть секретарь хранит таски


    // предложить ивент
    // у таска есть какой-то приоритет, есть время, до которого он должен что-то сделать
    // если таск имеет приоритет низкий, но сделать его нужно до завтра, а есть такс с высоким приоритетом, но сделать его нужно до следующей недели.
    // что нужно делать?
    public List<Task> proposeEvent( CurrentState cs){
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

    public void addTask(Task task){

    }
}
