package classes;

/**
 * Created by Albert on 28.09.2016.
 */
public class CurrentState {
    // состояние в котором находится пользователь в текущий момент
    // то есть
    // сколько у него есть свободного времени до следующего события,
    // где он сейчас находится
    // куда ему нужно дальше
    // температура на улице
    private Event endedEvent;
    private Event nextEvent;

    public Event getEndedEvent() {
        return endedEvent;
    }

    public void setEndedEvent(Event endedEvent) {
        this.endedEvent = endedEvent;
    }

    public Event getNextEvent() {
        return nextEvent;
    }

    public void setNextEvent(Event nextEvent) {
        this.nextEvent = nextEvent;
    }
    //private time // тип какой?
}
