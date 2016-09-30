import classes.Event;
import classes.Task;
import personnel.Supervisor;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by Albert on 28.09.2016.
 */
public class Start {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor();
        //Поход в театр, 18:00, Театр оперы и балета им. М. Джалиля, 110 минут
        LocalDate date= LocalDate.of(2016, 10, 1);
        LocalTime time= LocalTime.of(10, 00);
        supervisor.addEvent(new Event(  LocalDateTime.of(date,time),"1","вуз",90));
        time=time.ofSecondOfDay(180*60);
        supervisor.addEvent(new Event(  LocalDateTime.of(date,time),"2","кольцо",90));
        time=time.ofSecondOfDay(180*60);
        supervisor.addEvent(new Event(  LocalDateTime.of(date,time),"3","Гум",30));
        time=time.ofSecondOfDay(180*60);
        supervisor.addEvent(new Event(  LocalDateTime.of(date,LocalTime.of(18, 00)),"4","Театр оперы и балета им. М. Джалиля",110));

        date= date.ofEpochDay(2);
        supervisor.addTask(new Task( LocalDateTime.of(date,LocalTime.of(0, 00)),350,"почитать книгу",((byte) 2),"развитие"));
        date= date.ofEpochDay(2);
        supervisor.addTask(new Task( LocalDateTime.of(date,LocalTime.of(0, 00)),500,"купить корм для кота",((byte) 1),"быт"));
        date= date.ofEpochDay(2);
        supervisor.addTask(new Task( LocalDateTime.of(LocalDate.of(2016, 10, 1),LocalTime.of(23, 00)),1000,"сделать какую-то хуету",((byte) 3),"хуета"));

    }
}
