package PlanerTask;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.TreeSet;

public class NoteTask {
    private TreeSet<Task> noteTask;

    public TreeSet<Task> getNoteTask() {
        return noteTask;
    }

    public void setNoteTask(TreeSet<Task> noteTask) {
        this.noteTask = noteTask;
    }

    void writeNoteTask(){
        try (FileWriter writer = new FileWriter("data.json")) {
            ObjectMapper objectMapper = new ObjectMapper();
            String st = objectMapper.writeValueAsString(this);
            writer.write(st);
        }
        catch (Exception e) {
            System.out.println("Error write " + e.getMessage());
        }

    }

    public void readNoteTask() {
        try (FileReader reader = new FileReader("data.json")) {
            BufferedReader rd = new BufferedReader(reader);
            String st = rd.readLine();

            ObjectMapper objectMapper = new ObjectMapper();
            NoteTask note = objectMapper.readValue(st, NoteTask.class);
            this.setNoteTask(note.getNoteTask());
        }
        catch (Exception e) {
            System.out.println("Error read " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "NoteTask{" +
                "noteTask=" + noteTask +
                '}';
    }
}
