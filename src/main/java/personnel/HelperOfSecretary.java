package personnel;

import classes.CurrentState;
import classes.Event;
import classes.Suggestion;
import classes.Task;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Albert on 28.09.2016.
 */
public class HelperOfSecretary {
    //выполняет грязную работу секретаря

    public Suggestion getProporsedTasks(List<Task> tasks, CurrentState cs){
        //отсеить вещи, которыми заниматься не стоит точно, определяется по текущему состоянию
        // в будущем нужно будет предусмотреть, что в распоряжении человека есть какие-то ресурсы
        // в зависимости от местоположения человеку не стоит предлогать полить цветы, например.
        Suggestion suggestion = new Suggestion();
        suggestion.setCs(cs);
        LinkedList<Task> nTask = new LinkedList<Task>();
        for (Task task: tasks) {
            if(matches(task,cs)){
                nTask.add(task);
            }
        }
        suggestion.setTasks(nTask);
        return suggestion;
    }
    // пока проверяет по времени
    public boolean matches(Task task, CurrentState cs){
        //проверяет подходит ли таск под данную ситуацию
        long time = cs.getNextEvent().getDate().getMinute() - cs.getEndedEvent().getDate().getMinute(); //время между ивентами
        time-=timeOnTheRoad(cs.getEndedEvent().getLocation(),task.getLocation())
                +timeOnTheRoad(cs.getNextEvent().getLocation(),task.getLocation());//с учетом времени в дороге

        if(task.getTime()!=time){
            return false;
        }
        return true;
    }

    private long timeOnTheRoad(String location1, String location2){
        //как-то определяем время в дороге
        return 0l;
    }
}
