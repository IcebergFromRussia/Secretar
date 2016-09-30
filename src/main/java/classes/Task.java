package classes;

import java.sql.Date;
import java.time.LocalDateTime;

/**
 * Created by Albert on 27.09.2016.
 */
public class Task {
    private double sum; // предпологаемые рассходы
    private LocalDateTime date; // срок
    private String comment;
    private byte prioritet;//
    private String theam; //но думаю, что лучше здесь делать enum, но пока пусть будет так.
    private boolean bool; //можно ли разбивать задание на части, выполнить часть, выполнить вторую часть потом (например)
    private double time; // предпологаемое время на выполнения задания
    //накопить денег ()
    //поездки
    //самосовершенствие
    //досуг ()

    public Task(LocalDateTime date, double sum, String comment, byte prioritet, String theam) {

        this.date = date;
        this.sum = sum;
        this.comment = comment;
        this.prioritet = prioritet;
        this.theam = theam;
    }



    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
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

    public byte getPrioritet() {
        return prioritet;
    }

    public void setPrioritet(byte prioritet) {
        this.prioritet = prioritet;
    }

    public String getTheam() {
        return theam;
    }

    public void setTheam(String theam) {
        this.theam = theam;
    }
}
