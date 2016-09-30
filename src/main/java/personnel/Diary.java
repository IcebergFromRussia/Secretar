package personnel;

import classes.Event;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Albert on 27.09.2016.
 */
public class Diary {

    private LinkedList<Event> events = new LinkedList<Event>(); //удалить потом

    public List<Event> getEvents(){
        return null;
    }
    public List<Event> getEventsByDay(Date date){
        return null;
    }

    public void addEvent(Event event){
            events.add(event);//пока так
    }
    // думаю, что лучше каждому event-у давать id чтобы по нему удалять, можно идентифицировать по паре (user, id)
    public void deleteEvent(){

    }

}
