package PlanerTask;

import java.text.SimpleDateFormat;
import java.util.Calendar;

// Орисывается класс Task и для добавления задач в TreeSet для сортировки задач, подключаем иньерфейс Comparable


public class Task implements Comparable<Task> {

    private int id;
    private String name;
    private Urgency urgency;
    private Calendar dateRecord;
    private Calendar deadline;
    private Author author;


    public Task() {
    }

    // Описывается конструктор
    public Task(int id, String name, Urgency urgency, Calendar dateRecord, Calendar deadline, Author author) {
        this.id = id;
        this.name = name;
        this.urgency = urgency;
        this.dateRecord = dateRecord;
        this.deadline = deadline;
        this.author = author;
    }

    // Создаются гетеры сетеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Urgency getUrgency() {
        return urgency;
    }

    public void setUrgency(Urgency urgency) {
        this.urgency = urgency;
    }

    public Calendar getDateRecord() {
        return dateRecord;
    }

    public void setDateRecord(Calendar dateRecord) {
        this.dateRecord = dateRecord;
    }

    public Calendar getDeadline() {
        return deadline;
    }

    public void setDeadline(Calendar deadline) {
        this.deadline = deadline;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    // Задактся формат вывода даты
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm d-MM-yyyy");

    // Переопределяется метод toString
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name +
                ", urgency=" + urgency +
                ", author=" + author +
                ", dateRecord='" + dateFormat.format(dateRecord.getTime()) +
                ", deadline='" + dateFormat.format(deadline.getTime()) +
                '}';
    }

    // Переопределяется метод сравнения задач для сортировки в TreeSet
    @Override
    public int compareTo(Task o) {
        if (!this.deadline.equals(o.deadline))
            return this.deadline.compareTo(o.deadline);
        else {
            if (this.urgency == o.urgency) return 0;
            else if (this.urgency == Urgency.HIGH) return -1;
            else if (this.urgency == Urgency.LOW) return 1;
            else if (this.urgency == Urgency.MIDDLE && o.urgency == Urgency.LOW) return -1;
            else return 1;
        }
    }


}
