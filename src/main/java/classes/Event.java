package classes;

import java.sql.Date;
import java.util.List;
import java.time.LocalDateTime;


/**
 * Created by Albert on 27.09.2016.
 */
public class Event {
    private LocalDateTime date; //время
    private String comment; // описание
    private String location; // местоположение
    private long prodolgitelnost;// крч траyслит, я заебался, потом rename сделаю. в миллисекундах наверн лучше мерить
    //дальше конструктор гетеры и сетеры
    private List<Task> list;
    public Event(LocalDateTime date, String comment, String location, long prodolgitelnost) {
        this.date = date;
        this.comment = comment;
        this.location = location;
        this.prodolgitelnost = prodolgitelnost;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getProdolgitelnost() {
        return prodolgitelnost;
    }

    public void setProdolgitelnost(long prodolgitelnost) {
        this.prodolgitelnost = prodolgitelnost;
    }
}
