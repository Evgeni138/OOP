package PlanerTask;

import java.text.SimpleDateFormat;
import java.util.*;

public class App {
    public static void main(String[] args) {
        // Заводится три записи
        Task task1 = new Task(
                1, "Task1", Urgency.LOW,
                new GregorianCalendar(2022, 8, 7, 12, 00),
                new GregorianCalendar(2022, 8, 20, 10, 00),
                new Author("Ivan"));

        Task task2 = new Task(
                2, "Task2", Urgency.MIDDLE,
                new GregorianCalendar(2022, 8, 7, 13, 00),
                new GregorianCalendar(2022, 8, 19, 12, 00),
                new Author("Petr"));

        Task task3 = new Task(
                3, "Task3", Urgency.LOW,
                new GregorianCalendar(2022, 8, 7, 13, 00),
                new GregorianCalendar(2022, 8, 19, 12, 00),
                new Author("Viktor"));

        // Добавляются записи во множество TreeSet
        TreeSet<Task> arrayTask = new TreeSet<>();
        arrayTask.add(task1);
        arrayTask.add(task2);
        arrayTask.add(task3);

        // Создается новый планировщик и записывается в файл
        NoteTask noteTask = new NoteTask();
        noteTask.setNoteTask(arrayTask);
        noteTask.writeNoteTask();

        // Планировшик считывается из файла
        noteTask.readNoteTask();

        for (Task task: noteTask.getNoteTask()) {
            System.out.println(task);
        }

    }
}
