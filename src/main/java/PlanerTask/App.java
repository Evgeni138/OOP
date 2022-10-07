package PlanerTask;

import java.text.SimpleDateFormat;
import java.util.*;

public class App {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm d-MM-yy");
        Task task1 = new Task(
                1, "Task1", 1,
                new GregorianCalendar(2022, 8, 7, 12, 00),
                new GregorianCalendar(2022, 8, 20, 10, 00),
                "Ivan");
        System.out.println(task1);
        Task task2 = new Task(
                2, "Task2", 2,
                new GregorianCalendar(2022, 8, 7, 13, 00),
                new GregorianCalendar(2022, 8, 19, 12, 00),
                "Petr");
        System.out.println(task2);
        Task task3 = new Task(
                3, "Task3", 3,
                new GregorianCalendar(2022, 8, 7, 13, 00),
                new GregorianCalendar(2022, 8, 19, 12, 00),
                "Viktor");
        System.out.println(task3);

        System.out.println(task2.compareTo(task3));
        TreeSet<Task> arrayTask = new TreeSet<>();
        arrayTask.add(task1);
        arrayTask.add(task2);
        arrayTask.add(task3);
        System.out.println("before: " + arrayTask);
//        Collections.sort(arrayTask);

        NoteTask noteTask = new NoteTask();
        noteTask.setNoteTask(arrayTask);
        noteTask.writeNoteTask();

//        NoteTask noteTask_out = new NoteTask();
        noteTask.readNoteTask();
        System.out.println(noteTask);
        System.out.println("after: " + noteTask.getNoteTask());
        for (Task task: noteTask.getNoteTask()) {
            System.out.println(task);
        }

//        System.out.println(noteTask.getNoteTask().get(1).compareTo(noteTask.getNoteTask().get(0)));


    }
}
